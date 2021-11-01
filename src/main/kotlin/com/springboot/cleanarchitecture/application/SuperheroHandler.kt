package com.springboot.cleanarchitecture.application

import com.springboot.cleanarchitecture.domain.Superhero
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component

@Component
class SuperheroHandler(private var superheroServiceAdapter: SuperheroServiceAdapter) {

    fun findAll(pageable: Pageable) : Page<Superhero> {
        return superheroServiceAdapter.findAll(pageable);
    }

}