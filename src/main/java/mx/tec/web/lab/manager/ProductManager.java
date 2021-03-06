/*
 * ProductManager
 * Version 1.0
 * August 14, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.tec.web.lab.vo.Product;
import mx.tec.web.lab.vo.Sku;

/**
 * The Product Manager with all the available business operations for the products
 * @author Enrique Sanchez
 * @version 1.0
 */
@Service
public class ProductManager {
	/** List of products for testing purposes */
	private List<Product> products;	
	
	/**
	 * No argument constructor that creates the testing products
	 */
	public ProductManager() {
		products = new ArrayList<>();
		
		Product product1 = new Product("prod123", "Levi's 501 Original Fit Jeans Jeans para Hombre", "100% algodón, Cierre de Cremallera, Lavar a máquina, Jeans corte ajustado, Pierna ajustada, Stretch especial que te brinda mayor movilidad", Collections.emptyList());
		List<Sku> childSkus1 = new ArrayList<>();		
		childSkus1.add(new Sku("sku1234", "Black", "29W X 32L", 1027.24, 1027.24, 500, 
				"https://dummyimage.com/50x50/000/fff", 
				"https://dummyimage.com/200x200/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		childSkus1.add(new Sku("sku1235", "Dark Stonewash", "29W X 32L", 1027.24, 706.93, 200,
				"https://dummyimage.com/50x50/000/0011ff",
				"https://dummyimage.com/200x200/000/0011ff",
				"https://dummyimage.com/500x500/000/0011ff"));
		product1.setChildSkus(childSkus1);
		
		products.add(product1);
		
		Product product2 = new Product("prod124", "Levi's Innovation Super Skinny Jeans para Mujer", "85% Algodón, 9% Elastomultiester, 6% Elastano, Lavar a máquina, Pantalón, Mezclilla, Cintura Media, Ajustado Desde la Cadera al Muslo, Pierna Súper Ajustada", Collections.emptyList());
		List<Sku> childSkus2 = new ArrayList<>();		
		childSkus2.add(new Sku("sku1236", "Black Galaxy", "25W X 30L", 661.79, 661.79, 300, 
				"https://dummyimage.com/50x50/000/fff", 
				"https://dummyimage.com/200x200/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		childSkus2.add(new Sku("sku1237", "Black Galaxy", "26W X 30L", 661.79, 661.79, 400, 
				"https://dummyimage.com/50x50/000/fff", 
				"https://dummyimage.com/200x200/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		childSkus2.add(new Sku("sku1238", "Black Galaxy", "27W X 30L", 661.79, 661.79, 800, 
				"https://dummyimage.com/50x50/000/fff", 
				"https://dummyimage.com/200x200/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		product2.setChildSkus(childSkus2);
		
		products.add(product2);		
	}
	
	/**
	 * Retrieve all the products
	 * @return List of products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * Retrieve an specific product based on a given product id
	 * @param id Product id
	 * @return Optional containing a product if the product was found or empty otherwise
	 */
	public Optional<Product> getProduct(final String id) {
		Optional<Product> foundProduct = Optional.empty();
		
		for (final Product product : products) {
			if (product.getId().equals(id)) {
				foundProduct = Optional.of(product);
				break;
			}
		}

		return foundProduct;
	}
	
	/**
	 * Add a new Product to the product list based on a given product
	 * @param newProduct Product to add
	 * @return An Optional containing the new product
	 */
	public Optional<Product> addProduct(final Product newProduct) {
		products.add(newProduct);
		return Optional.of(newProduct);
	}
	
	/**
	 * Delete the product based on a given product
	 * @param existingProduct The product to delete
	 */
	public void deleteProduct(final Product existingProduct) {
		products.remove(existingProduct);
	}
	
	/**
	 * Update an existing product based on a given modified product and a product id
	 * @param id The product id for the original product
	 * @param modifiedProduct The product new version
	 */
	public void updateProduct(final String id, final Product modifiedProduct) {
		final Optional<Product> existingProduct = getProduct(id);
		
		if (existingProduct.isPresent()) {
			final Product product = existingProduct.get();
			product.setId(modifiedProduct.getId());
			product.setName(modifiedProduct.getName());
			product.setDescription(modifiedProduct.getDescription());
			product.setChildSkus(modifiedProduct.getChildSkus());
		}
	}		
}
