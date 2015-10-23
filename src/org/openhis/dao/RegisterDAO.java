package org.openhis.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.openhis.entites.Patient;





public class RegisterDAO {

	public boolean save(Patient pat){
		EntityTransaction et=null;
            try{
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("openhisPU");
                EntityManager em= emf.createEntityManager();
                et= em.getTransaction();
                et.begin();
                em.persist(pat);
                et.commit();
                System.out.println("Insertion successfully");
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                et.rollback();
            }
            return false;
      }
}
