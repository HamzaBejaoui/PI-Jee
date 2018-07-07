package com.h4m.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.h4m.models.Utilisateur;
import com.h4m.service.AssureService;

@ManagedBean
@ViewScoped
public class AddUserBean {
	
	@EJB
	AssureService assureService;
	
	private String cin;
	private String nom;
	private String prenom;
	private String fonction;
	
	public String add(){
		
		Utilisateur u = new Utilisateur();
		u.setCin(cin);
		u.setNomPrenom_Nom(nom);
		u.setNomPrenom_Prenom(prenom);
		u.setFonction(fonction);
		assureService.ajouterUtilisateur(u);
		
		return "assure";
		
	}
	
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	
	

}
