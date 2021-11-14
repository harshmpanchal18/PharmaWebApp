package com.psl.miniProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.psl.miniProject.modal.Products;

public interface AdminProductsRepository extends CrudRepository<Products,Integer> {

}
