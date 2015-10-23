package org.openhis.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.openhis.entites.Patient;
import org.openhis.entites.Visite;

public class PatientDAO {

	EntityManagerFactory emf;
	public PatientDAO() {
		// TODO Auto-generated constructor stub
		emf=Persistence.createEntityManagerFactory("openhisPU");
	}
	public List<Patient> searchPatient(String req){
		EntityManager em=emf.createEntityManager();
		List<Patient> liste=em.createNamedQuery("findAll",Patient.class).setParameter("ipp", req+"%").setParameter("nom","%").setParameter("prenom","%").getResultList();
		liste.addAll(em.createNamedQuery("findAll",Patient.class).setParameter("ipp", "%").setParameter("nom",req+"%").setParameter("prenom","%").getResultList());
		liste.addAll(em.createNamedQuery("findAll",Patient.class).setParameter("ipp", "%").setParameter("nom","%").setParameter("prenom",req+"%").getResultList());
		return liste;
		/*ArrayList<String> list = new ArrayList<String>();
		
			String query = "SELECT * FROM patient WHERE (ipp LIKE '"+req+"%')";
			try {
				ResultSet rs = dao.GetSt().executeQuery(query);
				while(rs.next()){
					list.add(rs.getString("ipp"));
				}
			} catch (SQLException e) {
				System.out.println("searchPatientByIpp");
			}
		return list;*/
	}
	/*public ArrayList<String> searchPatientByName(String req){
		ArrayList<String> list = new ArrayList<String>();
			String query = "SELECT * FROM personne WHERE (nom LIKE '"+req+"%')";
			try {
				ResultSet rs = dao.GetSt().executeQuery(query);
				while(rs.next()){
					list.add(rs.getString("nom")+" "+rs.getString("prenom"));
				}
			} catch (SQLException e) {
				System.out.println("searchPatientByName");
			}
		return list;
	}*/
	public List<Patient> searchVisite(String req){
		EntityManager em=emf.createEntityManager();
		List<Patient> liste=em.createNamedQuery("findVisite",Patient.class).setParameter("ipp", req+"%").setParameter("nom","%").setParameter("prenom","%").setParameter("type","%").setParameter("nom_service","%").getResultList();
		if(!req.equals("")){
		liste.addAll(em.createNamedQuery("findVisite",Patient.class).setParameter("ipp", "%").setParameter("nom",req+"%").setParameter("prenom","%").setParameter("type","%").setParameter("nom_service","%").getResultList());
		liste.addAll(em.createNamedQuery("findVisite",Patient.class).setParameter("ipp", "%").setParameter("nom","%").setParameter("prenom",req+"%").setParameter("type","%").setParameter("nom_service","%").getResultList());
		liste.addAll(em.createNamedQuery("findVisite",Patient.class).setParameter("ipp", "%").setParameter("nom","%").setParameter("prenom","%").setParameter("type",req+"%").setParameter("nom_service","%").getResultList());
		liste.addAll(em.createNamedQuery("findVisite",Patient.class).setParameter("ipp", "%").setParameter("nom","%").setParameter("prenom","%").setParameter("type","%").setParameter("nom_service",req+"%").getResultList());
		}
		return liste;
	}
	public List<Visite> searchAllVisite(long id){
		EntityManager em=emf.createEntityManager();;
		Patient p=em.find(Patient.class, id);
		return p.getVisites();
		//return em.createNamedQuery("findAllVisite",Visite.class).setParameter("id", id).getResultList();
	}
}
