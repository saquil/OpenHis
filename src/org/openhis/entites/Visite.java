package org.openhis.entites;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
public class Visite implements Serializable {

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
	private String type;
	private Timestamp date_debut;
	private Timestamp date_fin;
        
    /*@ManyToOne(cascade = CascadeType.ALL)
	private Patient patient;
       
    
    
    public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	*/

	public Service getService() {
		return service;
	}



	public void setService(Service service) {
		this.service = service;
	}
	@ManyToOne(cascade = CascadeType.ALL)
    private Service service;
    
    
    
	public Visite() {
		// TODO Auto-generated constructor stub
	}
    
    
    
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Timestamp date_debut) {
		this.date_debut = date_debut;
	}
	public Timestamp getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Timestamp date_fin) {
		this.date_fin = date_fin;
	}
	public String getTime_debut(){
		SimpleDateFormat form=new SimpleDateFormat("dd.MMMM.yyyy");
		return form.format(date_debut);
	}
	public String getTime_fin(){
		SimpleDateFormat form=new SimpleDateFormat("dd.MMMM.yyyy");
		return form.format(date_fin);
	}


}
