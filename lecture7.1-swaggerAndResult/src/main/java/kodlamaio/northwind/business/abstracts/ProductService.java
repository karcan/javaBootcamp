package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entity.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
}
