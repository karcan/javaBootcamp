package homework3.Entity;

import java.util.Date;

public class Order {
	private int id;
	private Date date;
	private Player player;
	private Product product;
	private Campaign campaign;
	
	public Order(int id, Date date, Player player, Product product, Campaign campaign) {
		this.id = id;
		this.date = date;
		this.player = player;
		this.product = product;
		this.campaign = campaign;
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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
}
