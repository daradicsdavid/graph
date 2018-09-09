package com.thesis.graph.model.entities;


import com.thesis.graph.model.entities.base.Authored;
import lombok.Getter;
import lombok.Setter;

public class ConferenceArticle extends Authored {

    @Getter
    @Setter
    private String title;


    //TODO MI ez???
    @Getter
    @Setter
    private String conferencePublication;

    @Getter
    @Setter
    private Integer pageNumber;

    @Getter
    @Setter
    private String summary;

    //TODO Ez valószínűleg külön entitás kéne legyen ha jól értem a funkcióját, mivel a Neo4j nem támogatja már az array típust, azzal az okkal hogy az entitások jobban használhatóak mint egy internal array.
    @Getter
    @Setter
    private String keywords;

    @Getter
    @Setter
    private Integer releaseYear;

    //TODO Ezt így kell hívni?
    @Getter
    @Setter
    private String onlineLink;

    //TODO Ennek kell valami külön típus, vagy speciális "care".Ugyanez az isbn-re.
    @Getter
    @Setter
    private String doi;

    //TODO Ez később egy azonosító lesz egy fáljra egy Object Store-ban(pl mongo) ha jól értem.
    @Getter
    @Setter
    private String content;


}
