package com.hcl1;

import java.util.ArrayList;
public class CourseList {
ArrayList<Course> courseList=new ArrayList();

public void insert(Course course)
{
	courseList.add(course);
}
public ArrayList<String> noOfCourse(Double budget)
{
	ArrayList<String> list=new ArrayList();
	for(Course course:courseList) {
		if(budget>=course.getFee()) {
			int n=(int)(budget/course.getFee());
			String str=course.getName()+"-"+n;
			list.add(str);
		}}
			return list;
}
}
