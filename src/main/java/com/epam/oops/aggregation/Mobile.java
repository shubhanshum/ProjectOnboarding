package com.epam.oops.aggregation;

public class Mobile {

	String name;
	boolean isSmart;
	Sim sim;
	
	public Mobile(String name, boolean isSmart, Sim sim) {
		this.name=name;
		this.isSmart=isSmart;
		this.sim=sim;
	}
}
