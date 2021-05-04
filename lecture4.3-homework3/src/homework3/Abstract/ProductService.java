package homework3.Abstract;

import homework3.Entity.Product;

public interface ProductService {
	void add(Product product);
	void addBulk(Product[] products);
	void update(Product product);
	void delete(Product product);
}
