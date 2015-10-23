package org.openhis.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity



@DiscriminatorValue( value = "receptioniste" )
public class Receptioniste extends Personnel{

	private static final long serialVersionUID = 1L;
	

	public Receptioniste(String nom, String prenom, String age,
			String date_naissance, String sexe, String adresse, String ville,
			String pays, String code_postale) {
		super(nom, prenom, age, date_naissance, sexe, adresse, ville, pays,
				code_postale);
		// TODO Auto-generated constructor stub
	}


	public Receptioniste() {
		// TODO Auto-generated constructor stub
	}

    @Override
    public String toString() {
        return "receptionniste"; //To change body of generated methods, choose Tools | Templates.
    }
        
        

}
