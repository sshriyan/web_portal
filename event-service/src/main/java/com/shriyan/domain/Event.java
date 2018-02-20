package com.shriyan.domain;


import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event {
  @Id
  @GeneratedValue
  @Column(
          columnDefinition = "NUMERIC(11,0)"
  )
  private Integer eventId;
  private String name;
  private String detail;
  private java.sql.Timestamp startDate;
  private java.sql.Timestamp endDate;
  private String status;

  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
