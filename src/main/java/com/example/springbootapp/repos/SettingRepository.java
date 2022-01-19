package com.example.springbootapp.repos;

import com.example.springbootapp.entities.Jukebox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingRepository extends JpaRepository<Jukebox, String> {
}
