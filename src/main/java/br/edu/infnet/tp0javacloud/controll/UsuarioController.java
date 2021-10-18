package br.edu.infnet.tp0javacloud.controll;

import br.edu.infnet.tp0javacloud.model.Usuario;
import br.edu.infnet.tp0javacloud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/usuario/todos")
    public List<Usuario> mostrarTodos(){
        return usuarioRepository.mostrarTodos();
    }
    @GetMapping(value = "/usuario/salvar")
    public Usuario salvar (@RequestParam("nome") String nome){
        return usuarioRepository.salvar(nome);
    }
}
