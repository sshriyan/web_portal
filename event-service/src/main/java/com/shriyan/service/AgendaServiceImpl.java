package com.shriyan.service;

import com.shriyan.domain.Agenda;
import com.shriyan.domain.Event;
import com.shriyan.repository.AgendaRepository;
import com.shriyan.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AgendaServiceImpl implements AgendaService {
    private static final Logger LOG = Logger.getLogger(AgendaServiceImpl.class.getName());

    @Autowired
    private AgendaRepository agendaRepository;

    @Override
    public Agenda save(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @Override
    public Iterable<Agenda> findEventAgendaByEventId(Integer id) {
        return agendaRepository.findEventAgendaByEventId(id);
    }

    @Override
    public Iterable<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    @Override
    public Agenda findByEventAgendaId(Integer id) {
        return agendaRepository.findByEventAgendaId(id);
    }


}
