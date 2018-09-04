package com.thesis.graph.repositories;

import com.thesis.graph.model.entities.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {

}
