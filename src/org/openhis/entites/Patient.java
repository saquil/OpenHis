package org.openhis.entites;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity

@DiscriminatorValue( value = "patient" )
@NamedQueries(value = {
		@NamedQuery(name = "findAll", query = "SELECT p FROM Patient p WHERE p.ipp LIKE :ipp AND p.nom LIKE :nom AND p.prenom LIKE :prenom")
		,@NamedQuery(name = "findVisite", query = "SELECT p FROM Patient p INNER JOIN p.visites v WHERE p.ipp LIKE :ipp AND p.nom LIKE :nom AND p.prenom LIKE :prenom AND v.type LIKE :type AND v.service.nom LIKE :nom_service AND v.date_fin IS NULL")
		})


public class Patient extends Personne{
    
	private static final long serialVersionUID = 1L;

	private String ipp;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Visite> visites;

	public Visite getLast(){
		return (visites.size()!=0)?visites.get(visites.size()-1):null;
	}
	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}

	public Patient() {
		// TODO Auto-generated constructor stub
		visites=new ArrayList<Visite>();
	}
	
	public String getIpp() {
		return ipp;
	}
	public void setIpp(String ipp) {
		this.ipp = ipp;
	}
	public void addVisite(Visite v){
		visites.add(v);
	}
}
