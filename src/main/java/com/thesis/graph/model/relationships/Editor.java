package com.thesis.graph.model.relationships;

import com.thesis.graph.model.entities.Book;
import com.thesis.graph.model.entities.Person;
import com.thesis.graph.model.entities.Proceeding;
import lombok.Getter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "EDITOR")
public class Editor extends BaseRelationship {

    @Getter
    @StartNode
    private Person person;

    @Getter
    @EndNode
    private Proceeding proceeding;

    public Editor() {
    }

    public Editor(Proceeding proceeding, Person person) {
        this.proceeding = proceeding;
        this.person = person;
    }
}
