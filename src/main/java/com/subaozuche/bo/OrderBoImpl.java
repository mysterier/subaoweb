package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.OrderDao;
import com.subaozuche.model.Order;

@Service("orderBo")
public class OrderBoImpl implements OrderBo {

	@Autowired
	private OrderDao orderDao;

	@Override
	public Order findById(int id) {
		return orderDao.findById(id);
	}

	@Override
	public List<Order> findAll() {
		return orderDao.findAll();
	}

	@Override
	public void add(Order order) {
		orderDao.add(order);
	}

	@Override
	public void update(Order order) {
		orderDao.update(order);
	}

	@Override
	public void delete(int id) {
		orderDao.delete(id);
	}

}
