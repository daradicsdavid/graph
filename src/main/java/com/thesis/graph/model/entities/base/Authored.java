package com.thesis.graph.model.entities.base;

import com.thesis.graph.model.relationships.Author;
import lombok.Getter;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Authored extends BaseEntity {
    @Getter
    @Relationship(type = "AUTHOR", direction = Relationship.INCOMING)
    private List<Author> authors;

    public void addAuthor(Author author) {
        if (this.authors == null) {
            this.authors = new ArrayList<>();
        }
        this.authors.add(author);
    }
}
