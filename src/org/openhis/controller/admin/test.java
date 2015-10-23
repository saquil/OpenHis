package org.openhis.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openhis.entites.Visite;

/**
 * Servlet implementation class test
 */
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*EntityManager em=Persistence.createEntityManagerFactory("openhisPU").createEntityManager();
		
		em.getTransaction().begin();
		Receptioniste r=new Receptioniste();
		r.setCompte("saquil");
		r.setPassword("saquil");
		em.persist(r);
		Service s=new Service();
		s.setNom("reception");
		em.persist(s);
		s=new Service();
		s.setNom("radiologie");
		em.persist(s);
		em.getTransaction().commit();*/
		ArrayList<Visite>v=new ArrayList<Visite>();
		System.out.println(v.size());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
