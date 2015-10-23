package org.openhis.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LoginForm(String compte, String password) {
		super();
		this.compte = compte;
		this.password = password;
	}
	private String compte;
	private String password;
	
	public String getCompte() {
		return compte;
	}
	public void setCompte(String compte) {
		this.compte = compte;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginForm() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors=new ActionErrors();
		if(password.equals(""))
			errors.add("password",new ActionMessage("error.empty"));
		if(compte.equals(""))
			errors.add("compte",new ActionMessage("error.empty"));
		/*if(compte.indexOf('_')==-1 || compte.substring(0, compte.indexOf('_')).equals("") || compte.substring(compte.indexOf('_')+1).equals(""))
			errors.add("format",new ActionMessage("error.format"));*/
		// TODO Auto-generated method stub
		return errors;
	}
}
