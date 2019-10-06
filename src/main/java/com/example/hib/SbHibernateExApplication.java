package com.example.hib;

import com.example.hib.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SbHibernateExApplication {

    @Autowired
    private MySqlService mySqlService;

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


    /**
     * this annotation must be
     * from the place where the
     * repo is called
     */
    @GetMapping(value = "/actor/{actorId}")
    public Actor getByActorId(@PathVariable int actorId) {
        return mySqlService.getActorById(actorId);
    }


    @PostMapping(value = "/save")
    public String saveActor(@RequestBody Actor actor) {
        mySqlService.saveActor(actor);
        return "Saved !!";
    }

}
