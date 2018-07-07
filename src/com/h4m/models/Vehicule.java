package com.h4m.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicule {
	
	@Id @GeneratedValue
	private int idVehicule;
	private Date dateCirculation;
	private Date dateFabrication;
	private String gamme;
	private String marque;
	private String matricule;
	private int motorisation;
	private String numChassie;
	private String puissanceFiscale;
	//private List<Contrat> contrats;
	//private Utilisateur utilisateur;
	
	public Vehicule() {
		
	}

	public Vehicule(int idVehicule, Date dateCirculation, Date dateFabrication, String gamme, String marque,
			String matricule, int motorisation, String numChassie, String puissanceFiscale, Utilisateur utilisateur) {
		this.idVehicule = idVehicule;
		this.dateCirculation = dateCirculation;
		this.dateFabrication = dateFabrication;
		this.gamme = gamme;
		this.marque = marque;
		this.matricule = matricule;
		this.motorisation = motorisation;
		this.numChassie = numChassie;
		this.puissanceFiscale = puissanceFiscale;
		//this.utilisateur = utilisateur;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}

	public Date getDateCirculation() {
		return dateCirculation;
	}

	public void setDateCirculation(Date dateCirculation) {
		this.dateCirculation = dateCirculation;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public String getGamme() {
		return gamme;
	}

	public void setGamme(String gamme) {
		this.gamme = gamme;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getMotorisation() {
		return motorisation;
	}

	public void setMotorisation(int motorisation) {
		this.motorisation = motorisation;
	}

	public String getNumChassie() {
		return numChassie;
	}

	public void setNumChassie(String numChassie) {
		this.numChassie = numChassie;
	}

	public String getPuissanceFiscale() {
		return puissanceFiscale;
	}

	public void setPuissanceFiscale(String puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}

	/**
	 * @return
	 */
	/*public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}*/
	
}
