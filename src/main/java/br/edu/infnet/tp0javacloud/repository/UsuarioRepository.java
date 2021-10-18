package br.edu.infnet.tp0javacloud.repository;

import br.edu.infnet.tp0javacloud.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioRepository {

    private static List<Usuario> usuarioList = new ArrayList<>();

    public Usuario salvar (String nome){
        Integer id = usuarioList.size();
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNome(nome);
        usuarioList.add(usuario);
        return usuario;
    }

    public Usuario encontrarPorId (Integer id){
        if (id == null){
            return null;
        }
        for (Usuario u : usuarioList){
            if (u.getId().equals(id)){
                return  u;
            }
        }
        return null;
    }

    public List<Usuario> mostrarTodos(){
        return usuarioList;
    }
}
