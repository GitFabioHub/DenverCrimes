package it.polito.tdp.crimes.model;

import java.util.LinkedList;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		
		Model m=new Model();
		
		List <String> l=new LinkedList<>(m.getCategorie());
		System.out.print(""+l.size());
	}

}
