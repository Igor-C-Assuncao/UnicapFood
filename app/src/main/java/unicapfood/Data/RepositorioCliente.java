package unicapfood.Data;

import java.util.ArrayList;

import unicapfood.Negocio.Clientes.Cliente;
import unicapfood.Negocio.Exceptions.ClienteNaoEncotradoExepition;

public class RepositorioCliente {


    private ArrayList<Cliente> clienteLista;

    public RepositorioCliente() {
      this.clienteLista = new ArrayList();
    }
    
    public boolean clienteExistente(int cpf){
      for(Cliente checarCLiente:clienteLista ){
        if (checarCLiente.getCpf() == cpf ){
          return true;
        }
      }
      return false;
    }

    public void adicionarUsuario(Cliente clienteNovo){
      if (!clienteExistente(clienteNovo.getCpf())){
          clienteLista.add(new Cliente(clienteNovo.getNome(),clienteNovo.getCpf(), clienteNovo.getSenha()));
        }
      }

    public Cliente buscarCliente(int cpf) throws Exception {
      if (!clienteExistente(cpf)){
        throw new ClienteNaoEncotradoExepition();
      }
      for(Cliente checarCLiente:clienteLista ){
        if (checarCLiente.getCpf() == cpf ){

          return checarCLiente;
        }

    }
      return null;
  }

    @Override
    public String toString() {
      return "GerenciarCliente [Lista de clientes cadastrados : " + clienteLista + "]";
    }
    
}
