package com.subaozuche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.Client;

public interface ClientDao {
	@Select("SELECT id, mobile, client_name AS clientName, client_pass AS clientPass, client_email AS clientEmail,"
			+ " created_at AS createdAt, updated_at AS updatedAt FROM tbl_client WHERE id=#{id}")
	public Client findById(int id);

	@Select("SELECT id, mobile, client_name AS clientName, client_pass AS clientPass, client_email AS clientEmail,"
			+ " created_at AS createdAt, updated_at AS updatedAt FROM tbl_client")
	public List<Client> findAll();

	public void add(Client client);

	@Update("UPDATE tbl_client SET mobile=#{mobile}, client_name=#{clientName}, client_pass=#{clientPass}, "
			+ "client_email=#{clientEmail}, updated_at=#{updatedAt} WHERE id=#{id}")
	public void update(Client client);

	@Delete("DELETE FROM tbl_client WHERE id=#{id}")
	public void delete(int id);
	
	@Select("SELECT id, client_name AS clientName, client_pass AS clientPass, updated_at AS updatedAt "
			+ "FROM `tbl_client` WHERE client_name=#{clientName} ")
	public Client findByClientName(String clientName);
}
