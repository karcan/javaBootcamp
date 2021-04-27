package homework.model;

import java.util.Date;

public class Lecture {
	
	public Lecture() {} 
	
	public Lecture(int id, int courseId, String name, String description, Date date) {
		this.setId(id);
		this.setCourseId(courseId);
		this.setName(name);
		this.setDescription(description);
		this.setDate(date);
	}
	
	private int id;
	private int courseId;
	private String name;
	private String description;
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
