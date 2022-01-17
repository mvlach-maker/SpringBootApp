package com.example.springbootapp.repos;

import com.example.springbootapp.entities.Jukebox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Data Access Layer
@Repository
public interface JukeRepository extends JpaRepository<Jukebox, String> {

    public List<Jukebox> findBySetting(String settingId);

}
