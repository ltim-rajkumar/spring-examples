package com.ltim.practice.service;

import com.ltim.practice.model.Address;
import com.ltim.practice.repository.HelloRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class HelloService {

    private String name;
    private Address address;

    @Autowired
    private HelloRepository helloRepository;

    public void hello() {
        System.out.println("Hello " + name + " from " + address.getCity().getName() + " !!");
        System.out.println("**************************");

        System.out.println(helloRepository.helloRepo());

    }

}
