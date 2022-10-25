package unicapfood.pedidos;

import java.util.ArrayList;

import unicapfood.Exceptions.PedidoInexistenteExeption;

public class GerenciarPedidos {
  private ArrayList<Pedido> listaDePedidos;

  public GerenciarPedidos() {
    this.listaDePedidos = new ArrayList();
  }
    
  public boolean pedidoExistente(int numero){
    for(Pedido checarPedido: listaDePedidos  ){
      if (checarPedido.getNumero() == numero ){
        return true;
      }
    }
    return false;
  }

  public void adicionarPedido(Pedido pedidoNovo){
    if (!pedidoExistente(pedidoNovo.getNumero())){
      listaDePedidos.add(new Pedido(pedidoNovo.getItem(),pedidoNovo.getNumero(), pedidoNovo.getPreco()));
    }
  }

  public void excluirPedido (Pedido pedidoAExcluir){

    listaDePedidos.remove(pedidoAExcluir);

  }

  public Pedido buscarPedido(int numeroPedido) throws Exception {
    if (!pedidoExistente(numeroPedido)){
      throw new PedidoInexistenteExeption();
    }
    for(Pedido checarPedido:listaDePedidos ){
      if (checarPedido.getNumero() == numeroPedido){

        return checarPedido;
      }

  }
    return null;
}

public void fecharMesa(){

  listaDePedidos.clear();
}

  public void exibirPedidos() {
    System.out.println(listaDePedidos);
  }
}