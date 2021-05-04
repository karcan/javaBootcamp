package homework3.Concrete;

import java.util.Date;

import homework3.Abstract.OrderService;
import homework3.Entity.Campaign;
import homework3.Entity.Order;
import homework3.Entity.Product;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println("---");
		System.out.println("Product : " + order.getProduct().getName());
		System.out.println("Price : " + order.getProduct().getSellingPrice());
		this.campaignImplementOperation(order);
		System.out.println("Order created.");
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
	
	private void campaignImplementOperation(Order order) {
		Date now = new Date();
		Campaign campaign = order.getCampaign();
		Product product = order.getProduct();
		
		if(campaign != null) {
			if(now.after(campaign.getStartDate()) && now.before(campaign.getEndDate())) {
				System.out.println("Campaign implemented : " + campaign.getCampaignCode());
				System.out.println("Discounted Price : "+ (product.getSellingPrice() - (product.getSellingPrice() * campaign.getDiscountPercent() / 100)));
				
			}else {
				System.out.println("Campaign is over.");
			}
			
		}
	}

}
