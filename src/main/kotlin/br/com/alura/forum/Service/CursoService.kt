package br.com.alura.forum.Service

import br.com.alura.forum.Model.Curso
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class CursoService(var cursos: List<Curso> = ArrayList()) {
    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "programação"
        )
        cursos = Arrays.asList(curso)
    }

    fun buscarPorId(id: Long): Curso{
        return cursos.stream().filter ({ c ->  c.id == id}).findFirst().get()
    }

}
