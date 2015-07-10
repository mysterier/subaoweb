package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.Order;

public interface OrderBo {
	public Order findById(int id);

	public List<Order> findAll();

	public void add(Order order);

	public void update(Order order);

	public void delete(int id);
}
