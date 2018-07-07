package com.h4m.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.h4m.models.Vehicule;
import com.h4m.service.VehiculeService;

@ManagedBean
@ViewScoped
public class VehiculeManage {
	
	private List<Vehicule> cars;
    
    private Vehicule selectedCar;
     
    @EJB
    private VehiculeService vService;
     
    @PostConstruct
    public void init() {
        cars = vService.getVehicule();
    }
 
    public List<Vehicule> getCars() {
        return cars;
    }
 
    public void setCars(List<Vehicule> cars) {
		this.cars = cars;
	}

	public Vehicule getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Vehicule selectedCar) {
        this.selectedCar = selectedCar;
    }

}
