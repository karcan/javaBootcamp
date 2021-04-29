package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V15 IIL",
				"Intel Core i3 1005G1 8GB 256GB SSD Windows 10 Home 15.6\" FHD", 4.399);

		Product product2 = new Product(2, "Lenovo IdeaPad",
				"AMD Ryzen 7 5700U 8GB 512GB SSD Freedos 14\" FHD Taşınabilir", 5.399);

		Product product3 = new Product(3, "Lenovo V14 IGL",
				"Intel Celeron N4020 8GB 256GB SSD Windows 10 Home 14\" FHD", 6.399);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name);
		}

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		
		ProductService productService = new ProductService();
		
		//productService.addToCart(product1);
		
		productService.addToCart(products);
		

	}

}

