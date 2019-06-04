package com.marselsampe.unittest.mock;

import java.util.List;

public interface IFoodService {
	public List<Food> findFoodByCategory( String category );
	public int getTotalFoods();
}