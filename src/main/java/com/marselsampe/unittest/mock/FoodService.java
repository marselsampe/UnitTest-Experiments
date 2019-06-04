package com.marselsampe.unittest.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FoodService implements IFoodService {
	IFoodDAO foodDAO;
	
	public void setFoodDAO( IFoodDAO foodDAO ) {
		this.foodDAO = foodDAO;
	}
	
	@Override
	public List<Food> findFoodByCategory( String category ){
        List<Food> foods = new ArrayList<Food>(foodDAO.findAll());
        
        if( foods != null ) {
	        Iterator<Food> foodsIterator = foods.iterator();
	        while (foodsIterator.hasNext()) {
	            Food food = foodsIterator.next();
	            if (!food.getCategory().equals(category)) {
	                foodsIterator.remove();
	            }
	        }
        }
        
        return foods;
	}
	
	@Override
	public int getTotalFoods() {
		return foodDAO.findAll().size();
	}
}
