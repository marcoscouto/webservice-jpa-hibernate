package com.marcoscouto.webservicesjpahibernate.repositories;

import com.marcoscouto.webservicesjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
