import Controller.ProdutoController;
import Model.ProdutoService;
import Model.UsuarioController;
import Model.UsuarioService;

void main() {

    ProdutoService serviceProduto = new ProdutoService();
    ProdutoController controllerProduto = new ProdutoController(serviceProduto);

    controllerProduto.cadastrar();
    IO.println(controllerProduto.mostrar());

    controllerProduto.atualizar(1, "Teclado ajazz ak820", "Teclado mecânico com swtich red", 200.00);
    IO.println(controllerProduto.mostrar());

    controllerProduto.deletar(1);
    IO.println(controllerProduto.mostrar());

    UsuarioService serviceUsuario = new UsuarioService();
    UsuarioController controllerUsuario = new UsuarioController(serviceUsuario);

    controllerUsuario.cadastrar();
    IO.println(controllerUsuario.mostrar());

    controllerUsuario.atualizar(1, "Rozelio", "rozelio@gmail.com");
    IO.println(controllerUsuario.mostrar());

    controllerUsuario.deletar(1);
    IO.println(controllerUsuario.mostrar());

}
