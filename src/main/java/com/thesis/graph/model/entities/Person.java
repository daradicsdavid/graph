package com.thesis.graph.model.entities;


import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Person extends BaseEntity {

    @Getter
    @Setter
    private String name;

    @Relationship(type = "AUTHOR")
    private List<Book> books = new ArrayList<>();
}
