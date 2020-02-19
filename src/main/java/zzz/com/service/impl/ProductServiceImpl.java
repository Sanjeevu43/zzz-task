package zzz.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zzz.com.model.Product;
import zzz.com.repository.ProductRepository;
import zzz.com.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
    ProductRepository productRepository;
 
    public List<Product> getProducts() {
        List<Product> products = new ArrayList();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }
 
    public Product getProductById(Long id) {
        return productRepository.findById((long) id).get();
    }
 
    public void saveOrUpdate(Product mvoie) {
    	productRepository.save(mvoie);
    }
 
   

}
