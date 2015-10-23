package org.openhis.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.openhis.entites.Personnel;

public class AdminDAO {
	
	
	
	public boolean modifyProfile(Personnel p, HttpServletRequest req){
		try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("openhisPU");
            EntityManager em= emf.createEntityManager();
            EntityTransaction et= em.getTransaction();
            et.begin();
            Query findUser = em.createQuery("SELECT p FROM  Personnel p WHERE  p.compte = :compte AND p.password = :password ");
            findUser.setParameter("compte", p.getCompte());
            findUser.setParameter("password", p.getPassword());
            Personnel entity = (Personnel)findUser.getSingleResult();
            entity.setAdresse(p.getAdresse());
            entity.setAge(p.getAge());
            entity.setCode_postale(p.getCode_postale());
            entity.setCompte(p.getCompte());
            entity.setDate_naissance(p.getDate_naissance());
            entity.setNom(p.getNom());
            entity.setNum_telephone(p.getNum_telephone());
            entity.setPassword(p.getPassword());
            entity.setPays(p.getPays());
            entity.setPrenom(p.getPrenom());
            entity.setSexe(p.getSexe());
            entity.setVille(p.getVille());
            //em.persist(p);
            et.commit();   
            HttpSession session=req.getSession();
            session.setAttribute("type", entity.getClass().toString().split(" ")[1] );
            session.setAttribute("user", entity);                
            System.out.println("Profile successfully modify");
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            System.err.println("Problem when attempt to modify user profile");
        }
        return false;
		
	}

}
