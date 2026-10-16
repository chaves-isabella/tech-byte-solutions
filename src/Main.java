import Controller.ProdutoController;
import Model.ProdutoService;
import Model.UsuarioController;
import Model.UsuarioService;

void main() {

    ProdutoService serviceProduto = new ProdutoService();
    ProdutoController controllerProduto = new ProdutoController(serviceProduto);

    controllerProduto.cadastrar();
    IO.println(controllerProduto.mostrar());
}
