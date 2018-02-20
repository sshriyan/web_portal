package com.shriyan.controller;

import com.shriyan.domain.Agenda;
import com.shriyan.domain.Event;
import com.shriyan.service.AgendaService;
import com.shriyan.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@RefreshScope
@RestController
public class EventController {
    private static final Logger LOG = Logger.getLogger(EventController.class.getName());

    @Autowired
    private EventService eventService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    Iterable<Event> getEvents() {
        return eventService.findAll();
    }

    @RequestMapping(path ="/",  method = RequestMethod.POST)
    Event addItem(@RequestBody Event event) {
        return eventService.save(event);
    }

    @RequestMapping(path ="/",  method = RequestMethod.PUT)
    Event updateItem(@RequestBody Event event) {
        return eventService.save(event);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    Event getEventById(@PathVariable Integer id) {
        return eventService.findEventByEventId(id);
    }

}