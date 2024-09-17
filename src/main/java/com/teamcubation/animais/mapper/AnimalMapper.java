package com.teamcubation.animais.mapper;

import com.teamcubation.animais.domain.entities.Animal;
import com.teamcubation.animais.domain.enums.ColorEnum;
import com.teamcubation.animais.dto.AnimalRequestDTO;
import com.teamcubation.animais.dto.AnimalResponseDTO;

public class AnimalMapper {

    public static Animal mapToDomain(AnimalRequestDTO requestDTO) {
        return Animal.builder()
                .name(requestDTO.getName())
                .age(requestDTO.getAge())
                .color(ColorEnum.valueOf(requestDTO.getColor()))
                .build();
    }

    public static AnimalResponseDTO mapToResponse(Animal animal) {
        return AnimalResponseDTO.builder()
                .id(animal.getAnimalId())
                .name(animal.getName())
                .age(animal.getAge())
                .color(animal.getColor().toString())
                .build();
    }
}
