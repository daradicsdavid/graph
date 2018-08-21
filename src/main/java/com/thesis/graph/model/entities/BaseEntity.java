package com.thesis.graph.model.entities;

import lombok.Getter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
class BaseEntity {

    @Id
    @GeneratedValue
    @Getter
    Long id;
}
