package com.ltim.practice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String helloRepo() {
        return "Hello, I'm from HelloRepository";
    }

}
