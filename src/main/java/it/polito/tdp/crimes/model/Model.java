package it.polito.tdp.crimes.model;

import java.util.LinkedList;
import java.util.List;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {
	
	private EventsDao dao;
	private SimpleWeightedGraph<String,DefaultWeightedEdge> grafo;
	
	public Model() {
		dao = new EventsDao();
	}
	 
	
	
	public List<String> getCategorie(){
		List<String>l=new LinkedList<>(dao.tutteCategorie());
		return l;
	}

	public List<Integer> getMesi(){
		
		return dao.getMesi();
	}
	
}
