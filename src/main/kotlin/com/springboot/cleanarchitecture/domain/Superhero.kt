package com.springboot.cleanarchitecture.domain

import com.springboot.cleanarchitecture.infrastructure.SuperheroEntity

class Superhero(
    var id: Long = 1L,
    var name: String = "",
    var description: String? = null,
    var thumbnail: String? = null
) {

}

fun toModel(domain: Superhero): SuperheroEntity {
    return SuperheroEntity(domain.id, domain.name, domain.description, domain.thumbnail);
}

fun fromModel(entity: SuperheroEntity): Superhero {
    return Superhero(entity.id, entity.name, entity.description, entity.thumbnail);
}
