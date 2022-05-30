package com.agrow.api.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 220, nullable = false)
    private String client;

    @Column(length = 220, nullable = false)
    private String request;

    @Column(length = 220, nullable = false)
    private String responsible;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date deadline;

    @Column(length = 30, nullable = false)
    private String priority;

    public Tasks() {
        super();
    }

    public Tasks(Integer id, String client, String request, String responsible, String description, Date deadline, String priority) {
        super();
        this.id = id;
        this.client = client;
        this.request = request;
        this.responsible = responsible;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return Objects.equals(id, tasks.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
