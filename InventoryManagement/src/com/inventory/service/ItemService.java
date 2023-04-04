package com.inventory.service;

import java.util.List;

import com.inventory.dto.ItemDTO;

public interface ItemService {
	ItemDTO saveItems(ItemDTO items);

	List<ItemDTO> fetchItemDetails();

	void deleteItemById(Long id);
}
