package com.example.hib;

import com.example.hib.model.Actor;
import com.example.hib.service.MySqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

public class SbHibernateExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbHibernateExApplication.class, args);
    }

//    @Autowired
//    EntityManager entityManager;
//
//    @GetMapping(value = "/hi")
//    public void sut(){
//
//        entityManager.getEntityManagerFactory().getProperties().entrySet().
//                stream().
//                forEach(stringObjectEntry ->
//                        System.out.println("stringObjectEntry = " + stringObjectEntry.getKey()+" -- "+stringObjectEntry.getValue()));
//
//    }
}
