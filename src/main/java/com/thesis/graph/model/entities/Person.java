package com.thesis.graph.model.entities;


import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Person extends BaseEntity {

    private String name;

    @Relationship(type = "AUTHORED")
    private List<Book> books = new ArrayList<>();
}
