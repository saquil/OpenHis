package org.openhis.controller.accueil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.dao.RegisterDAO;

public class RegisterAction extends Action{

	public RegisterAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		RegisterForm rform=(RegisterForm)form;
		RegisterDAO dao=new RegisterDAO();
		dao.save(rform.getPatient());
		request.getSession().setAttribute("patient", rform.getPatient());
		return mapping.findForward("success");
	}
}
