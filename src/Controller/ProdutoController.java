package Controller;

import Model.Produto;
import Model.ProdutoService;

import java.util.List;

public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public void cadastrar (){
        produtoService.cadastrarProduto("CPU", "Unidades centrais de processamento", 500.00);
        produtoService.cadastrarProduto("Memória RAM", "Módulos de memória de alta velocidade", 300.00);
        produtoService.cadastrarProduto("Monitores", "Telas de variadas resoluções", 250.00);
    }

     public List<?> mostrar (){
        return produtoService.listarProduto();
     }

     public void deletar (int idProduto){
        produtoService.deletarProduto(idProduto);
     }

     public void atualizar (int idProduto,String nome, String descricao, double preco){
        produtoService.atualizarProduto(idProduto, nome, descricao, preco);
     }
}
