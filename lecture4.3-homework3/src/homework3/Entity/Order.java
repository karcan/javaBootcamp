package homework3.Entity;

import java.util.Date;

public class Order {
	private int id;
	private Date date;
	private int userId;
	private int productId;
	private int campaignId;
	private int quantity;
	private double unitPrice;
	private double discountPercent;
	private double discountedPrice;
	
	public Order(int id, Date date, int userId, int productId, int campaignId, int quantity, double unitPrice,
			double discountPercent, double discountedPrice) {
		this.id = id;
		this.date = date;
		this.userId = userId;
		this.productId = productId;
		this.campaignId = campaignId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.discountPercent = discountPercent;
		this.discountedPrice = discountedPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	
	
	
}
