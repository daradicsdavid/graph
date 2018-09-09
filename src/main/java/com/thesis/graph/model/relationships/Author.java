package com.thesis.graph.model.relationships;

import com.thesis.graph.model.entities.base.Authored;
import com.thesis.graph.model.entities.Person;
import lombok.Getter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "AUTHOR")
public class Author extends BaseRelationship {

    @Getter
    @StartNode
    private Person person;

    @Getter
    @EndNode
    private Authored authored;

    public Author() {
    }

    public Author(Authored authored, Person person) {
        this.authored = authored;
        this.person = person;
    }
}
