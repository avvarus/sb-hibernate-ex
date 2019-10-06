package com.example.hib.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Actor {


    /**
     * strategy = GenerationType.IDENTITY, to continue inserting to table
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //not necessary for retreving records
    @Column(name = "actor_id", nullable = false, updatable = false)
    private int actorId;
    private String firstName;
    private String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //private String lastUpdate;
}
