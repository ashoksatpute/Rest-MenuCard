package com.menuapi.menuapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	@Id
	private long id;
	private String name;
	private String type;
	private int price;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
  
	
	
	
	
}
