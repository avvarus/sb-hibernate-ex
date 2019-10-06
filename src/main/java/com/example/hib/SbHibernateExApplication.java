package com.example.hib;

import com.example.hib.model.Actor;
import com.example.hib.repository.MySqlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
@RestController
public class SbHibernateExApplication {

    @Autowired
    private MySqlRepo mySqlRepo;

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

    @GetMapping(value = "/hi")
    public String getString() {
        return "Hello World !!";
    }


    @GetMapping(value = "/actor/{actorId}")
    @Transactional
    /** this annotation must be
     * from the place where the
     * repo is called
     */

    public String getByActorId(@PathVariable int actorId) {

        Actor actor = mySqlRepo.getAllByActorId(actorId);

        System.out.println("Actor -- " + actor);
        mySqlRepo.saveActor();
        return "Returned !!";
    }

}
