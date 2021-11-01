package com.springboot.cleanarchitecture.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

class SuperheroServiceImpl(private var superheroRepository: SuperheroRepository<Superhero, Long>) : SuperheroService {

    override fun findAll(pageable: Pageable): Page<Superhero> {
        return superheroRepository.findAll(pageable);
    }

}