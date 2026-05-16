package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {
    Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping("/workintech/animal")
    public List<Animal> getAnimals() {
        return animals.values().stream().toList();
    }

    @GetMapping("/workintech/animal/{id}")
    public Animal getAnimalById(@PathVariable Integer id) {
        return animals.get(id);
    }

    @PostMapping("/workintech/animal")
    public Animal addAnimal(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
        return animal;
    }

    @PutMapping("/workintech/animal/{id}")
    public Animal updateAnimal(@PathVariable Integer id, @RequestBody Animal updatedAnimal) {
        animals.put(id, updatedAnimal);
        return updatedAnimal;
    }

    @DeleteMapping("/workintech/animal/{id}")
    public Animal deleteAnimal(@PathVariable Integer id) {
        return animals.remove(id);
    }
}
