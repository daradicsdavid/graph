package com.thesis.graph.model.entities.base;

import lombok.Getter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class BaseEntity {

    @Id
    @GeneratedValue
    @Getter
    Long id;
}
