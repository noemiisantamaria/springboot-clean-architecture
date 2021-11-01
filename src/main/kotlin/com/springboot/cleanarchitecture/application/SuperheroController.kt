package com.springboot.cleanarchitecture.application

import com.springboot.cleanarchitecture.domain.Superhero
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SuperheroController(val superheroHandler: SuperheroHandler) {

    @GetMapping("/superheroes")
    fun findAllSuperheroes(pageable: Pageable): Page<Superhero> {
        return superheroHandler.findAll(pageable);
    }

    @GetMapping("/superhero/{idSuperhero}")
    fun findSuperheroById(@PathVariable idSuperhero: Long): Superhero {
        return superheroHandler.findById(idSuperhero);
    }

}