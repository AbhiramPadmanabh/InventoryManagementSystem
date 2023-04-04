package com.inventory.controller;

@RestController
public class ImageController {
	@Autowired
	private FileStorageService fileStorageService;
	
	@PostMapping("/uploadImageFile")
	public UploadImage upload(@RequestParam("file") MultipartFile file)
	 String name = fileStorageService.storeFile(file);
	
	String fileDownloadUri = ServletUriComponentsBuiler.fromCurrentContextPath().path("/download").path(name).toUriString();
	return new UploadImage(name,fileDownloadUri,file.getContentType(),file.getSize());
}
