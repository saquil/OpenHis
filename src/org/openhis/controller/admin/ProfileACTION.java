package org.openhis.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.dao.AdminDAO;
import org.openhis.entites.Personnel;

public class ProfileACTION extends Action{
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ProfileFORM adf= (ProfileFORM)form;
		AdminDAO add= new AdminDAO();
		Personnel p = new Personnel(adf.getNom(), adf.getPrenom(), adf.getAge(), adf.getDate_naissance(), adf.getSexe(),
				adf.getAdresse(), adf.getVille(), adf.getPays(), adf.getCode_postale(), adf.getCompte(), adf.getPassword());
		add.modifyProfile(p, request);
		
		return mapping.findForward("sucess");
	}

}
