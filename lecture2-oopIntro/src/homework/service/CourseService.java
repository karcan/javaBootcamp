package homework.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import homework.constant.Message;
import homework.constant.Validation;
import homework.dto.CourseDto;
import homework.model.Course;

public class CourseService {
	
	private List<Course> _courses; 
	private CategoryService _categoryService;
	private InstructorService _InstructorService;
	
	public CourseService() {
		this._courses = new ArrayList<Course>();
		this._categoryService = new CategoryService();
		this._InstructorService = new InstructorService();
		
	}
	
	public void add(Course course) {
		if(!this.checkStartAndEndDate(course)) {
			System.out.println("Course " + Validation.startDateAndEndDateCanNotBeNull);
			return;
		}
		
		this._courses.add(course);
		System.out.println(course.getName() + " "  + Message.Added);
	}
	
	public void update(Course course) {
		
		int courseIndex = this._courses.indexOf(course);
		
		this._courses.set(courseIndex, course);
		System.out.println(course.getName() + " " + Message.Updated);
	}
	
	public void delete(Course course) {
		
		int courseIndex = this._courses.indexOf(course);
		
		this._courses.remove(courseIndex);
		System.out.println(course.getName() + " " + Message.Deleted);
	}
	
	public List<CourseDto> getCourseDto() {
		return this._courses.stream().map(c -> {
			
			var instructor = this._InstructorService.getById(c.getInstructorId());
			var category = this._categoryService.getById(c.getCategoryId());
			
			return new CourseDto(
					c.getId(), 
					c.getName(),
					instructor.getName() + " " + instructor.getSurname(),
					category.getName()
					);
		}).collect(Collectors.toList());
	}
	
	public Course getById(int id) {
		return this._courses.stream().filter(c -> c.getId() == id).findFirst().get();
	}
	
	public List<Course> getAll() {
		return _courses;
	}
	
	private boolean checkStartAndEndDate(Course course) {
		
		if(course.getStartDate() == null || course.getEndDate() == null) {
			return false;
		}
		
		return true;
	}
}
