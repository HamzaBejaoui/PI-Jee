package com.h4m.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

import com.h4m.models.Utilisateur;
import com.h4m.service.AssureService;

@ManagedBean
@ViewScoped
public class AssureManage implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	AssureService assureService;
	
	List<Utilisateur> assures;
	
	@PostConstruct
    public void init() {
        assures = assureService.getAssure();
    }

	public List<Utilisateur> getAssures() {
		return assures;
	}

	public void setAssures(List<Utilisateur> assures) {
		this.assures = assures;
	}
	
	public void onRowEdit(RowEditEvent event) {
		
		Utilisateur u = new Utilisateur();
		u = (Utilisateur) event.getObject();
		assureService.modifierUtilisateur(u);
		
        FacesMessage msg = new FacesMessage("Assurè modifiè",u.getCin());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ( (Utilisateur) event.getObject()).getCin());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public String delete() {
		System.out.println("delete ........................");
		HttpServletRequest request=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		System.out.println("conversion..............");
		System.out.println(request.getParameter("cin"));
		String n = request.getParameter("cin");
		System.out.println(":::::"+n);
		assureService.deleteUtilisateur(n);
		return "assure";
	}

}
