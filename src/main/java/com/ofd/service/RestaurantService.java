package com.ofd.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofd.entity.Item;
import com.ofd.entity.Restaurant;
import com.ofd.exception.ItemIdNotFoundException;
import com.ofd.exception.ItemListEmptyException;
import com.ofd.repo.ItemRepo;
import com.ofd.repo.RestaurantRepo;
@Service
public class RestaurantService {
	
	@Autowired

	 RestaurantRepo   restaurantRepo;

	ItemRepo itemRepo;
	public Restaurant createRestaurant(Restaurant rest) {
		// TODO Auto-generated method stub
		
		List<Item>  itemList =rest.getItemList();
		if(itemList.size()>0)
		{
			List<Item> newItemList= new ArrayList<>();
			for(int i=0;i<itemList.size();i++)
			{
				Optional<Item> itContainer = itemRepo.findById(itemList.get(i).getItemId());
				if(!(itContainer.isPresent()))
				{
					throw new ItemIdNotFoundException("item is not found");
				}
				else {
					newItemList.add(itContainer.get());
					//cart.getVegetable().add(vegetableContainer.get());
				}
			}
			rest.setItemList(newItemList);
		}
		else {
			throw new ItemListEmptyException("Item List is Empty");
		}
		return restaurantRepo.save(rest);
	}

	public List<Restaurant> getRestaurant() {
		// TODO Auto-generated method stub
		return restaurantRepo.findAll();
	}

	public Restaurant getRestaurantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllRestaurants() {
		// TODO Auto-generated method stub
		try {

			 restaurantRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<Restaurant> restContainer =  restaurantRepo.findById(id);
		 if(restContainer.isPresent()) {

			 Restaurant oldObj = restContainer.get();

			 restaurantRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public Restaurant updateRestaurant(int id, Restaurant obj) {
		 Optional<Restaurant> restContainer=restaurantRepo.findById(id);

		   if(restContainer.isPresent()) {

		   return restContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}
}




