package com.carnegie.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carnegie.bean.Item;
import com.carnegie.repository.ShoppingDao;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	 @Autowired
	private ShoppingDao shoppingDao;
	
	private List<Item> itemList= new ArrayList<>();

	ShoppingServiceImpl(){
		itemList.add(new Item("001", "Pen"));
		itemList.add(new Item("002", "Paper"));
		itemList.add(new Item("003", "Mac"));
		itemList.add(new Item("004", "Windows"));
	}
	
	public Item getItemById(String id) {
		Item retumeItem = null;
		for (Iterator iterator = itemList.iterator(); iterator.hasNext();) {
			Item item = (Item) iterator.next();
			 if(item.getItemype().equals(id)) {
				 retumeItem =item; 
				 break;
			 }
			
		}
		this.addItem(retumeItem);
		return retumeItem;
	}

	public List<Item> getAllItems() {
		return itemList;
	}
	
	
	@Transactional
	@Override
	public boolean addItem(Item item) {
		// TODO Auto-generated method stub
		try {
			shoppingDao.save(item);
		}catch (Exception e) {
			return false;
		}
		return true;
	}

}
