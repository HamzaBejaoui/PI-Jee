package com.h4m.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Piece {


	@Id @GeneratedValue
	private int idPiece;
	private String description;
	private String designation;
	private String reference;
	
	public Piece() {
		
	}

	public Piece(int idPiece, String description, String designation, String reference) {
		this.idPiece = idPiece;
		this.description = description;
		this.designation = designation;
		this.reference = reference;
	}

	public int getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(int idPiece) {
		this.idPiece = idPiece;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	@Override
	public String toString() {
		return "Piece [idPiece=" + idPiece + ", description=" + description + ", designation=" + designation
				+ ", reference=" + reference + "]";
	}

}
