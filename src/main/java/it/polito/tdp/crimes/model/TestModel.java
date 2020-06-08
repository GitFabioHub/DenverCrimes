package it.polito.tdp.crimes.model;

public class TestModel {

	public static void main(String[] args) {
		
		Model m=new Model();
		for(String e : m.getCategorie())
			System.out.println(e);
	}

}
