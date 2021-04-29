package homework.dto;

public class CourseDto {
	
	public CourseDto(int id, String courseName, String instructorName, String categoryName) {
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.categoryName = categoryName;
	}
	
	private final int id;
	private final String courseName;
	private final String instructorName;
	private final String categoryName;
	
	public int getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
	
}
