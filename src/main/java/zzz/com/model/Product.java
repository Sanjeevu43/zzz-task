package zzz.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity
public class Product {
	@Id
	@GeneratedValue
	@Setter
	@Getter
	private Long id;
	
	@Setter
	@Getter
	private String name;
	
	@Setter
	@Getter
	private String brand;
	
	@Setter
	@Getter
	private Integer price;
	
	public Product(String name, String brand, Integer price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

}
