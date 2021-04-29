package homework.dto;

import java.util.Date;

public class LectureDto {
	
	public LectureDto(int id, String courseName, String lectureName, Date lectureDate) {
		this.id = id;
		this.courseName = courseName;
		this.lectureName = lectureName;
		this.lectureDate = lectureDate;
	}

	private final int id;
	private final String courseName;
	private final String lectureName;
	private final Date lectureDate;
	
	public int getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getLectureName() {
		return lectureName;
	}
	public Date getLectureDate() {
		return lectureDate;
	}
	
	
}
