package com.thesis.graph.model.entities;

import com.thesis.graph.model.relationships.Author;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;


public class Book extends BaseEntity {

    @Getter
    @Setter
    private String title;

    @Getter
    @Relationship(type = "AUTHORED", direction = Relationship.INCOMING)
    private List<Author> authors;

    public void addAuthor(Author author) {
        if (this.authors == null) {
            this.authors = new ArrayList<>();
        }
        this.authors.add(author);
    }
}
