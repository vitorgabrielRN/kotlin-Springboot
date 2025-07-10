package br.com.alura.forum.Controller

import br.com.alura.forum.Model.Curso
import br.com.alura.forum.Model.Topico
import br.com.alura.forum.Model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays

@RestController
@RequestMapping("/topicos")
class TopicoController {


    @GetMapping
    fun listar(): List<Topico>{
        val topico = Topico(
             1,
             "Duidas Kotlin",
              "Variaveis no Kotlin",
            curso = Curso(
                 1,
                 "Kotlin",
                "programaçãoo"),
            autor =  Usuario (
                1,
                "Ana da Silva",
                "ana@email.com"
            )
        )
        return Arrays.asList(topico, topico, topico)


    }

}