package com.marselsampe.unittest.mock;

import java.util.List;

public interface IFoodDAO {
	List<Food> findAll();
	Food findByName(String name);
	boolean insertFood(Food food);
	boolean updateFood(Food food);
	boolean deleteFood(Food food);
}
