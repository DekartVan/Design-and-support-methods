package com.company.bpmdemo.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "BPMDEMO_CONTRACT")
@Entity(name = "bpmdemo_Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 8696823820724777787L;

    @NotNull
    @Column(name = "NUMBER", nullable = false)
    protected String number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE", nullable = false)
    protected Date date;

    @NotNull
    @Column(name = "STATE", nullable = false)
    protected String state;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}