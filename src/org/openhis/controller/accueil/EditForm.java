package org.openhis.controller.accueil;

import org.apache.struts.action.ActionForm;
import org.openhis.entites.Patient;

public class EditForm extends ActionForm{
	
	private Patient patient;
	public EditForm() {
		// TODO Auto-generated constructor stub
		setPatient(new Patient());
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
