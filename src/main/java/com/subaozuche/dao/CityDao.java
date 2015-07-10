package com.subaozuche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.City;

public interface CityDao {

	@Select("SELECT id, city_name AS cityName FROM tbl_city WHERE id=#{id}")
	public City findById(int id);

	@Select("SELECT id, city_name AS cityName FROM tbl_city")
	public List<City> findAll();

	public void add(City city);

	@Update("UPDATE tbl_city SET city_name=#{cityName} WHERE id=#{id}")
	public void update(City city);

	@Delete("DELETE FROM tbl_city WHERE id=#{id}")
	public void delete(int id);
}
