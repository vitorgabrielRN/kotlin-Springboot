package br.com.alura.forum.Controller

import br.com.alura.forum.Model.Topico
import br.com.alura.forum.Service.TopicoService
import br.com.alura.forum.dto.novoTopicoDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {


    @GetMapping
    fun listar(): List<Topico>{
        return  service.listar()
    }

    @GetMapping("{id}")
    fun buscarPorId(@PathVariable id:Long ): Topico {
        return  service.buscarPorId(id)
    }
    @PostMapping
    fun cadastrar(@RequestBody  dto: novoTopicoDto){
        service.cadastrar(dto)
    }
}