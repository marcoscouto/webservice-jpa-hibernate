package com.marcoscouto.webservicesjpahibernate.repositories;

import com.marcoscouto.webservicesjpahibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
