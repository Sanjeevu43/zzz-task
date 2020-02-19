package zzz.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zzz.com.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
