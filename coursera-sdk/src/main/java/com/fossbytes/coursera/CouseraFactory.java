package com.fossbytes.coursera;

import java.util.List;

import com.fossbytes.coursera.model.Course;
import com.fossbytes.coursera.model.Instructor;
import com.fossbytes.coursera.model.Partner;

public class CouseraFactory {

	private static CouseraFactory singleton = new CouseraFactory();

	public static CouseraFactory getInstance() {
		return singleton;
	}

	public Course getCourseById(String Id)
	{
		return null;
	}
	
	public List<Course> getAllCourses()
	{
		return null;
	}
	
	public Instructor getInstructorById(String Id)
	{
		return null;
	}
	
	public List<Instructor> getAllInstructor()
	{
		return null;
	}
	
	public Partner getPartnerById(String Id)
	{
		return null;
	}
	
	public List<Course> getAllPartner()
	{
		return null;
	}
}
