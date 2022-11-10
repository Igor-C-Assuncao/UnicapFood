package unicapfood.Negocio;

import unicapfood.Negocio.Clientes.Cliente;
import unicapfood.Negocio.Exceptions.ClienteNaoEncotradoExepition;
import unicapfood.Negocio.pedidos.Pedido;

public interface IFachada {

  public void adicionarUsuario(Cliente cliente);

  public Cliente buscarCliente(int cpf) throws Exception;

  public void adicionarPedido(Pedido pedido);

  public void exibirItens();

  public void fecharMesa();

  public void excluirPedido(Pedido pedido);

  public Pedido buscarPedido(int nPedido) throws Exception;
  



}




  
