package br.com.alura.forum.dto

data class novoTopicoDto(
    val titulo:String,
    val mensagem:String,
    val idCurso: Long,
    val IdAutor: Long
) {
}