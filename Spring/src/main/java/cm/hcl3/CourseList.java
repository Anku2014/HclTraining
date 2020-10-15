package cm.hcl3;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList();

	public void insert(Course course) {
		courseList.add(course);
	}

	public void revenue() {
		double finalSum = 0;
		for (Course course : courseList) {
			double single = 200 * 0.2 * course.getFee();
			double single1 = single + course.getFee();
			finalSum = finalSum + single1;
		}
		System.out.println("Total Revenue: "+finalSum);

	}
}
