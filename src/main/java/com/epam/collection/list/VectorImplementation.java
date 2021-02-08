package com.epam.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorImplementation {

	public void printNames(Vector<String> names){
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			System.out.println("Vector name is: "+it.next());
		}
	}
}
