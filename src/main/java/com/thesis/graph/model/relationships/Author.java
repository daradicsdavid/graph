package com.thesis.graph.model.relationships;

import com.thesis.graph.model.entities.Book;
import com.thesis.graph.model.entities.Person;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "AUTHORED")
public class Author extends BaseRelationship {

    private List<Author> authored = new ArrayList<>();

    @StartNode
    private Person person;

    @EndNode
    private Book book;
}
