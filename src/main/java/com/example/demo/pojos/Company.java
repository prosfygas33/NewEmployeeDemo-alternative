package com.example.demo.pojos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public final class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name="Name")
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
