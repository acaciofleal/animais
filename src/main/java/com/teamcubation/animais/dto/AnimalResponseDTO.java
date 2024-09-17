package com.teamcubation.animais.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AnimalResponseDTO {
    private Integer id;
    private String name;
    private Integer age;
    private String color;
}
