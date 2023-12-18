package com.learn.kotAPI

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotApiApplication

fun main(args: Array<String>) {
	runApplication<KotApiApplication>(*args)
}
