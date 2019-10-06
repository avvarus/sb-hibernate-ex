package com.example.hib.repository;

import com.example.hib.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@Transactional
public class MySqlRepo {

    @Autowired
    EntityManager entityManager;

    public Actor getByActorId(int actorId) {
        return entityManager.find(Actor.class, actorId);
    }


    public List<Actor> getListOfActors() {
        // todo this needs named queries
        return null;
    }

    public void saveActor(Actor actor) {
        entityManager.persist(actor);
    }

    public void removeActor(int actorId) {
        //fetch and then delete
        entityManager.remove(getByActorId(actorId));
    }
}
