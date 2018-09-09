package com.thesis.graph.model.entities;


import com.thesis.graph.model.entities.base.Authored;
import com.thesis.graph.model.entities.base.BaseEntity;
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
    private List<Authored> authored = new ArrayList<>();

    @Relationship(type = "EDITOR")
    private List<Proceeding> proceedings = new ArrayList<>();
}
