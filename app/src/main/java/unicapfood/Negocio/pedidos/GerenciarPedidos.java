package unicapfood.Negocio.pedidos;

import java.util.ArrayList;

import unicapfood.Data.RepositorioPedido;
import unicapfood.Negocio.Exceptions.PedidoInexistenteExeption;



public class GerenciarPedidos {
 

  private RepositorioPedido rPedido;

 
    
  public boolean pedidoExistente(int numero){
    return rPedido.pedidoExistente(numero);
  }

  public void adicionarPedido(Pedido pedidoNovo){
    rPedido.adicionarPedido(pedidoNovo);
  }

  public void excluirPedido (Pedido pedidoAExcluir){

   rPedido.excluirPedido(pedidoAExcluir);

  }

  public Pedido buscarPedido(int numeroPedido) throws Exception {
  
    return rPedido.buscarPedido(numeroPedido);
}

public void fecharMesa(){

 rPedido.fecharMesa();
}

  public void exibirPedidos() {
  rPedido.exibirPedidos();
  }

 
  public String toString() {
    return rPedido.toString();
  }
}