package com.thesis.graph.model.relationships;

import com.thesis.graph.model.entities.Book;
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
    private Book book;

    public Author() {
    }

    public Author(Book book, Person person) {
        this.book = book;
        this.person = person;
    }
}
