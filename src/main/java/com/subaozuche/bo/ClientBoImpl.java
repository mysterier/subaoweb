package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.ClientDao;
import com.subaozuche.model.Client;

@Service("clientBo")
public class ClientBoImpl implements ClientBo{

	@Autowired
	private ClientDao clientDao;
	
	@Override
	public Client findById(int id) {
		return clientDao.findById(id);
	}

	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public void add(Client client) {
		clientDao.add(client);
	}

	@Override
	public void update(Client client) {
		clientDao.update(client);
	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}
	
	@Override
	public Client findByClientName(String clientName) {
		return clientDao.findByClientName(clientName);
	}
}
