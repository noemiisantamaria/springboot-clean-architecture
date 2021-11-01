package com.springboot.cleanarchitecture.infrastructure

import com.springboot.cleanarchitecture.domain.Superhero
import javax.persistence.*

@Entity
@Table(name = "SUPERHERO")
class SuperheroEntity(
    @Id
    @GeneratedValue
    @Column(name = "ID")
    var id: Long = 1L,

    @Column(name = "NAME")
    var name: String = "",

    @Column(name = "DESCRIPTION")
    var description: String? = null,

    @Column(name = "THUMBNAIL")
    var thumbnail: String? = null) {

    fun toEntity(domain: Superhero): SuperheroEntity {
        return SuperheroEntity(domain.id, domain.name, domain.description, domain.thumbnail);
    }

    fun fromEntity(entity: SuperheroEntity): Superhero {
        return Superhero(entity.id, entity.name, entity.description, entity.thumbnail);
    }

}