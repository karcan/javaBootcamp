package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entity.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
