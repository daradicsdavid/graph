package com.thesis.graph.repositories;

import com.thesis.graph.model.entities.Book;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookRepository extends Neo4jRepository<Book, Long> {

    Book findByTitle(@Param("title") String title);

    Collection<Book> findByTitleLike(@Param("title") String title);

    @Query("MATCH (b:Book)<-[a:AUTHOR]-(p:Person) RETURN b,a,p LIMIT {limit}")
    Collection<Book> graph(@Param("limit") int limit);
}
