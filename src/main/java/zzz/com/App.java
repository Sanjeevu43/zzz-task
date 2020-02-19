package zzz.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zzz.com.model.Product;
import zzz.com.repository.ProductRepository;

@SpringBootApplication
public class App implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repository;

	@Autowired
	public App(ProductRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.repository.save(new Product("Iphone X", "Apple", 60000));
		this.repository.save(new Product("Iphone XS", "Apple", 70000));
		this.repository.save(new Product("Iphone S10", "Samsung", 65000));
		
	}	
	
}
