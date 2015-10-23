package org.openhis.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.openhis.dao.LoginDAO;
import org.openhis.entites.Personne;

public class LoginAction extends Action{

	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		LoginForm lform=(LoginForm)form;
		System.out.println("");
                System.out.println("******ENTER ACTION");
                System.out.println("");
		LoginDAO dao=new LoginDAO(request);
                HttpSession session = request.getSession();
                
		if(dao.exist(lform.getCompte(),lform.getPassword())){
                    System.out.println("YES");
                    return mapping.findForward(session.getAttribute("type").toString());
		}
		else{
                    ActionErrors errors=new ActionErrors();
                    errors.add("invalidField", new ActionMessage("error.invalid", "Login or password"));
                    saveErrors(request, errors);
                    System.out.println("NO");
                    return mapping.findForward("login");
                 }
	}
}
