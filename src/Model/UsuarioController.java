package Model;

import java.lang.classfile.attribute.LineNumberTableAttribute;
import java.util.List;

public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void cadastrar () {
        usuarioService.cadastrarUsuario("Isabella", "isa@gmail.com");
        usuarioService.cadastrarUsuario("Elizabete", "beth@gmail.com");
        usuarioService.cadastrarUsuario("Gabriel", "gabriel@gmail.com");
    }

    public List<?> mostrar () {
        return usuarioService.listarUsuario();
    }

    public void deletar (int id){
        usuarioService.deletarUsuario(id);
    }

    public void atualizar (int id, String nome, String email){
        usuarioService.atualizarUsuario(id, nome, email);
    }
}
