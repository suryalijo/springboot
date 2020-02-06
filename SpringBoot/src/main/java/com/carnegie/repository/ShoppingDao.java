package com.carnegie.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carnegie.bean.Item;

@Repository
public interface ShoppingDao extends CrudRepository<Item, Long> {

//	public boolean addItem(Item item);
//
//	Item getItem(int theId);
}
