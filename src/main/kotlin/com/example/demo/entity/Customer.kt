package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


/**
 * Created by Michael on 2017/6/20.
 */
@Entity
data class Customer(

        var name: String = "",
        var phone: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var addr: String = ""
)
