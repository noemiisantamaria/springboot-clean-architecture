package com.springboot.cleanarchitecture.infrastructure

import org.springframework.data.repository.PagingAndSortingRepository

interface SuperheroJpaRepository: PagingAndSortingRepository<SuperheroEntity, Long> {

}