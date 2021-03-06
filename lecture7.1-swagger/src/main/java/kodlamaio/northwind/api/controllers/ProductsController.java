package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entity.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	private final ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		List<Product> productList = this.productService.getAll();
		return new DataResult<List<Product>>(true,"",productList);
	}
	
	@PostMapping("/add")
	public Result add(Product product) {
		return new Result(true,"Ürün eklendi");
	}
}
