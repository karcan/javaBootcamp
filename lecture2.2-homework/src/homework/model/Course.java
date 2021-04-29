package homework.model;

import java.util.Date;

public class Course {
	
	private int id;
	private int instructorId;
	private int categoryId;
	private String name;
	private String shortDescription;
	private String longDescription;
	private double sellingPrice;
	private Date startDate;
	private Date endDate;
	
	public Course() {} 
	
	
	public Course(int id, int instructorId, int categoryId, String name, String shortDescription,
			String longDescription, double sellingPrice, Date startDate, Date endDate) {
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



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}