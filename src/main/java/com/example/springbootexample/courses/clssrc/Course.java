package com.example.springbootexample.courses.clssrc;

public class Course {
	private long id;
	private String name;
	private String duration;
	
	public Course(long id, String name, String duration)
	{
		super();
		this.id=id;
		this.name=name;
		this.duration=duration;
	}
	
	
	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDuration() {
		return duration;
	}


	@Override
	public String toString()
	
	{
		
		return "Course [id="+id+", name="+name+",duration="+duration+"]";
		
	}

}
