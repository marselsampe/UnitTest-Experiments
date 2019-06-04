package com.marselsampe.unittest.mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.marselsampe.unittest.mock.Food;
import com.marselsampe.unittest.mock.FoodService;
import com.marselsampe.unittest.mock.IFoodDAO;
import com.marselsampe.unittest.mock.MSSQLFoodDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodServiceTest {
	IFoodDAO foodDAO;
	
	public FoodServiceTest() {
		List<Food> foods = new ArrayList<Food>(Arrays.asList(
                new Food("Mega Burger", "Burger"),
                new Food("Crispy Chicken Burger", "Burger"),
                new Food("Italian Pizza", "Pizza"),
                new Food("Beef Pizza", "Pizza"),
                new Food("Coca Cola", "Baverage"),
                new Food("Pepsi", "Baverage")));
		
		foodDAO = mock(MSSQLFoodDAO.class);
	    when(foodDAO.findAll()).thenReturn(foods);
	}
	
	@Test
	public void testFindFoodByCategory() {	
		FoodService foodService = new FoodService();
		foodService.setFoodDAO(this.foodDAO);

		
		List<Food> baverages = foodService.findFoodByCategory("Baverage");
		assertEquals(2, baverages.size());
		
		List<Food> burgers = foodService.findFoodByCategory("Burger");
		assertEquals(2, burgers.size());		
	}
	
	@Test
	public void testGetTotalFoods() {
		FoodService foodService = new FoodService();
		foodService.setFoodDAO(this.foodDAO);
		
		int totalFoods = foodService.getTotalFoods();
		assertEquals(6, totalFoods);
	}
}
