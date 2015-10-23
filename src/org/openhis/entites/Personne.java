package org.openhis.entites;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type" )
public class Personne implements Serializable {
  
     
	private static final long serialVersionUID = 1L;
		@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String nom;
	private String prenom;
	private String age;
	private String date_naissance;
	private String sexe;
	private String adresse;
	private String ville;
	private String pays;
	private String code_postale;
	private String num_telephone;
	
	
	
	public Personne(String nom, String prenom, String age,
			String date_naissance, String sexe, String adresse, String ville,
			String pays, String code_postale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
		this.adresse = adresse;
		this.ville = ville;
		this.pays = pays;
		this.code_postale = code_postale;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getCode_postale() {
		return code_postale;
	}
	public String getNum_telephone() {
		return num_telephone;
	}
	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
	}
	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
   

}
