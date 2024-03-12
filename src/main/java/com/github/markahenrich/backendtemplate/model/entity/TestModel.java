package com.github.markahenrich.backendtemplate.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
}
