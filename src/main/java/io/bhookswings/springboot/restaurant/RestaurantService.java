package io.bhookswings.springboot.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

	
	
	 private  List<Restaurant> restaurants = new ArrayList<>(Arrays.asList(
				new Restaurant("1","Burger Barn","Burgers"),
				new Restaurant("2","Burger 69","Burgers"),
				new Restaurant("3","Punjabi Rasoi","North Indian"),
				new Restaurant("4","Social","Cafe")		
			));
	 
	 public  List<Restaurant> getAllRestaurants()
	 {
		 return restaurants;
	 }
	 
	 public Restaurant getRestaurant(String id)
	 {
		 return restaurants.stream().filter(t -> t.getId().equals(id)).findFirst().get(); 
	 }
	 
	 public void addRestaurant(Restaurant restaurant)
	 {
		 restaurants.add(restaurant);
	 }
	 
	 public void updateRestaurant(Restaurant restaurant, String id)
	 {
		 	
		 	for(int i=0;i<restaurants.size();i++)
		 	{	Restaurant r = restaurants.get(i);
		 		if(r.getId().equals(id))
		 		{
		 			restaurants.set(i, restaurant);
		 		}
		 			
		 	}
	 }
	 
	 public void deleteRestaurant(String id)
	 {
		 	
		 	restaurants.removeIf(t->t.getId().equals(id));
	 }
	 
}
