package com.thesis.graph.model.relationships;

import com.thesis.graph.model.entities.Book;
import com.thesis.graph.model.entities.Publisher;
import lombok.Getter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "PUBLISH")
public class Publish extends BaseRelationship {

    @Getter
    @StartNode
    private Book book;

    @Getter
    @EndNode
    private Publisher publisher;

    public Publish(Book book, Publisher publisher) {
        this.book = book;
        this.publisher = publisher;
    }

    public Publish() {
    }
}
