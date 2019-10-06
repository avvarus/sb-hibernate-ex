package com.example.hib.service;


import com.example.hib.model.Actor;
import com.example.hib.repository.MySqlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MySqlService {

    @Autowired
    private MySqlRepo mySqlRepo;

    /**
     * Get Actor by id
     *
     * @param actorId
     * @return
     */
    public Actor getActorById(int actorId) {
        return mySqlRepo.getByActorId(actorId);
    }

    /**
     * Save actor
     *
     * @param actor
     */
    public void saveActor(Actor actor) {
        mySqlRepo.saveActor(actor);
    }


    public void removeActor(int actorId) {
        mySqlRepo.removeActor(actorId);
    }
}
