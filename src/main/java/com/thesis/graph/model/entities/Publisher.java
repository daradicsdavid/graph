package com.thesis.graph.model.entities;

import com.thesis.graph.model.entities.base.BaseEntity;
import com.thesis.graph.model.relationships.Publish;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Publisher extends BaseEntity {

    @Getter
    @Setter
    private String name;

    @Getter
    @Relationship(type = "PUBLISH", direction = Relationship.INCOMING)
    private List<Publish> publishes;

    public void addPublish(Publish publish) {
        if (this.publishes == null) {
            this.publishes = new ArrayList<>();
        }
        this.publishes.add(publish);
    }

}
