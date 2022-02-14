package com.example.mybatis.sandbox;

import com.example.mybatis.sandbox.mapper.AuthorMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatis.sandbox.mapper")
@SpringBootApplication
public class MybatisSandboxApplication implements CommandLineRunner {

    @Autowired
    private AuthorMapper authorMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisSandboxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        authorMapper.listAll().forEach(author -> System.out.println(author));

    }
}
