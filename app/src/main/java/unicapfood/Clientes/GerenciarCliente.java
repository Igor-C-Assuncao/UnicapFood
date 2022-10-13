package unicapfood.Clientes;

import java.util.ArrayList;

public class GerenciarCliente {

    private ArrayList<Cliente> clienteLista;

    public GerenciarCliente() {
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

    public void buscarCliente(Cliente clienteNovo) {
      if (!clienteExistente(clienteNovo.getCpf())){
        
      }
    }

    @Override
    public String toString() {
      return "GerenciarCliente [clienteLista=" + clienteLista + "]";
    }
}