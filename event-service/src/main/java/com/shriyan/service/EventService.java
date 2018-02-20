package com.shriyan.service;

import com.shriyan.domain.Event;

public interface EventService {
    Iterable<Event> findAll();
    Event findEventByEventId(Integer id);
    Event save(Event event);
}

