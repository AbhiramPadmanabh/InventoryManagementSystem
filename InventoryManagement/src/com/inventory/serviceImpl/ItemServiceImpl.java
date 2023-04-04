package com.inventory.serviceImpl;

import com.inventory.dto.ItemDTO;
import com.inventory.repository.ItemRepository;
import com.inventory.service.ItemService;

public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public ItemDTO saveItems(ItemDTO items) {

		return itemRepository.save(items);
	}

	@Override
	public java.util.List<ItemDTO> fetchItemDetails() {

		return (java.util.List<ItemDTO>) itemRepository.findAll();
	}

	@Override
	public void deleteItemById(Long id) {

		itemRepository.deleteById(id);
	}
}
