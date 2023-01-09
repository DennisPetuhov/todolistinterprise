package com.example.todolistinterprise

import org.springframework.data.jpa.repository.JpaRepository

interface CatRepository:JpaRepository<Cat,Long> {

}