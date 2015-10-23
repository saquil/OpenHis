package org.openhis.controller.accueil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.openhis.entites.Patient;

public class RegisterForm extends ActionForm{

	private Patient patient;
	public RegisterForm() {
		// TODO Auto-generated constructor stub
		setPatient(new Patient());
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors errors=new ActionErrors();
		if(patient.getNom().equals(""))
			errors.add("nom", new ActionMessage("error.nom"));
		if(patient.getPrenom().equals(""))
			errors.add("prenom", new ActionMessage("error.prenom"));
		if(patient.getDate_naissance().equals(""))
			errors.add("date_naissance", new ActionMessage("error.date_naissance"));
		if(patient.getIpp().equals(""))
			errors.add("ipp", new ActionMessage("error.ipp"));
		return errors;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
