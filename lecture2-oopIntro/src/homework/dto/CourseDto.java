package homework.dto;

public class CourseDto {
	
	public CourseDto(int id, String courseName, String instructorName, String categoryName) {
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.categoryName = categoryName;
	}
	
	public final int id;
	public final String courseName;
	public final String instructorName;
	public final String categoryName;
}
