package br.com.alura.forum.Service

import br.com.alura.forum.Model.Usuario
import java.util.Arrays


class UsuarioService( var  usuarios : List<Usuario> = ArrayList()) {


    init {
        var usuario = Usuario(
            id = 1,
            nome = "vitor gabriel",
            email = "malaquitoG@gmail.com"
        )
        usuarios = Arrays.asList(usuario)
    }



    fun buscarPorId(id:Long ): Usuario{
        return usuarios.stream().filter( { a -> a.id == id}).findFirst().get()
    }
}


