package com.example.demo.repository

import com.example.demo.entity.Customer
import org.springframework.data.repository.CrudRepository

/**
 * Created by Michael on 2017/6/20.
 */

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findById(id: Long):Customer
    fun findByName(name: String):List<Customer>
}
