package com.devloscano.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devloscano.dsmeta.entities.Sale;
import com.devloscano.dsmeta.repositories.SaleRepository;

@Service
public class SaleSerivce {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
