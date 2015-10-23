package org.openhis.entites;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Service implements Serializable {

        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        
		
		
	public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


	private String nom;
	
	
	public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


	public Service() {
		// TODO Auto-generated constructor stub
	}

}
