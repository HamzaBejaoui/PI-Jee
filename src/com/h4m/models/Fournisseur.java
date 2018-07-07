package com.h4m.models;

public class Fournisseur {
	
	private int idFournisseur;
	private String adresseFournisseur_CodePostal;
	private String adresseFournisseur_Pays;
	private String adresseFournisseur_Rue;
	private String adresseFournisseur_Ville;
	private String attestationExo;
	private String contact_Nom;
	private String contact_Prenom;
	private String email;
	private byte estExonere;
	private String matriculeFiscal;
	private String registreCommerce;
	private String RSFournisseur;
	private String siteWeb;
	private String tel;
	
	public Fournisseur() {
		
	}

	public Fournisseur(int idFournisseur, String adresseFournisseur_CodePostal, String adresseFournisseur_Pays,
			String adresseFournisseur_Rue, String adresseFournisseur_Ville, String attestationExo, String contact_Nom,
			String contact_Prenom, String email, byte estExonere, String matriculeFiscal, String registreCommerce,
			String rSFournisseur, String siteWeb, String tel) {
		super();
		this.idFournisseur = idFournisseur;
		this.adresseFournisseur_CodePostal = adresseFournisseur_CodePostal;
		this.adresseFournisseur_Pays = adresseFournisseur_Pays;
		this.adresseFournisseur_Rue = adresseFournisseur_Rue;
		this.adresseFournisseur_Ville = adresseFournisseur_Ville;
		this.attestationExo = attestationExo;
		this.contact_Nom = contact_Nom;
		this.contact_Prenom = contact_Prenom;
		this.email = email;
		this.estExonere = estExonere;
		this.matriculeFiscal = matriculeFiscal;
		this.registreCommerce = registreCommerce;
		RSFournisseur = rSFournisseur;
		this.siteWeb = siteWeb;
		this.tel = tel;
	}

	public int getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getAdresseFournisseur_CodePostal() {
		return adresseFournisseur_CodePostal;
	}

	public void setAdresseFournisseur_CodePostal(String adresseFournisseur_CodePostal) {
		this.adresseFournisseur_CodePostal = adresseFournisseur_CodePostal;
	}

	public String getAdresseFournisseur_Pays() {
		return adresseFournisseur_Pays;
	}

	public void setAdresseFournisseur_Pays(String adresseFournisseur_Pays) {
		this.adresseFournisseur_Pays = adresseFournisseur_Pays;
	}

	public String getAdresseFournisseur_Rue() {
		return adresseFournisseur_Rue;
	}

	public void setAdresseFournisseur_Rue(String adresseFournisseur_Rue) {
		this.adresseFournisseur_Rue = adresseFournisseur_Rue;
	}

	public String getAdresseFournisseur_Ville() {
		return adresseFournisseur_Ville;
	}

	public void setAdresseFournisseur_Ville(String adresseFournisseur_Ville) {
		this.adresseFournisseur_Ville = adresseFournisseur_Ville;
	}

	public String getAttestationExo() {
		return attestationExo;
	}

	public void setAttestationExo(String attestationExo) {
		this.attestationExo = attestationExo;
	}

	public String getContact_Nom() {
		return contact_Nom;
	}

	public void setContact_Nom(String contact_Nom) {
		this.contact_Nom = contact_Nom;
	}

	public String getContact_Prenom() {
		return contact_Prenom;
	}

	public void setContact_Prenom(String contact_Prenom) {
		this.contact_Prenom = contact_Prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEstExonere() {
		return estExonere;
	}

	public void setEstExonere(byte estExonere) {
		this.estExonere = estExonere;
	}

	public String getMatriculeFiscal() {
		return matriculeFiscal;
	}

	public void setMatriculeFiscal(String matriculeFiscal) {
		this.matriculeFiscal = matriculeFiscal;
	}

	public String getRegistreCommerce() {
		return registreCommerce;
	}

	public void setRegistreCommerce(String registreCommerce) {
		this.registreCommerce = registreCommerce;
	}

	public String getRSFournisseur() {
		return RSFournisseur;
	}

	public void setRSFournisseur(String rSFournisseur) {
		RSFournisseur = rSFournisseur;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
