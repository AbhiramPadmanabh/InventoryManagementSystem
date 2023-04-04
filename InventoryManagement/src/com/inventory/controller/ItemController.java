package com.inventory.controller;

import java.net.URISyntaxException;
import java.util.List;

import com.inventory.dto.ItemDTO;
import com.inventory.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;

	@PostMapping("save/items")

	public ItemController saveItem(@RequestBody @Valid List<ItemDTO> items) throws URISyntaxException {
		return itemService.saveItems(items);
	}

	@GetMapping("get/items")
	public List<ItemDTO> fetchItems() {
		return itemService.fetchItemDetails();
	}

	@DeleteMapping("delete/items")
	public String DeleteItem(@PathVariable("id") Long id) {
		itemService.deleteItemById(itemId);

	}
}
