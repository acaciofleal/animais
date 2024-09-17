package com.teamcubation.animais.repository;

import com.teamcubation.animais.domain.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    Optional<Animal> findByName(String name);
}
