package br.com.alura.forum.Controller

import br.com.alura.forum.Model.Topico
import br.com.alura.forum.Service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {


    @GetMapping
    fun listar(): List<Topico>{
        return  service.listar()
    }

}