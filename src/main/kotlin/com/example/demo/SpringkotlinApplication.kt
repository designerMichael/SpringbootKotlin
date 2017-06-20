package com.example.demo

import com.example.demo.entity.Customer
import com.example.demo.repository.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringkotlinApplication {

    @Bean
    open fun init(repository: CustomerRepository): CommandLineRunner {
        return CommandLineRunner {
            repository.save(Customer("Jack", "Bauer"))
            repository.save(Customer("Chloe", "O'Brian"))
            repository.save(Customer("Kim", "Bauer"))
            repository.save(Customer("David", "Palmer"))
            repository.save(Customer("Michelle", "Dessler"))
        }
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringkotlinApplication::class.java, *args)
        }
    }


}

