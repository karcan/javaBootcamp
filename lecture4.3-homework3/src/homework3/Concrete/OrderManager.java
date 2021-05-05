package homework3.Concrete;

import java.util.Date;

import homework3.Abstract.CampaignService;
import homework3.Abstract.OrderService;
import homework3.Abstract.ProductService;
import homework3.Abstract.UserService;
import homework3.Entity.Order;

public class OrderManager implements OrderService {
	
	private UserService userService;
	private ProductService productService;
	private CampaignService campaignService;
	
	public OrderManager(UserService userService, ProductService productService, CampaignService campaignService) {
		this.userService = userService;
		this.productService = productService;
		this.campaignService = campaignService;
	}

	@Override
	public void add(Date date, int userId, int productId, int campaignId, int quantity, double unitPrice) {
		
		Order order = new Order(1, date, userId, productId, campaignId, quantity, unitPrice, 0, 0);
	
		System.out.println("|orderId|date|userId|productId|campaignId|quantity|unitPrice|discountPercent|discountedPrice|");
		System.out.println("|---|---|---|---|---|---|---|---|---|");
		System.out.println(
				"|" + order.getId()
				+ "|" + order.getDate()
				+ "|" + order.getUserId()
				+ "|" + order.getProductId()
				+ "|" + order.getCampaignId()
				+ "|" + order.getQuantity()
				+ "|" + order.getUnitPrice()
				+ "|" + order.getDiscountPercent()
				+ "|" + order.getDiscountedPrice()
				);

		
	}


	@Override
	public void update(int orderId, Date date, int userId, int productId, int campaignId, int quantity, double unitPrice) {
		System.out.println("Order : " + orderId + " updated. ");
	}

	@Override
	public void delete(int orderId) {
		System.out.println("Order : " + orderId + " deleted. ");	
	}
	
	
}
