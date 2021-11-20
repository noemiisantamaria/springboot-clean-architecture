package com.springboot.cleanarchitecture.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface SuperheroService {

    fun add(superhero: Superhero): Superhero;

    fun findAll(pageable: Pageable): Page<Superhero>;

    fun findById(idSuperhero: Long): Superhero

}