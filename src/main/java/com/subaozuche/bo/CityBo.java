package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.City;

public interface CityBo {
	public City findById(int id);

	public List<City> findAll();

	public void add(City city);

	public void update(City city);

	public void delete(int id);

}
