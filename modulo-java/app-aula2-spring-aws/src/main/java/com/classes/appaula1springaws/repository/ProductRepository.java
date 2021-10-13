package com.classes.appaula1springaws.repository;

import com.classes.appaula1springaws.table.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
