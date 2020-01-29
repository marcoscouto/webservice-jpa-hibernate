package com.marcoscouto.webservicesjpahibernate.repositories;

import com.marcoscouto.webservicesjpahibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
