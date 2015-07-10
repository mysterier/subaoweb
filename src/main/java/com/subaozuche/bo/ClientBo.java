package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.Client;

public interface ClientBo {
	public Client findById(int id);

	public List<Client> findAll();

	public void add(Client client);

	public void update(Client client);

	public void delete(int id);

}
