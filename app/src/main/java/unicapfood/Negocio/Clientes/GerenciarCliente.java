package unicapfood.Negocio.Clientes;

import java.util.ArrayList;

import unicapfood.Data.RepositorioCliente;
import unicapfood.Negocio.Exceptions.ClienteNaoEncotradoExepition;


public class GerenciarCliente {

    private RepositorioCliente rCliente;
    
    public boolean clienteExistente(int cpf){
     return rCliente.clienteExistente(cpf);
    }
    
    
    
    public void adicionarUsuario(Cliente clienteNovo){
     
      rCliente.adicionarUsuario(clienteNovo);

      }

    public Cliente buscarCliente(int cpf) throws Exception {
      
      return rCliente.buscarCliente(cpf);
  }
  public String toString() {
    return rCliente.toString();
  }
    
}