package homework3.Abstract;

import homework3.Entity.Product;

public abstract class BaseProductManager implements ProductService {
	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " : eklenmiştir.");
	}
	
	@Override
	public void addBulk(Product[] products) {
		for (Product product : products) {
			this.add(product);
		}
	}
	
	@Override
	public void update(Product product) {
		System.out.println(product.getName() + " : güncellenmiştir.");
	}
	
	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + " : silinmiştir.");
	}
}
