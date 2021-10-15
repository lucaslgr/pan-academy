package com.datas.aula5appspringdatas.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;

@Entity
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tarefa;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataNascimentoCalendar;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    //getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public Calendar getDataNascimentoCalendar() {
        return dataNascimentoCalendar;
    }

    public void setDataNascimentoCalendar(Calendar dataNascimentoCalendar) {
        this.dataNascimentoCalendar = dataNascimentoCalendar;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
