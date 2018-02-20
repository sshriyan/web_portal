package com.shriyan.controller;

import com.shriyan.domain.Agenda;
import com.shriyan.domain.Event;
import com.shriyan.service.AgendaService;
import com.shriyan.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;


@RefreshScope
@RestController
public class AgendaController {
    private static final Logger LOG = Logger.getLogger(AgendaController.class.getName());

    @Autowired
    private AgendaService agendaService;

    @RequestMapping(path = "/{id}/agendas", method = RequestMethod.GET)
    Iterable<Agenda> getAgendaByEventId(@PathVariable Integer id) {
        return agendaService.findEventAgendaByEventId(id);
    }

    @RequestMapping(path = "/agenda/{id}", method = RequestMethod.GET)
    Agenda getAgendaById(@PathVariable Integer id) {
        return agendaService.findByEventAgendaId(id);
    }


    @RequestMapping(path = "/{id}/agendas", method = RequestMethod.POST)
    Agenda addAgenda(@RequestBody Agenda agenda) {
        return agendaService.save(agenda);
    }

    @RequestMapping(path ="/",  method = RequestMethod.PUT)
    Agenda updateAgenda(@RequestBody Agenda agenda) {
        return agendaService.save(agenda);
    }
}