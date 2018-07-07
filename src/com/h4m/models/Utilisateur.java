package com.h4m.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	
	private int idUtilisateur;
	private String adresse_CodePostal;
	private String adresse_Pays;
	private String adresse_Rue;
	private String adresse_Ville;
	@Id
	private String cin;
	private Date dateCreation;
	private Date dateEmbauche;
	private Date dateModif;
	private String dateNaissance;
	private Date datePermisConduite;
	private String discriminator;
	private String email;
	private String fonction;
	private String login;
	private String matriculeFiscal;
	private String mdp;
	private String nomPrenom_Nom;
	private String nomPrenom_Prenom;
	private String numPermisConduite;
	private int salaire;
	private String tel;
	
	//@OneToMany
	//private List<Vehicule> vehicules;
	
	public Utilisateur() {
		
	}

	public Utilisateur(int idUtilisateur, String adresse_CodePostal, String adresse_Pays, String adresse_Rue,
			String adresse_Ville, String cin, Date dateCreation, Date dateEmbauche, Date dateModif,
			String dateNaissance, Date datePermisConduite, String discriminator, String email, String fonction,
			String login, String matriculeFiscal, String mdp, String nomPrenom_Nom, String nomPrenom_Prenom,
			String numPermisConduite, int salaire, String tel, List<Vehicule> vehicules) {
		this.idUtilisateur = idUtilisateur;
		this.adresse_CodePostal = adresse_CodePostal;
		this.adresse_Pays = adresse_Pays;
		this.adresse_Rue = adresse_Rue;
		this.adresse_Ville = adresse_Ville;
		this.cin = cin;
		this.dateCreation = dateCreation;
		this.dateEmbauche = dateEmbauche;
		this.dateModif = dateModif;
		this.dateNaissance = dateNaissance;
		this.datePermisConduite = datePermisConduite;
		this.discriminator = discriminator;
		this.email = email;
		this.fonction = fonction;
		this.login = login;
		this.matriculeFiscal = matriculeFiscal;
		this.mdp = mdp;
		this.nomPrenom_Nom = nomPrenom_Nom;
		this.nomPrenom_Prenom = nomPrenom_Prenom;
		this.numPermisConduite = numPermisConduite;
		this.salaire = salaire;
		this.tel = tel;
		//this.vehicules = vehicules;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getAdresse_CodePostal() {
		return adresse_CodePostal;
	}

	public void setAdresse_CodePostal(String adresse_CodePostal) {
		this.adresse_CodePostal = adresse_CodePostal;
	}

	public String getAdresse_Pays() {
		return adresse_Pays;
	}

	public void setAdresse_Pays(String adresse_Pays) {
		this.adresse_Pays = adresse_Pays;
	}

	public String getAdresse_Rue() {
		return adresse_Rue;
	}

	public void setAdresse_Rue(String adresse_Rue) {
		this.adresse_Rue = adresse_Rue;
	}

	public String getAdresse_Ville() {
		return adresse_Ville;
	}

	public void setAdresse_Ville(String adresse_Ville) {
		this.adresse_Ville = adresse_Ville;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public Date getDateModif() {
		return dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDatePermisConduite() {
		return datePermisConduite;
	}

	public void setDatePermisConduite(Date datePermisConduite) {
		this.datePermisConduite = datePermisConduite;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMatriculeFiscal() {
		return matriculeFiscal;
	}

	public void setMatriculeFiscal(String matriculeFiscal) {
		this.matriculeFiscal = matriculeFiscal;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNomPrenom_Nom() {
		return nomPrenom_Nom;
	}

	public void setNomPrenom_Nom(String nomPrenom_Nom) {
		this.nomPrenom_Nom = nomPrenom_Nom;
	}

	public String getNomPrenom_Prenom() {
		return nomPrenom_Prenom;
	}

	public void setNomPrenom_Prenom(String nomPrenom_Prenom) {
		this.nomPrenom_Prenom = nomPrenom_Prenom;
	}

	public String getNumPermisConduite() {
		return numPermisConduite;
	}

	public void setNumPermisConduite(String numPermisConduite) {
		this.numPermisConduite = numPermisConduite;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	/*public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}*/
	

}
