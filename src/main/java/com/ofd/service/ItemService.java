package com.ofd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ofd.entity.Item;
import com.ofd.entity.Restaurant;
import com.ofd.exception.RestaurantIdNotFoundException;
import com.ofd.exception.RestaurantListEmptyException;
import com.ofd.repo.ItemRepo;
import com.ofd.repo.RestaurantRepo;
@Service
public class ItemService {
	
	@Autowired

	 ItemRepo itemRepo;

	@Autowired
	RestaurantRepo restaurantRepo;
	public Item createItem(Item it) {
		
		List<Restaurant>  restaurant =it.getRestaurant();
		if(restaurant.size()>0)
		{
			List<Restaurant> newRestaurant= new ArrayList<>();
			for(int i=0;i<restaurant.size();i++)
			{
				Optional<Restaurant> restContainer = restaurantRepo.findById(restaurant.get(i).getRestaurantId());
				if(!(restContainer.isPresent()))
				{
					throw new RestaurantIdNotFoundException("restaurant is not found");
				}
				else {
					newRestaurant.add(restContainer.get());
					//cart.getVegetable().add(vegetableContainer.get());
				}
			}
			it.setRestaurant(newRestaurant);
		}
		else {
			throw new RestaurantListEmptyException("Restaurant List is Empty");
		}
		// TODO Auto-generated method stub
		return itemRepo.save(it);
	}

	public List<Item> getItem() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}

	public Item getItemById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllItem() {
		// TODO Auto-generated method stub
		try {

			 itemRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<Item> itContainer =  itemRepo.findById(id);
		 if(itContainer.isPresent()) {

			 Item oldObj = itContainer.get();

			 itemRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public Item updateItem(int id, Item obj) {
		 Optional<Item> itContainer=itemRepo.findById(id);
		   if(itContainer.isPresent()) {

		   return itContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}

}






