package com.springboot.cleanarchitecture.application

import com.springboot.cleanarchitecture.domain.Superhero
import com.springboot.cleanarchitecture.domain.SuperheroRepository
import com.springboot.cleanarchitecture.domain.SuperheroService
import com.springboot.cleanarchitecture.domain.SuperheroServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SuperheroConfiguration {

    @Bean
    fun superheroService(superheroRepository: SuperheroRepository<Superhero, Long>) : SuperheroService {
        return SuperheroServiceImpl(superheroRepository);
    }
}