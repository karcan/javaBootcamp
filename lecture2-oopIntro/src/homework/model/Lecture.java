package homework.model;

import java.util.Date;

public class Lecture {
	
	public Lecture() {} 
	
	public Lecture(int id, int courseId, String name, Date date) {
		this.setId(id);
		this.setCourseId(courseId);
		this.setName(name);
		this.setDate(date);
	}
	
	private int id;
	private int courseId;
	private String name;
	private Date date;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
