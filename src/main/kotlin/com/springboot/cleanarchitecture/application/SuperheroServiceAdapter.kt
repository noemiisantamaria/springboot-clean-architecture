package com.springboot.cleanarchitecture.application

import com.springboot.cleanarchitecture.domain.Superhero
import com.springboot.cleanarchitecture.domain.SuperheroService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class SuperheroServiceAdapter(private var superheroService: SuperheroService) {

    fun findAll(pageable: Pageable) : Page<Superhero> {
        return superheroService.findAll(pageable);
    }
}