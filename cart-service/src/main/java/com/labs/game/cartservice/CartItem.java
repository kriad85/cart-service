package com.labs.game.cartservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "cartitems")
public class CartItem {
    @Id
    private Integer id;
    @Column
    private String customer;
    @Column
    private String product;
    @Column
    private int quantity;
    
    public CartItem() {
    	
    }
    public CartItem(int id, String customer, String product, int quantity) {
    	this.id = id;
    	this.customer = customer;
    	this.product = product;
    	this.quantity = quantity;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}