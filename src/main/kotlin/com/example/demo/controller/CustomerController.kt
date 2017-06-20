package com.example.demo.controller

import com.example.demo.entity.Customer
import com.example.demo.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Michael on 2017/6/20.
 */
@RestController
class CustomerController {
    @Autowired
    lateinit var repository: CustomerRepository

    @RequestMapping("/findAll")
    fun findByAll() = repository.findAll()

    @RequestMapping("/id/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)

    @RequestMapping("/name/{name}")
    fun findByName(@PathVariable name: String) = repository.findByName(name)


}