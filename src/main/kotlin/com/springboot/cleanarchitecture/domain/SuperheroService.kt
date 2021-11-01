package com.springboot.cleanarchitecture.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface SuperheroService {

    fun findAll(pageable: Pageable): Page<Superhero>;

}