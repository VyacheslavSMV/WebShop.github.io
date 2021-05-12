package com.example.servingwebcontent.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShopModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, full_text, Characteristic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public String getCharacteristic() {
        return Characteristic;
    }

    public void setCharacteristic(String characteristic) {
        Characteristic = characteristic;
    }

    public ShopModel() {
    }

    public ShopModel(String title, String full_text, String characteristic) {

        this.title = title;
        this.full_text = full_text;
        Characteristic = characteristic;
    }
}







