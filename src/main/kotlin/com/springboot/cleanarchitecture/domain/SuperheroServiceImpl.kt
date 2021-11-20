package com.springboot.cleanarchitecture.domain

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class SuperheroServiceImpl : SuperheroService {

    @Autowired
    lateinit var superheroRepository: SuperheroRepository<Superhero, Long>

    override fun add(superhero: Superhero): Superhero {
        return superheroRepository.add(superhero)
    }

    override fun delete(idSuperhero: Long) {
        superheroRepository.delete(idSuperhero)
    }

    override fun findAll(pageable: Pageable): Page<Superhero> {
        return superheroRepository.findAll(pageable)
    }

    override fun findById(idSuperhero: Long): Superhero {
        return superheroRepository.findById(idSuperhero)
    }

}