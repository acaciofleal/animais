package com.teamcubation.animais.service;

import com.teamcubation.animais.domain.entities.Animal;
import com.teamcubation.animais.dto.AnimalRequestDTO;
import com.teamcubation.animais.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.teamcubation.animais.mapper.AnimalMapper.mapToDomain;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal create(AnimalRequestDTO animalDTO) {
        Animal animal = mapToDomain(animalDTO);

        Animal animalCreated = animalRepository.save(animal);

        return animalCreated;
    }
}
