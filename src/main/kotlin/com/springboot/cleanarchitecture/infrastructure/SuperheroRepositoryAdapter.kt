package com.springboot.cleanarchitecture.infrastructure

import com.springboot.cleanarchitecture.domain.Superhero
import com.springboot.cleanarchitecture.domain.SuperheroException
import com.springboot.cleanarchitecture.domain.SuperheroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
class SuperheroRepositoryAdapter : SuperheroRepository<Superhero, Long> {

    @Autowired
    private lateinit var superheroJpaRepository: SuperheroJpaRepository

    override fun add(superhero: Superhero): Superhero {
        return fromEntity(superheroJpaRepository.save(toEntity(superhero)))
    }

    override fun delete(idSuperhero: Long) {
        superheroJpaRepository.deleteById(idSuperhero)
    }

    override fun findAll(pageable: Pageable): Page<Superhero> {
        return superheroJpaRepository.findAll(pageable).map { fromEntity(it) }
    }

    override fun findById(idSuperhero: Long): Superhero {
        return superheroJpaRepository.findById(idSuperhero).map { fromEntity(it) }
            .orElseThrow { SuperheroException.SuperheroNotFoundException("Not found: $idSuperhero") };
    }

}