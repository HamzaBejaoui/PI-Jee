package com.h4m.web;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.event.RowEditEvent;

import com.h4m.models.Piece;
import com.h4m.service.PieceService;

@ManagedBean
@ViewScoped
public class PieceManage {
	
	@EJB
	private PieceService pService;
	
	private String designation;
	private String reference;
	private String description;
	
	private List<Piece> pList;
	
	@PostConstruct
	public void init(){
		pList = pService.getPiece();
		System.out.println("//////////////////");
		pList.forEach(elem->{
			System.out.println(elem);
		});
	}
	
	public String add(){
		System.out.println("waiiit......");
		Piece p= new Piece();
		p.setDesignation(designation);
		p.setReference(reference);
		p.setDescription(description);
		System.out.println("******************************");
		System.out.println(p);
		pService.ajouterPiece(p);
		pList.add(p);
		
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	    try {
			ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "piece";
	}
	
	public void onRowEdit(RowEditEvent event){
		Piece p = new Piece();
		p=(Piece) event.getObject();
		pService.modifierPiece(p);
		
		FacesMessage msg = new FacesMessage("Pièce modifiè", p.getReference());
        FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}
	public void onRowCancel(RowEditEvent event){
		
	}
	
	public String delete() {
		System.out.println("delete ........................");
		HttpServletRequest request=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		System.out.println("conversion..............");
		System.out.println(request.getParameter("idPiece"));
		int n = Integer.parseInt(request.getParameter("idPiece"));
		System.out.println(":::::"+n);
		pService.deletePiece(n);
		return "piece";
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Piece> getpList() {
		return pList;
	}

	public void setpList(List<Piece> pList) {
		this.pList = pList;
	}
	
	
	

}
