package it.polito.tdp.crimes.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {

	private List<Integer>mesi;
	private EventsDao dao;
	
	public List<String> getCategorie(){
		return dao.tutteCategorie();
	}

	public List<Integer> getMesi(){
		
		return dao.getMesi();
	}
	
}
