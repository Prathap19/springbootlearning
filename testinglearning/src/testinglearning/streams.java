package testinglearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streams {
	
	public static void main(String[] args)
	{
		List<Emp> people = new ArrayList<>();
		
		people.add(new Emp("manish",150));
		people.add(new Emp("Sura",120));
		people.add(new Emp("raji",170));	
	
	List<Emp> mil = people.stream()
			.filter(Emp -> Emp.money >=150)
			.sorted(Comparator.comparing(Emp::getName, (s1,s2) ->{return s2.compareTo(s1);}))
			.collect(Collectors.toList());
	
	mil.forEach(Emp -> System.out.println(Emp.name));
	}
	
	public static class Emp{
		String name;
		int money;
		
		public Emp(String name, int money)
		{
			this.name=name;
			this.money=money;
		}
		
		public String getName()
		{			
			return name;
		}
		
	}
	
}
