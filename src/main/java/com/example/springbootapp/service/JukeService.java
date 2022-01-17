package com.example.springbootapp.service;

import com.example.springbootapp.entities.Jukebox;
import com.example.springbootapp.repos.JukeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class JukeService {

    private final JukeRepository jukeRepository;

    @Autowired
    public JukeService(JukeRepository jukeRepository) {
        this.jukeRepository = jukeRepository;
    }

    @GetMapping
    public List<Jukebox> getJukeboxes() {
        return jukeRepository.findAll();
    }
}
