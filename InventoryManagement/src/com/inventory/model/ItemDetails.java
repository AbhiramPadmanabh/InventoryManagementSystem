package com.inventory.model;

public class ItemDetails {

	private static final serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column("item_code")
	private String itemCode;

	@Column("item_code")
	private String itemCode;

	@Column("item_name")
	private String itemName;

	@Column("category_name")
	private String categoryName;

	@Column("number_Of_Items")
	private Long numberOfItems;

	@Column("active_Yn")
	private Boolean activeYn;
}
