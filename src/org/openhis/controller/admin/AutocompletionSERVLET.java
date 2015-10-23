package org.openhis.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.openhis.entites.Patient;
import org.openhis.entites.Personnel;

/**
 * Servlet implementation class AutocompletionSERVLET
 */
@WebServlet("/AutocompletionSERVLET")
public class AutocompletionSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AutocompletionSERVLET() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ENTER***SUGGEST SERVLET");
		String search = request.getParameter("nom");
		if(search.trim() == "")
			return;
		try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("openhisPU");
            EntityManager em= emf.createEntityManager();
            EntityTransaction et= em.getTransaction();
            et.begin();
            Query findUser = em.createQuery("SELECT p FROM  Personnel p  WHERE  p.nom LIKE :nom");
            Query findPatient = em.createQuery("SELECT pt FROM  Patient pt  WHERE  pt.nom = :nom");
            findUser.setParameter("nom", search + "%");
            findPatient.setParameter("nom", search + "%");
           
            PrintWriter out = response.getWriter();

            int compt=0;
            try{
            	List<Personnel> user = findUser.getResultList();
            	for(Personnel u:user){
                	System.out.println(u.getNom());
                	out.println("<tr id='element'><td>" + u.getNom() + "</td></tr>");  	
                }
            }
            catch(Exception e){
                e.printStackTrace();
                System.err.println(" Personnel  not found");
            }
            try{
                List<Patient> patient = findPatient.getResultList();
                for(Patient u:patient){
                	System.out.println(u.getNom());
                	out.println("<tr><td id='element'>" + u.getNom() + "</td></tr>");  	
                }
            }
            catch(Exception e){
                e.printStackTrace();
                System.err.println(" Personnel  not found");
            }
            out.flush();
            et.commit();
            
                       
        }
        catch(Exception e){
            e.printStackTrace();
            System.err.println(" Personne  not found");
        }
        
		
	}

	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
