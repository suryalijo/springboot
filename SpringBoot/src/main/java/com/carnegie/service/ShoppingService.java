package com.carnegie.service;


import java.util.List;



import com.carnegie.bean.Item;


public interface ShoppingService {


	public boolean addItem(Item item);
	
	public Item getItemById(String id);
	

	public List<Item> getAllItems();

}
