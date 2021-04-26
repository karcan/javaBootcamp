package homework.model;

import java.util.Date;

public class CourseParticipant {
	
	public CourseParticipant() {}
	
	public CourseParticipant(int id, int courseId, int studentId, Date date) {
		this.id = id;
		this.courseId = courseId;
		this.studentId = studentId;
		this.date = date;
	}
	
	public int id;
	public int courseId;
	public int studentId;
	public Date date;
}
