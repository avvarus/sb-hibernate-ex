package com.example.hib.repository;

import com.example.hib.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class MySqlRepo {

    @Autowired
    EntityManager entityManager;

    public Actor getAllByActorId(int actorId) {
        return entityManager.find(Actor.class, actorId);
    }

    public List<Actor> getListOfActors() {

        return null;
    }

    public void saveActor(Actor actor) {
        entityManager.persist(actor);
    }

}
