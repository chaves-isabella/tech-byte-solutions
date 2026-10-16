package Model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private int idProduto = 1;
    private List<Produto> banco = new ArrayList<>();

    //cadastrar
    public void cadastrarProduto (String nome, String descricao, double preco){
        Produto produto = new Produto(idProduto++, nome, descricao, preco);
        banco.add(produto);
    }

    //ler
    public List<Produto> listarProduto (){
        return banco;
    }

    //deletar
    public void deletarProduto (int idProduto){
        for (Produto p : banco){
            if (p.getIdProduto() == idProduto){
                banco.remove(p);
                IO.println("Produto removido com sucesso");
                break;
            }
        }
    }

    public Produto buscarProdutoId (int idProduto){
        for (Produto p : banco){
            if (p.getIdProduto() == idProduto){
                return p;
            }
        } return null;
    }

    //atualizar
    public void atualizarProduto (int idProduto, String nome, String descricao, double preco){
        for (Produto p : banco){
            if (p.getIdProduto() == idProduto){
                p.setNome(nome);
                p.setDescricao(descricao);
                p.setPreco(preco);
                IO.println("Produto atualizado com sucesso" + p);
                break;
            }
        }
    }
}
