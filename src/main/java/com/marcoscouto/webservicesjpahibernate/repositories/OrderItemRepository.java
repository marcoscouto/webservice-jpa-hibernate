package com.marcoscouto.webservicesjpahibernate.repositories;

import com.marcoscouto.webservicesjpahibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
