package org.openhis.controller.accueil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.openhis.entites.Patient;

public class AccueilForm extends ActionForm{

	private Patient patient;
	private String birthday_day;
	private String birthday_Month;
	private String birthday_Year;
	public AccueilForm() {
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
		if(patient.getAge().equals(""))
			if(birthday_day.equals("") || birthday_Month.equals("") || birthday_Year.equals(""))
			errors.add("date_naissance", new ActionMessage("error.date"));
		
		if(patient.getSexe()==null)
			errors.add("sexe", new ActionMessage("error.sexe"));
		return errors;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public String getBirthday_day() {
		return birthday_day;
	}


	public void setBirthday_day(String birthday_day) {
		this.birthday_day = birthday_day;
	}


	public String getBirthday_Month() {
		return birthday_Month;
	}


	public void setBirthday_Month(String birthday_Month) {
		this.birthday_Month = birthday_Month;
	}


	public String getBirthday_Year() {
		return birthday_Year;
	}


	public void setBirthday_Year(String birthday_Year) {
		this.birthday_Year = birthday_Year;
	}
	

}
