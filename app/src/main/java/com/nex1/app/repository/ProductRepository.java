package com.nex1.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex1.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ 
	List<Product> findTop3ByOrderByResdateDesc();
	List<Product> findByCate(String cate);
}
