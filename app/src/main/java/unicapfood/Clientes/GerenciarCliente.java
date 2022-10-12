package unicapfood.Clientes;

import java.util.ArrayList;

public class GerenciarCliente {

    private ArrayList<Cliente> clienteLista;

    public GerenciarCliente() {
      this.clienteLista = new ArrayList();
    }
    
    public boolean clienteExistente(String nome){
      for(Cliente checarCLiente:clienteLista ){
        if (checarCLiente.getNome() == nome ){
          return true;
        }
      }
      return false;
    }

    public void adicionarUsuario(Cliente clienteNovo){

      if (!clienteExistente(clienteNovo.getNome())){
          clienteLista.add(new Cliente(clienteNovo.getNome(),clienteNovo.getCpf(), clienteNovo.getSenha()));
        }
      }

    @Override
    public String toString() {
      return "GerenciarCliente [clienteLista=" + clienteLista + "]";
    }
}
