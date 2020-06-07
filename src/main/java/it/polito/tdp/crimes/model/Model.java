package it.polito.tdp.crimes.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {
	
	private List<String>categorie;
	private List<Integer>mesi;
	private EventsDao dao;
	
	
	
	
	public List<String> getCategorie(){
		categorie=new LinkedList<>();
		categorie.addAll(dao.tutteCategorie());
		
		return categorie;
	}
	

	public List<Integer> getMesi(){
		mesi=new LinkedList<>();
		for (Integer s: dao.tuttiMesi()) {
			
			mesi.add(s);
		}
		
		return mesi;
	}
	
}
