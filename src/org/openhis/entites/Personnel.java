package org.openhis.entites;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;


@Entity




@MappedSuperclass
//@DiscriminatorValue( value = "Personnel" )
public class Personnel extends Personne{
	
	private static final long serialVersionUID = 1L;
	private String compte;
	private String password;

	@ManyToOne(cascade = CascadeType.ALL)
	private Service service;
	
	
	public Personnel(String nom, String prenom, String age,
			String date_naissance, String sexe, String adresse, String ville,
			String pays, String code_postale, String compte, String password,
			Service service) {
		super(nom, prenom, age, date_naissance, sexe, adresse, ville, pays,
				code_postale);
		this.compte = compte;
		this.password = password;
		this.service = service;
	}

	
	public Personnel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Service getService() {
		return service;
	}





	public void setService(Service service) {
		this.service = service;
	}
	
	public Personnel(String nom, String prenom, String age,
			String date_naissance, String sexe, String adresse, String ville,
			String pays, String code_postale) {
		super(nom, prenom, age, date_naissance, sexe, adresse, ville, pays,
				code_postale);
		// TODO Auto-generated constructor stub
	}





	public Personnel(String nom, String prenom, String age,
			String date_naissance, String sexe, String adresse, String ville,
			String pays, String code_postale, String compte, String password) {
		super(nom, prenom, age, date_naissance, sexe, adresse, ville, pays,
				code_postale);
		this.compte = compte;
		this.password = password;
	}





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
	
	
	
	
	
	
}

