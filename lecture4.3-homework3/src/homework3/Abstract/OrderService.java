package homework3.Abstract;

import java.util.Date;

public interface OrderService {
	void add(Date date, int userId, int productId, int campaignId, int quantity, double unitPrice);
	void update(int orderId, Date date, int userId, int productId, int campaignId, int quantity, double unitPrice);
	void delete(int orderId);
}
