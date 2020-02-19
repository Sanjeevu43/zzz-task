package zzz.com.service;

import java.util.List;

import zzz.com.model.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Product getProductById(Long id);

	public void saveOrUpdate(Product mvoie);

}
