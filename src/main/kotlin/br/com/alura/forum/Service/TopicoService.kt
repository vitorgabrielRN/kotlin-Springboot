package br.com.alura.forum.Service

import br.com.alura.forum.Model.Curso
import br.com.alura.forum.Model.Topico
import br.com.alura.forum.Model.Usuario
import br.com.alura.forum.dto.novoTopicoDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico> = ArrayList(),
                          private val cursoService: CursoService,
                          private val UsuarioService: UsuarioService) {

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
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin 2",
            mensagem = "Variaveis no Kotlin 2",
            curso = Curso (
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Kotlin 3",
            mensagem = "Variaveis no Kotlin 3",
            curso = Curso (
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            )
        )
        topicos =  Arrays.asList(topico, topico2, topico3)
    }
    fun listar():List<Topico> {
        return  topicos

    }

    fun buscarPorId(id:Long): Topico{
    return topicos.stream().filter({
                   t -> t.id == id })
                   .findFirst().get()

    }

    fun cadastrar(dto: novoTopicoDto){
        topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = UsuarioService.buscarPorId(dto.IdAutor)
        )
        )
    }


}