package br.com.alura.forum.Service

import br.com.alura.forum.Model.Curso
import br.com.alura.forum.Model.Topico
import br.com.alura.forum.Model.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class TopicoService(private var topicos: List<Topico>) {

    init{
        val topico = Topico(
            1,
            "Duidas Kotlin",
            "Variaveis no Kotlin",
            curso = Curso(
                1,
                "Kotlin",
                "programaçãoo"
            ),
            autor = Usuario(
                1,
                "Ana da Silva",
                "ana@email.com"
            )
        )
       topicos =  Arrays.asList(topico)
    }
    fun listar():List<Topico> {
        return  topicos

    }

    fun buscarPorId(){


    }

}