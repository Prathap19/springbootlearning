package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class service {

	private static List<participant> collection =new ArrayList<participant>();
	
	static
	{
		participant first = new participant("first person");
		collection.add(first);
		
	first = new participant("second person");
		collection.add(first);
		
		 first = new participant("third person");
		collection.add(first);
		
	}
	
	public List<participant> getdata()
	{
		return collection;
	}
	
}


 