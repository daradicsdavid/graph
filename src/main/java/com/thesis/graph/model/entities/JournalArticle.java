package com.thesis.graph.model.entities;

import com.thesis.graph.model.entities.base.Authored;
import lombok.Getter;
import lombok.Setter;

public class JournalArticle extends Authored {

    //TODO Talán a Journalokat is érdemes lenne külön entitásként kezelni ha olyan kérdéseink vannak mint: Melyik article-eket adta ki egy adott journal.
    @Getter
    @Setter
    private String journalName;

    //TODO ez tényleg "szám"?
    @Getter
    @Setter
    private String volumeNumber;

    //TODO ez tényleg "szám"?
    @Getter
    @Setter
    private String issueNumber;

    @Getter
    @Setter
    private Integer pageNumber;

    //TODO Abstract/Összefoglalás ez volt odaírva, (?)
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
