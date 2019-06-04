package com.marselsampe.unittest.mock;

import java.util.List;

public class MSSQLFoodDAO implements IFoodDAO{

	@Override
	public List<Food> findAll() {
		return null;
	}

	@Override
	public Food findByName(String name) {
		return null;
	}

	@Override
	public boolean insertFood(Food food) {
		return false;
	}

	@Override
	public boolean updateFood(Food food) {
		return false;
	}

	@Override
	public boolean deleteFood(Food food) {
		return false;
	}

}
