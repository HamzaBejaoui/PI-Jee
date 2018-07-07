package com.h4m.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import com.h4m.models.Utilisateur;

public class AssureRepository {
	
	private String REST_URI;

  private Client client;
  
  public AssureRepository() {
		REST_URI = ServerParams.SERVER_URI+"/assure";
		client = ClientBuilder.newClient();
	}
	
	public List<Utilisateur> getAssure(){
		/*return (List<Utilisateur>) client.target(REST_URI)
				.request(MediaType.APPLICATION_JSON)
				.get(Utilisateur.class);*/
		
		List<Utilisateur> assures = new ArrayList<Utilisateur>();
		assures.add(new Utilisateur(1, null, null, null, null, "25874569", null, null, null, null, null, null, "zs@gzg.com","dev", null, null, null, "foulen 1", "ben foulen 1", null, null, null, null));
		assures.add(new Utilisateur(2, null, null, null, null, "25874569", null, null, null, null, null, null, "zs@gzg.com","dev", null, null, null, "foulen 2", "ben foulen 2", null, null, null, null));
		return assures;
	}

}
