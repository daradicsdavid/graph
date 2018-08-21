package com.thesis.graph.model.relationships;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

class BaseRelationship {
    @Id
    @GeneratedValue
    private Long id;


}
