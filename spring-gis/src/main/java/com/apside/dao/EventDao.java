package com.apside.dao;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apside.model.Event;

/**
 * Person dao interface
 *
 * @author bbonheur
 */
@Repository
public interface EventDao extends JpaRepository<Event, Long> {
    @EntityGraph(value = "Event.detail", type = EntityGraphType.LOAD)
    Event getById(Long id);
}
