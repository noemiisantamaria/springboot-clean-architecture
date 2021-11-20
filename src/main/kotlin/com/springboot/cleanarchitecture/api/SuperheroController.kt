package com.springboot.cleanarchitecture.api

import com.springboot.cleanarchitecture.application.SuperheroHandler
import com.springboot.cleanarchitecture.domain.Superhero
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SuperheroController {

    @Autowired
    lateinit var superheroHandler: SuperheroHandler

    @GetMapping("/superheroes")
    fun findAllSuperheroes(pageable: Pageable): Page<Superhero> {
        return superheroHandler.findAll(pageable);
    }

    @GetMapping("/superhero/{idSuperhero}")
    fun findSuperheroById(@PathVariable idSuperhero: Long): Superhero {
        return superheroHandler.findById(idSuperhero);
    }

}