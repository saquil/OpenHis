package org.openhis.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.openhis.entites.Personne;
import org.openhis.entites.Personnel;
import org.openhis.entites.Receptioniste;


public class LoginDAO {
    private HttpServletRequest req;

    public LoginDAO() {
    }
    
    public LoginDAO(HttpServletRequest request){
        this.req=request;
    }

	
	public boolean exist(String compte,String password){
            try{
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("openhisPU");
                EntityManager em= emf.createEntityManager();
                EntityTransaction et= em.getTransaction();
                et.begin();
                Query findUser = em.createQuery("SELECT p FROM  Personnel p WHERE  p.compte = :compte AND p.password = :password ");
                findUser.setParameter("compte", compte);
                findUser.setParameter("password", password);
                Personnel p = (Personnel)findUser.getSingleResult();

                et.commit();
                System.out.println(p.getNom() + " *type:* " + (p.getClass()).toString());
                
                HttpSession session=req.getSession();
                session.setAttribute("type", "admin");
                session.setAttribute("user", p);                
                System.out.println("Select successfully");
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                System.err.println("User not found");
            }
            return false;
     }
        
}
