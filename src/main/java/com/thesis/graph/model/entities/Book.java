package com.thesis.graph.model.entities;

import com.thesis.graph.model.entities.base.Authored;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Relationship;


public class Book extends Authored {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private Integer pageNumber;

    @Getter
    @Setter
    private String isbn;

    @Getter
    @Setter
    private String language;

    @Getter
    @Setter
    private Integer releaseYear;

    @Relationship(type = "PUBLISH")
    private Publisher publisher;
}
