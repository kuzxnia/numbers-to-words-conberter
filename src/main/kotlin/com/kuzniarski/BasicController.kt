package com.kuzniarski

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/number")
class BasicController {

    @GetMapping("/{number}")
    fun hello(@PathVariable number:Long) :ResponseEntity<String> = ResponseEntity(convertToWord(number), HttpStatus.OK)
}