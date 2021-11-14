package com.psl.miniProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.miniProject.modal.Products;
import com.psl.miniProject.repository.ProductsRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	//get all products
	@GetMapping("/")
	public List<Products> getAllProducts(){
		return (List<Products>)productsRepository.findAll();
	}
	
	//get all categories name
	@GetMapping("/categories")
	public List<String> getAllCategory(){
		return (List<String>)productsRepository.findAllCategory();
	}
	
	//get all products by category
	@GetMapping("/category/{name}")
	public List<Products> getByCategory(@PathVariable("name") String name){
		return (List<Products>)productsRepository.findByCategory(name);
	}
	
	//get products by ID
	@GetMapping("/{id}")
	public Optional<Products> getById(@PathVariable("id") int id) {
		return productsRepository.findById(id);
	}

}
