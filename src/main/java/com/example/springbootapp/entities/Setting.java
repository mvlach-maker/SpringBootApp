package com.example.springbootapp.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table
public class Setting {
    @Id
    String settingId;
}
