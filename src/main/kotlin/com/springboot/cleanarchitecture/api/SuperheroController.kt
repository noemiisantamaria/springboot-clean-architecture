package com.springboot.cleanarchitecture.api

import com.springboot.cleanarchitecture.application.SuperheroHandler
import com.springboot.cleanarchitecture.domain.Superhero
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@RestController
class SuperheroController {

    @Autowired
    lateinit var superheroHandler: SuperheroHandler

    @PostMapping("/superhero")
    fun addSuperhero(@RequestBody superhero: Superhero): Superhero {
        return superheroHandler.add(superhero)
    }

    @DeleteMapping("/superhero/{idSuperhero}")
    fun deleteSuperhero(@PathVariable idSuperhero: Long) {
        superheroHandler.delete(idSuperhero)
    }

    @GetMapping("/superheroes")
    fun findAllSuperheroes(pageable: Pageable): Page<Superhero> {
        return superheroHandler.findAll(pageable)
    }

    @GetMapping("/superhero/{idSuperhero}")
    fun findSuperheroById(@PathVariable idSuperhero: Long): Superhero {
        return superheroHandler.findById(idSuperhero)
    }

}