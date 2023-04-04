package com.inventory.dto;

public class ItemDTO {

	private Long id;

	private String itemCode;

	private String itemName;

	private String categoryName;

	private Long numberOfItems;

	private Boolean activeYn;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Long numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public Boolean getActiveYn() {
		return activeYn;
	}

	public void setActiveYn(Boolean activeYn) {
		this.activeYn = activeYn;
	}

	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", itemCode=" + itemCode + ", itemName=" + itemName + ", categoryName="
				+ categoryName + ", numberOfItems=" + numberOfItems + ", activeYn=" + activeYn + "]";
	}

}
