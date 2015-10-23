package org.openhis.controller.accueil;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.dao.PatientDAO;
import org.openhis.entites.Patient;

public class ActiveVisite extends Action{

	public ActiveVisite() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
			List<Patient> patients=new PatientDAO().searchVisite(request.getParameter("req"));
			if(patients.size()!=0)
				request.setAttribute("ajax", patients);
		return mapping.findForward("ajaxSearch");
	}
}
