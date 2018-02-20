package com.shriyan.service;

import com.shriyan.domain.Agenda;
import com.shriyan.domain.Event;

public interface AgendaService {
    Iterable<Agenda> findAll();
    Iterable<Agenda> findEventAgendaByEventId(Integer id);
    Agenda findByEventAgendaId(Integer id);
    Agenda save(Agenda agenda);
}

