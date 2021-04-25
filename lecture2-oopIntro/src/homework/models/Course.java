package homework.models;

import java.util.Date;

public class Course {
	
	public Course() {}
	
	public Course(int id, int instructorId, int categoryId, String name, String shortDescription, String longDescription, double sellingPrice, Date startDate, Date endDate) {
		this.id = id;
		this.instructorId = instructorId;
		this.categoryId = categoryId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.sellingPrice = sellingPrice;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int id;
	public int instructorId;
	public int categoryId;
	public String name;
	public String shortDescription;
	public String longDescription;
	public double sellingPrice;
	public Date startDate;
	public Date endDate;
	
}