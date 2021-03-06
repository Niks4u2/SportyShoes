package com.nikhil.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.sportyshoes.model.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
