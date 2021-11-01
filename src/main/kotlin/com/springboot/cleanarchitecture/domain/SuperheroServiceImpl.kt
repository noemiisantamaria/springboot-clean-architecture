package com.springboot.cleanarchitecture.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class SuperheroServiceImpl(private var superheroRepository: SuperheroRepository<Superhero, Long>) : SuperheroService {

    override fun findAll(pageable: Pageable): Page<Superhero> {
        return superheroRepository.findAll(pageable);
    }

    override fun findById(idSuperhero: Long): Superhero {
        return superheroRepository.findById(idSuperhero);
    }

}