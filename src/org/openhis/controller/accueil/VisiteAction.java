package org.openhis.controller.accueil;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.entites.Patient;
import org.openhis.entites.Service;
import org.openhis.entites.Visite;

public class VisiteAction extends Action{

	public VisiteAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		VisiteForm vform=(VisiteForm)form;
		EntityManager em=Persistence.createEntityManagerFactory("openhisPU").createEntityManager();
		if(request.getParameter("end")!=null){
			em.getTransaction().begin();
			Patient p=em.find(Patient.class, ((Patient)request.getSession().getAttribute("patient")).getId());
			Timestamp t=new Timestamp(new Date().getTime());
			p.getLast().setDate_fin(t);
			em.getTransaction().commit();
			request.getSession().setAttribute("patient", p);
		}
		else{
			em.getTransaction().begin();
			Patient p=em.find(Patient.class, ((Patient)request.getSession().getAttribute("patient")).getId());
			Service s=em.createQuery("SELECT s FROM Service s WHERE s.nom=:nom",Service.class).setParameter("nom", vform.getService()).getSingleResult();
			Visite v=new Visite();
			v.setService(s);
			v.setType(vform.getType());
			Timestamp t=new Timestamp(new Date().getTime());
			v.setDate_debut(t);
			p.addVisite(v);
			em.persist(v);
			em.getTransaction().commit();
			request.getSession().setAttribute("patient", p);
		}
		
		return mapping.getInputForward();
	}
}
