package com.mlh.sprintboot.reuniones.controllers;

import com.mlh.sprintboot.reuniones.models.Persona;
import com.mlh.sprintboot.reuniones.services.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {
    private PersonaService personaService;

    public PersonaRestController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getAllPersona(){
        return personaService.getAllPersonas();
    }
}
