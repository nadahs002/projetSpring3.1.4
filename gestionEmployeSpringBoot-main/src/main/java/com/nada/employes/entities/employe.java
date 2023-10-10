package com.nada.employes.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;



@Entity
public class employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye ;
	private String nomEmploye ;
	private Double salaireEmploye ;
	private Date date ;

	@OneToOne
	private Image image;

	@ManyToOne
	private grade grade ;
	

	public employe() {
		super();
		
	}

	public employe(Long idEmploye, String nomEmploye, Double salaireEmploye, Date date, Image image, com.nada.employes.entities.grade grade) {
		this.idEmploye = idEmploye;
		this.nomEmploye = nomEmploye;
		this.salaireEmploye = salaireEmploye;
		this.date = date;
		this.image = image;
		this.grade = grade;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}
	
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	
	public String getNomEmploye() {
		return nomEmploye;
	}
	
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	
	public Double getSalaireEmploye() {
		return salaireEmploye;
	}
	
	public void setSalaireEmploye(Double salaireEmploye) {
		this.salaireEmploye = salaireEmploye;
	}
	
	public Date getDate() {
		
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", salaireEmploye=" + salaireEmploye
				+ ", date=" + date + "]";
	}
	
	
	public grade getGrade() {
		return grade;
	}


	public void setGrade(grade grade) {
		this.grade = grade;
	}



}
