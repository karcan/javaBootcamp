package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.constant.Message;
import homework.constant.Validation;
import homework.model.Course;

public class CourseService {
	
	List<Course> _courses;
	
	public CourseService() {
		this._courses = new ArrayList<Course>();
	}
	
	public void add(Course course) {
		if(!this.checkStartAndEndDate(course)) {
			System.out.println("Course " + Validation.startDateAndEndDateCanNotBeNull);
			return;
		}
		
		this._courses.add(course);
		System.out.println(course.name + " "  + Message.Added);
	}
	
	public void update(Course course) {
		
		int courseIndex = this._courses.indexOf(course);
		
		this._courses.set(courseIndex, course);
		System.out.println(course.name + " " + Message.Updated);
	}
	
	public void delete(Course course) {
		
		int courseIndex = this._courses.indexOf(course);
		
		this._courses.remove(courseIndex);
		System.out.println(course.name + " " + Message.Deleted);
	}
	
	public Course getById(int id) {
		return this._courses.stream().filter(c -> c.id == id).findFirst().get();
	}
	
	public List<Course> getAll() {
		return _courses;
	}
	
	private boolean checkStartAndEndDate(Course course) {
		
		if(course.startDate == null || course.endDate == null) {
			return false;
		}
		
		return true;
	}
}