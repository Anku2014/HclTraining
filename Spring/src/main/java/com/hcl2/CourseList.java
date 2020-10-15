package com.hcl2;

import java.util.ArrayList;
public class CourseList 
{
	private  ArrayList<Course>courseList=new ArrayList();


	public  void insert(Course course)
	{
		courseList.add(course);
	}

	public void discount(){
		double min=0;
		double max=0;
		String highCourse="";
		String leastCourse="";
		for(Course course:courseList) 
		{
			if(course.getFee()>max) 
			{
				max=course.getFee();
				highCourse=course.getName();
				}
			else if(course.getFee()<min) 
			{
				min=course.getFee();
				leastCourse=course.getName();
			}
		}
		System.out.println("Discount "+0.1*max+" for "+highCourse+" Course");
		System.out.println("Discount "+0.05*min+" for "+leastCourse+" Course");
	}

}
