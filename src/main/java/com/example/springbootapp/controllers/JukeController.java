package com.example.springbootapp.controllers;

import com.example.springbootapp.entities.Jukebox;
import com.example.springbootapp.service.JukeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/jukebox")

public class JukeController {

    private final JukeService jukeService;

    @Autowired
    public JukeController(JukeService jukeService) {
        this.jukeService = jukeService;
    }

    @GetMapping
    public List<Jukebox> getJukeboxes() {
        return jukeService.getJukeboxes();
    }
}
