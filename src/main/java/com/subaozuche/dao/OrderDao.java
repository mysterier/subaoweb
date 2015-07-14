package com.subaozuche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.Order;

public interface OrderDao {

	@Select("SELECT id, city_id AS cityId, rent_time AS rentTime, contact_name AS contactName, "
			+ "contact_phone AS contactPhone, rent_type AS rentType, rent_other AS rentOther, "
			+ "client_id AS clientId, created_at AS createdAt FROM tbl_order WHERE id=#{id}")
	public Order findById(int id);

	@Select("SELECT id, city_id AS cityId, rent_time AS rentTime, contact_name AS contactName, "
			+ "contact_phone AS contactPhone, rent_type AS rentType, rent_other AS rentOther, "
			+ "client_id AS clientId, created_at AS createdAt FROM tbl_order")
	public List<Order> findAll();

	public void add(Order order);

	@Update("UPDATE tbl_order SET city_id=#{cityId}, rent_time=#{rentTime}, contact_name=#{contactName},  "
			+ "contact_phone=#{contactPhone}, rent_type=#{rentType}, rent_other=#{rentOther}, client_id=#{clientId} "
			+ "WHERE id=#{id}")
	public void update(Order order);

	@Delete("DELETE FROM tbl_order WHERE id=#{id}")
	public void delete(int id);
}
