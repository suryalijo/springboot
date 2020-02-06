package com.rvs.service;


import java.util.List;

import com.rvs.bean.Item;


public interface ShoppingService {


	public boolean addItem(Item item);
	
	public Item getItemById(String id);
	

	public List<Item> getAllItems();

}
