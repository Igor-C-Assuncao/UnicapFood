package unicapfood.pedidos;

import java.util.ArrayList;

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

    public void adicionarUsuario(Pedido pedidoNovo){

      if (!pedidoExistente(pedidoNovo.getNumero())){
          listaDePedidos.add(new Pedido(pedidoNovo.getItem(),pedidoNovo.getNumero(), pedidoNovo.getPreco()));
        }
      }

      
    
}
