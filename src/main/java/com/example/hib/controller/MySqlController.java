package com.example.hib.controller;


import com.example.hib.SbHibernateExApplication;
import com.example.hib.model.Actor;
import com.example.hib.service.MySqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class MySqlController {

    @Autowired
    private MySqlService mySqlService;

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


    /**
     * @param actor
     * @return
     */
    @PostMapping(value = "/save")
    public String saveActor(@RequestBody Actor actor) {
        mySqlService.saveActor(actor);
        return "Saved !!";
    }

    /**
     * Remove
     *
     * @param removeId
     * @return
     */
    @DeleteMapping(value = "remove/{removeId}")
    public String removed(@PathVariable int removeId) {

        mySqlService.removeActor(removeId);
        return "removed";
    }

}
