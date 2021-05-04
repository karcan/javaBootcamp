package homework3.Abstract;

import homework3.Entity.Order;

public interface OrderService {
	void add(Order order);
	void addBulk(Order[] orders);
	void update(Order order);
	void delete(Order order);
}
