package Model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private int id = 1;
    private List<Usuario> bancoUsuario = new ArrayList<>();

    public void cadastrarUsuario(String nome, String email) {
        Usuario usuario = new Usuario(id++, nome, email);
        bancoUsuario.add(usuario);
    }

    public List<Usuario> listarUsuario (){
        return bancoUsuario;
    }

    public void deletarUsuario (int id){
        for (Usuario u :bancoUsuario){
            if (u.getId() == id){
                bancoUsuario.remove(u);
                IO.println("Usuario removido com sucesso");
                break;
            }
        }
    }

    public void atualizarUsuario (int id, String nome, String email){
        for (Usuario u : bancoUsuario){
            if (u.getId() == id){
                u.setNome(nome);
                u.setEmail(email);
            }
        }
    }

    public Usuario buscarUsuarioId (int id){
        for (Usuario u : bancoUsuario){
            if (u.getId() == id){
                return u;
            }
        }return null;
    }


}