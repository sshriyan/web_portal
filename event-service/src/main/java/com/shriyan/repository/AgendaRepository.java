package com.shriyan.repository;

import com.shriyan.domain.Agenda;
import com.shriyan.domain.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends CrudRepository<Agenda, Integer> {
    Iterable<Agenda> findAll();
    Iterable<Agenda> findEventAgendaByEventId(Integer id);
    Agenda findByEventAgendaId(Integer id);
    Agenda save(Agenda agenda);
}
