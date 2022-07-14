package com.devloscano.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devloscano.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {

}
