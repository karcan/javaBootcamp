package homework.models;

import java.util.Date;

public class Lecture {
	
	public Lecture() {}
	
	public Lecture(int id, int courseId, String name, Date date) {
		this.id = id;
		this.courseId = courseId;
		this.name = name;
		this.date = date;
	}
	
	public int id;
	public int courseId;
	public String name;
	public Date date;
	
}
