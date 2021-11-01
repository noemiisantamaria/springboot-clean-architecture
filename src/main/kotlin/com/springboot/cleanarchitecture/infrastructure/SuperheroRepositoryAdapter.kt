package com.springboot.cleanarchitecture.infrastructure

import com.springboot.cleanarchitecture.domain.Superhero
import com.springboot.cleanarchitecture.domain.SuperheroException
import com.springboot.cleanarchitecture.domain.SuperheroRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
class SuperheroRepositoryAdapter(private var superheroJpaRepository: SuperheroJpaRepository) : SuperheroRepository<Superhero, Long> {

    override fun findAll(pageable: Pageable): Page<Superhero> {
        return superheroJpaRepository.findAll(pageable).map { it.fromEntity(it) }
    }

    override fun findById(idSuperhero: Long): Superhero {
        return superheroJpaRepository.findById(idSuperhero).map { it.fromEntity(it) }
            .orElseThrow { SuperheroException.SuperheroNotFoundException("Not found: $idSuperhero") };
    }

}