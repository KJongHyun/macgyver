package com.wisdom.macgyver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MacgyverApplication

fun main(args: Array<String>) {
    runApplication<MacgyverApplication>(*args)
}
