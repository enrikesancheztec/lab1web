/*
 * Product
 * Version 1.0
 * August 14, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.vo;

import java.util.List;

/**
 * Product Value Object to store the product attributtes
 * @author Enrique Sanchez
 * @version 1.0
 */
public class Product {
	private String id;
	private String name;
	private String description;
	private List<Sku> childSkus;
	
	/**
	 * No arguments constructor
	 */
	public Product() {
	}

	/**
	 * Constructor including all the properties
	 * @param id Product id
	 * @param name Product name
	 * @param description Product description
	 * @param childSkus List of Product Skus
	 */
	public Product(final String id, final String name, final String description, final List<Sku> childSkus) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.childSkus = childSkus;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(final String id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * @return the childSkus
	 */
	public List<Sku> getChildSkus() {
		return childSkus;
	}
	
	/**
	 * @param childSkus the childSkus to set
	 */
	public void setChildSkus(final List<Sku> childSkus) {
		this.childSkus = childSkus;
	}
}
