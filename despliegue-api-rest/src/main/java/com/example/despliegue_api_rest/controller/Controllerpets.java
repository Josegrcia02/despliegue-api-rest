package com.example.despliegue_api_rest.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.despliegue_api_rest.entity.Pet;
import com.example.despliegue_api_rest.repository.PetRepository;

@RestController
public class Controllerpets {
    private PetRepository petRepository;
    public Controllerpets(PetRepository petRepository){
        this.petRepository = petRepository;
    }
    @GetMapping ("/Pets")
    public List<Pet> ListadoPets(){
        return petRepository.findAll();
    }
}
