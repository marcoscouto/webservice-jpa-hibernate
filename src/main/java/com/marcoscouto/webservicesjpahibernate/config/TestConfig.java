package com.marcoscouto.webservicesjpahibernate.config;

import com.marcoscouto.webservicesjpahibernate.entities.Category;
import com.marcoscouto.webservicesjpahibernate.entities.Order;
import com.marcoscouto.webservicesjpahibernate.entities.User;
import com.marcoscouto.webservicesjpahibernate.entities.enums.OrderStatus;
import com.marcoscouto.webservicesjpahibernate.repositories.CategoryRepository;
import com.marcoscouto.webservicesjpahibernate.repositories.OrderRepository;
import com.marcoscouto.webservicesjpahibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "12345");
        User u2 = new User(null, "Bono Vox", "bono@gmail.com", "8888888", "hellohello");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));



    }
}
