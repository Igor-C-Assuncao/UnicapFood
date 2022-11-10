package unicapfood.Negocio;

import unicapfood.Negocio.Clientes.Cliente;
import unicapfood.Negocio.Clientes.GerenciarCliente;
import unicapfood.Negocio.Estabelecimento.GerenciarEstabelecimento;
import unicapfood.Negocio.Exceptions.ClienteNaoEncotradoExepition;
import unicapfood.Negocio.Itens.GerenciadorDeItems;
import unicapfood.Negocio.pedidos.GerenciarPedidos;
import unicapfood.Negocio.pedidos.Pedido;

public class Fachada implements IFachada{
  private GerenciarCliente gCliente;
  private GerenciarPedidos gPedidos;
  private GerenciadorDeItems gDeItems;
  private GerenciarEstabelecimento gEstabelecimento;

 
 
 
 
  public Fachada() {
    this.gCliente  = new GerenciarCliente();
    this.gPedidos   = new GerenciarPedidos();
    this.gDeItems  = new GerenciadorDeItems();
    this.gEstabelecimento  = new GerenciarEstabelecimento();
  }


  @Override
  public void adicionarUsuario(Cliente cliente) {
    
    this.gCliente.adicionarUsuario(cliente);

  }
  @Override
  public Cliente buscarCliente(int cpf) throws Exception {
   
   return this.gCliente.buscarCliente(cpf);
    
  }
  @Override
  public void adicionarPedido(Pedido pedido) {
   
    gPedidos.adicionarPedido(pedido);
  }
  @Override
  public void exibirItens() {
   gDeItems.exibirItens();
    
  }
  @Override
  public void fecharMesa() {
    
    gPedidos.fecharMesa();
    
  }



  @Override
  public void excluirPedido(Pedido pedido) {
    // TODO Auto-generated method stub
    
  }

  public String toString(){

   return gPedidos.toString();
  }


  @Override
  public Pedido buscarPedido(int nPedido) throws Exception {
        
    return gPedidos.buscarPedido(nPedido);
  }

  
}