package org.openhis.controller.accueil;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.entites.Service;

public class ServiceAction extends Action{

	public ServiceAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		EntityManager em=Persistence.createEntityManagerFactory("openhisPU").createEntityManager();
		em.getTransaction().begin();
		Collection services=em.createQuery("SELECT s FROM Service s",Service.class).getResultList();
		request.getSession().setAttribute("service", services);
		return mapping.getInputForward();
	}
}
