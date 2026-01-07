package com.practice.microservices.inventory_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.microservices.inventory_service.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {


	boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);

}
