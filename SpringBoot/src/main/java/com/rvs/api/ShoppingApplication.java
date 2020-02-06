package com.rvs.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rvs.bean.Item;
import com.rvs.service.ShoppingService;

@SpringBootApplication(scanBasePackages={
		"com.rvs.service","com.rvs.bean","com.rvs.dao"})
@RestController
@EntityScan("com.rvs.bean")
@EnableJpaRepositories("com.rvs.repository")
@RequestMapping(value = "/shopping")
public class ShoppingApplication {

	@Autowired
	private ShoppingService shoppingService;
	

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

   @GetMapping("/")
	public String hello() {
	  return "Hello World";
	}
	

   @GetMapping("/getItemById")
	public Item getItemById(@RequestParam(value = "item") String itemobj) {
	  return shoppingService.getItemById(itemobj);
	}
	
   @GetMapping(value = "/getAllItems")
	public List<Item> getAllItems() {
	  return shoppingService.getAllItems();
	}
}
