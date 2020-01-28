package com.marcoscouto.webservicesjpahibernate.config;

import com.marcoscouto.webservicesjpahibernate.entities.User;
import com.marcoscouto.webservicesjpahibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "12345");
        User u2 = new User(null, "Bono Vox", "bono@gmail.com", "8888888", "hellohello");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
