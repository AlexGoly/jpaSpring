package org.sviteco.alarm.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Alarm {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public Alarm( String text,String email) {
        this.id = id;
        this.text = text;
    }

    public Alarm() {
    }

    private String text;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
