package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entity.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
