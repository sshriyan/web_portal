package com.shriyan.domain;

import javax.persistence.*;

@Entity
@Table(name = "event_agendas")
public class Agenda {

  @Id
  @GeneratedValue
  @Column(columnDefinition = "NUMERIC(11,0)")
  private Integer eventAgendaId;
  private Integer eventId;
  private String detail;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;
  private String status;


  public long getEventAgendaId() {
    return eventAgendaId;
  }

  public void setEventAgendaId(Integer eventAgendaId) {
    this.eventAgendaId = eventAgendaId;
  }


  public long getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
