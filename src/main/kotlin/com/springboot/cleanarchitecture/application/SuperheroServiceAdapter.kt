package com.springboot.cleanarchitecture.application

import com.springboot.cleanarchitecture.domain.Superhero
import com.springboot.cleanarchitecture.domain.SuperheroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class SuperheroServiceAdapter {

    @Autowired
    lateinit var superheroService: SuperheroService

    fun findAll(pageable: Pageable) : Page<Superhero> {
        return superheroService.findAll(pageable);
    }

    fun findById(idSuperhero: Long): Superhero {
        return superheroService.findById(idSuperhero);
    }
}