package org.openhis.controller.accueil;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.entites.Patient;

public class SearchAction extends Action{

	public SearchAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		EntityManager em=Persistence.createEntityManagerFactory("openhisPU").createEntityManager();
		Patient p=em.find(Patient.class, Long.parseLong(request.getParameter("id")));
		System.out.println(p.getNom());
		request.getSession().setAttribute("patient", p);
		return mapping.getInputForward();
	}
}
