package com.teamcubation.animais.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class AnimalRequestDTO {

    private String name;
    private Integer age;
    private String color;
}
