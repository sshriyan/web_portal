package com.shriyan.repository;

import com.shriyan.domain.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    Iterable<Event> findAll();
    Event findEventByEventId(Integer id);
    Event save(Event event);
}
