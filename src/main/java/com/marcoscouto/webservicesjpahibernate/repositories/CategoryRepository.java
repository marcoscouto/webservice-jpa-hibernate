package com.marcoscouto.webservicesjpahibernate.repositories;

import com.marcoscouto.webservicesjpahibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
