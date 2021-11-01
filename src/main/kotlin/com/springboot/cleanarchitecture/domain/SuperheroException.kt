package com.springboot.cleanarchitecture.domain

class SuperheroException(msg: String) : RuntimeException(msg) {

    class SuperheroNotFoundException(message: String) : Exception(message) {
        
    };

}