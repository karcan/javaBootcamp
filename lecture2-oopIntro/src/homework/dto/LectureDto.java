package homework.dto;

import java.util.Date;

public class LectureDto {
	
	public LectureDto(int id, String courseName, String lectureName, Date lectureDate) {
		this.id = id;
		this.courseName = courseName;
		this.lectureName = lectureName;
		this.lectureDate = lectureDate;
	}

	public final int id;
	public final String courseName;
	public final String lectureName;
	public final Date lectureDate;
}
