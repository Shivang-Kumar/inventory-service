package com.practice.microservices.inventory_service.services;

import org.springframework.stereotype.Service;

import com.practice.microservices.inventory_service.repositories.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;
	
	public boolean isInStock(String skuCode,Integer quantity)
	{
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
	}

}
