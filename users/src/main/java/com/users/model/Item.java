package com.users.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "items")
public class Item {
	@Id
	private String id;
	private String itemName;
	private String itemDesc;
	private String itemPrice;
	private String itemCuisine;
	private int itemQuantity;

	public Item() {
	}

	

	public Item(String id, String itemName, String itemDesc, String itemPrice, String itemCuisine, int itemQuantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
		this.itemCuisine = itemCuisine;
		this.itemQuantity = itemQuantity;
	}



	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCuisine() {
		return itemCuisine;
	}

	public void setItemCuisine(String itemCuisine) {
		this.itemCuisine = itemCuisine;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice=" + itemPrice
				+ ", itemCuisine=" + itemCuisine + ", itemQuantity=" + itemQuantity + "]";
	}


}
