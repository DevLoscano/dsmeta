package com.devloscano.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devloscano.dsmeta.entities.Sale;
import com.devloscano.dsmeta.repositories.SaleRepository;

@Service
public class SaleSerivce {

	@Autowired
	private SaleRepository repository;

	public Page<Sale> findSales(String minDate,String maxDate,Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		
		return repository.findSales(min, max, pageable);
	}
}
