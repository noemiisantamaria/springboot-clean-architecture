package com.springboot.cleanarchitecture.application

import com.springboot.cleanarchitecture.domain.Superhero
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component

@Component
class SuperheroHandler {

    @Autowired
    lateinit var superheroServiceAdapter: SuperheroServiceAdapter

    fun add(superhero: Superhero): Superhero {
        return superheroServiceAdapter.add(superhero)
    }

    fun delete(idSuperhero: Long) {
        superheroServiceAdapter.delete(idSuperhero)
    }

    fun findAll(pageable: Pageable): Page<Superhero> {
        return superheroServiceAdapter.findAll(pageable)
    }

    fun findById(idSuperhero: Long): Superhero {
        return superheroServiceAdapter.findById(idSuperhero)
    }

}