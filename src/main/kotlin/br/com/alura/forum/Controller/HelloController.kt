package br.com.alura.forum.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {


    @GetMapping
    fun hello():String {
        return  "hello world"
    }
}