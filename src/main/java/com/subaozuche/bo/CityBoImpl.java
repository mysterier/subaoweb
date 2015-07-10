package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.CityDao;
import com.subaozuche.model.City;

@Service("cityBo")
public class CityBoImpl implements CityBo {

	@Autowired
	private CityDao cityDao;

	@Override
	public City findById(int id) {
		return cityDao.findById(id);
	}

	@Override
	public List<City> findAll() {
		return cityDao.findAll();
	}

	@Override
	public void add(City city) {
		cityDao.add(city);
	}

	@Override
	public void update(City city) {
		cityDao.update(city);
	}

	@Override
	public void delete(int id) {
		cityDao.delete(id);
	}

}
