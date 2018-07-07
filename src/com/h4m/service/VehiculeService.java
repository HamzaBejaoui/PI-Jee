package com.h4m.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.hibernate.Session;

import com.h4m.config.HibernateUtil;
import com.h4m.models.Piece;
import com.h4m.models.Vehicule;

/**
 * Session Bean implementation class VehiculeService
 */
@Stateless
@LocalBean
public class VehiculeService {
	
	
	Session session;

    /**
     * Default constructor. 
     */
    public VehiculeService() {
        // TODO Auto-generated constructor stub
    }
    
    public List<Vehicule> getVehicule(){
		session=HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();
    	List<Vehicule> vList=session.createQuery("FROM Vehicule").list();
    	session.getTransaction().commit();
    	session.close();
    	return vList;
	}

}
