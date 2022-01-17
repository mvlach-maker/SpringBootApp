package com.example.springbootapp.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table

public class Jukebox {
    @Id
    private String id;
    private String model;
    
    private Component[] components;

    public Jukebox() {
        this.id = "";
        this.model = "";
        this.components = null;
    }

    public Jukebox(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String name) {
        this.model = name;
    }

    public Component[] getComponents() {
        return components;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }
}
