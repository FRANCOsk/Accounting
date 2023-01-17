package com.example.Accounting.model;

import jakarta.persistence.*;

@Entity

public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private int fee;


    private String name;


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
