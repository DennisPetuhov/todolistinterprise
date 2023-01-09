package com.example.todolistinterprise

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Cat(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Long=0,
        var name:String,
        var age:Int
)