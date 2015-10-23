package org.openhis.controller.accueil;

import org.apache.struts.action.ActionForm;
import org.openhis.entites.Patient;

public class VisiteForm extends ActionForm{

	public VisiteForm() {
		// TODO Auto-generated constructor stub
	}
	private String type;
	private String service;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	
}

