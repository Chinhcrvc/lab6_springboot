package lab6.lab6.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import lab6.lab6.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{}
