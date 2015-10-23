package org.openhis.controller.accueil;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.dao.PatientDAO;
import org.openhis.entites.Patient;
import org.openhis.entites.Visite;

public class VisiteAllAction extends Action{

	public VisiteAllAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		List<Visite>visites=new PatientDAO().searchAllVisite(((Patient)request.getSession().getAttribute("patient")).getId());
		Collections.reverse(visites);
		request.getSession().setAttribute("visites",visites);
		request.setAttribute("done", "done");
		return mapping.findForward("success");
	}

}
