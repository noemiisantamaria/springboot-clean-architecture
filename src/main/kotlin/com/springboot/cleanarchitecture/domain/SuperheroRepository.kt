package com.springboot.cleanarchitecture.domain

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface SuperheroRepository<T, U> {

    fun add(superhero: T): T

    fun delete(idSuperhero: U)

    fun findAll(pageable: Pageable): Page<T>

    fun findById(idSuperhero: U): T

}