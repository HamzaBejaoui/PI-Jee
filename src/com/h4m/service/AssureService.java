package com.h4m.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.hibernate.Session;

import com.h4m.dao.AssureRepository;
import com.h4m.models.Piece;
import com.h4m.models.Utilisateur;
import com.h4m.config.HibernateUtil;

/**
 * Session Bean implementation class AssureService
 */
@Stateless
@LocalBean
public class AssureService {
	
	private AssureRepository assureRepo;
	
	Session session;

    /**
     * Default constructor. 
     */
    public AssureService() {
    	assureRepo = new AssureRepository();
    }
    
    public List<Utilisateur> getAssure(){
    		//System.out.println(HibernateUtil.getSessionFactory());
    		session=HibernateUtil.getSessionFactory().openSession();
        	session.beginTransaction();
        	List<Utilisateur> assures=session.createQuery("FROM Utilisateur").list();
        	session.getTransaction().commit();
        	session.close();
        	return assures;
    }
    
    public Boolean ajouterUtilisateur(Utilisateur u){
		try{
	    	session=HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	session.persist(u);
	    	session.getTransaction().commit();
	    	session.close();
	    	return true;
	    	}catch(Exception ex){
	    		ex.printStackTrace();
	    		return false;
	    	}
	}
	
	public boolean modifierUtilisateur(Utilisateur u){
		try{
		session=HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	session.update(u);
    	session.getTransaction().commit();
    	session.close();
    	return true;
    	}catch(Exception ex){
    		session.close();
    		return false;
    	}
	}
	
	public void deleteUtilisateur(String id){
		
		Utilisateur u;
		try{
	    	session=HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	u=session.get(Utilisateur.class,id);
	    	session.delete(u);
	    	session.getTransaction().commit();
	    	session.close();
	    	}catch(Exception ex){
	    		session.close();
	    		ex.printStackTrace();
	    	}
		
	}


}
