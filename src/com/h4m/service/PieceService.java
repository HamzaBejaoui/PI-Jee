package com.h4m.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.hibernate.Session;

import com.h4m.config.HibernateUtil;
import com.h4m.models.Piece;

/**
 * Session Bean implementation class PieceService
 */
@Stateless
@LocalBean
public class PieceService {

    /**
     * Default constructor. 
     */
	
	Session session;
	
    public PieceService() {
        // TODO Auto-generated constructor stub
    }
    
    public Boolean ajouterPiece(Piece p){
		try{
	    	session=HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	session.persist(p);
	    	session.getTransaction().commit();
	    	session.close();
	    	return true;
	    	}catch(Exception ex){
	    		ex.printStackTrace();
	    		return false;
	    	}
	}
	
	public boolean modifierPiece(Piece p){
		try{
		session=HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	session.update(p);
    	session.getTransaction().commit();
    	session.close();
    	return true;
    	}catch(Exception ex){
    		session.close();
    		return false;
    	}
	}
	
	public List<Piece> getPiece(){
		session=HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	List<Piece> pList=session.createQuery("FROM Piece").list();
    	session.getTransaction().commit();
    	session.close();
    	return pList;
	}
	
	public void deletePiece(int id){
		
		Piece p;
		try{
	    	session=HibernateUtil.getSessionFactory().openSession();
	    	session.beginTransaction();
	    	p=session.get(Piece.class,id);
	    	session.delete(p);
	    	session.getTransaction().commit();
	    	session.close();
	    	}catch(Exception ex){
	    		session.close();
	    		ex.printStackTrace();
	    	}
		
	}


}
