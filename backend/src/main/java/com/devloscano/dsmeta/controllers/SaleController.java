package com.devloscano.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devloscano.dsmeta.entities.Sale;
import com.devloscano.dsmeta.services.SaleSerivce;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleSerivce service;
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();
	}
}
