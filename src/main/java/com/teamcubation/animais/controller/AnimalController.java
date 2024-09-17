package com.teamcubation.animais.controller;

import com.teamcubation.animais.dto.AnimalRequestDTO;
import com.teamcubation.animais.dto.AnimalResponseDTO;
import com.teamcubation.animais.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

import static com.teamcubation.animais.mapper.AnimalMapper.mapToResponse;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @PostMapping
    public ResponseEntity<AnimalResponseDTO> create(@RequestBody AnimalRequestDTO request) {
        final AnimalResponseDTO response = mapToResponse(animalService.create(request));

        return ResponseEntity.created(URI.create("/animal/" + response.getId())).body(response);
    }
}
