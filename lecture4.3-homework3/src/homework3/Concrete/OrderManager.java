package homework3.Concrete;

import java.util.Date;

import homework3.Abstract.OrderService;
import homework3.Entity.Campaign;
import homework3.Entity.Order;
import homework3.Entity.Player;
import homework3.Entity.Product;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		
		Product product = order.getProduct();
		Player player = order.getPlayer();
		Campaign campaign = order.getCampaign();
		
		double discountedPrice = this.campaignImplementOperation(order);
		
		System.out.println("|orderId|productName|sellingPrice|playerName|campaignCode|discountedPrice|");
		System.out.println("|---|---|---|---|---|---|");
		System.out.println("|" + order.getId()
				+ "|" + product.getName()
				+ "|" + product.getSellingPrice()
				+ "|" + player.getFirstName() + " " + player.getLastName()
				+ "|" + campaign.getCampaignCode()
				+ "|" + discountedPrice
				);

		
	}

	@Override
	public void addBulk(Order[] orders) {
		for (Order order : orders) {
			this.add(order);
		}
	}

	@Override
	public void update(Order order) {
		System.out.println("Order : " + order.getId() + " updated. ");
	}

	@Override
	public void delete(Order order) {
		System.out.println("Order : " + order.getId() + " deleted. ");	
	}
	
	private double campaignImplementOperation(Order order) {
		Date now = new Date();
		Campaign campaign = order.getCampaign();
		Product product = order.getProduct();
		double discountedPrice;
		
		if(campaign != null) {
			if(now.after(campaign.getStartDate()) && now.before(campaign.getEndDate())) {
				System.out.println("Campaign implemented : " + campaign.getCampaignCode());
				discountedPrice = (product.getSellingPrice() - (product.getSellingPrice() * campaign.getDiscountPercent() / 100));
				System.out.println("Discounted Price : " + discountedPrice);
				return discountedPrice;
				
			}else {
				System.out.println("Campaign is over.");
				return product.getSellingPrice();
			}
			
		}
		
		return product.getSellingPrice();
	}

}
