package com.thesis.graph.model.entities;

import com.thesis.graph.model.relationships.Editor;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proceeding extends BaseEntity {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String conferenceLocale;

    @Getter
    @Setter
    private Date conferenceTime;

    @Getter
    @Setter
    private String conferenceUrl;

    @Getter
    @Setter
    private String isbn;

    @Getter
    @Setter
    private String doi;

    @Getter
    @Setter
    private Integer releaseYear;

    @Getter
    @Setter
    private String onlineLink;

    @Getter
    @Relationship(type = "EDITOR", direction = Relationship.INCOMING)
    private List<Editor> editors;

    public void addEditor(Editor editor) {
        if (this.editors == null) {
            this.editors = new ArrayList<>();
        }
        this.editors.add(editor);
    }

}
