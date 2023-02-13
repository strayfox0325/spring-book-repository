package com.isidora.bookrepository;

import com.isidora.bookrepository.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookRepositoryApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookRepositoryApplication.class, args);
        System.out.println("Finished");
    }

    @Autowired
    private TitleRepository titleRepository;

    @Override
    public void run(String... args) throws Exception {


    }
}
