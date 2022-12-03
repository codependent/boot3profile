package com.example.boot3profile

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class boot3profileApplication{

	@GetMapping("/hello")
	fun hello() = "hello"

}

fun main(args: Array<String>) {
	runApplication<boot3profileApplication>(*args)
}
