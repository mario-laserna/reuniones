package com.mlh.sprintboot.reuniones.services;

import com.mlh.sprintboot.reuniones.models.Persona;
import com.mlh.sprintboot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {
    private static final List<Reunion> reuniones = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++){
            Reunion reunion = new Reunion(i, "Reunion " + i, ZonedDateTime.now().plusDays(i));
            for (int j = 0; j < i; j++){
                Persona persona = new Persona(i+j, "Nombre " + i+j, "Apellido " + i+j);
                reunion.addAsistentes(persona);
            }
            reuniones.add(reunion);
        }
    }

    public List<Reunion> getAllReuniones(){
        return reuniones;
    }
}
