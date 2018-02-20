package com.shriyan.service;

import com.shriyan.domain.Event;
import com.shriyan.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class EventServiceImpl implements EventService {
    private static final Logger LOG = Logger.getLogger(EventServiceImpl.class.getName());

    @Autowired
    private EventRepository eventRepository;


    @Override
    public Iterable<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event findEventByEventId(Integer id) {
        LOG.info("findEventByEventId" + id);
        return eventRepository.findEventByEventId(id);
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

}
