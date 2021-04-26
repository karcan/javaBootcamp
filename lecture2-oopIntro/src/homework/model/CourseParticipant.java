package homework.model;

import java.util.Date;

public class CourseParticipant {
	
	public CourseParticipant() {} 
	
	public CourseParticipant(int id, int courseId, int studentId, Date date) {
		this.setId(studentId);
		this.setCourseId(courseId);
		this.setStudentId(studentId);
		this.setDate(date);
	}
	
	public int id;
	public int courseId;
	public int studentId;
	public Date date;
	
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
