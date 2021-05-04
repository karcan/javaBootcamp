package homework3.Entity;

import java.util.Date;

public class Campaign {
	private int id;
	private String campaignCode;
	private Product product;
	private String name;
	private String description;
	private double discountPercent;
	private Date startDate;
	private Date endDate;


	public Campaign(int id, String campaignCode, Product product, String name, String description, double discountPercent, Date startDate,
			Date endDate) {
		this.id = id;
		this.campaignCode = campaignCode;
		this.product = product;
		this.name = name;
		this.description = description;
		this.discountPercent = discountPercent;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
	
	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
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
