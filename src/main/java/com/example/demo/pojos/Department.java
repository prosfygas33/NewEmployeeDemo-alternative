package com.example.demo.pojos;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public final class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="description")
    private  String desc;

    public long getId() {
        return id;
    }


    public String getDesc() {
        return desc;
    }

}
