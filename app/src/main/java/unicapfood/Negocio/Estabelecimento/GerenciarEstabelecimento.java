package unicapfood.Negocio.Estabelecimento;

import java.util.ArrayList;

public class GerenciarEstabelecimento {

    private ArrayList<IEstabelecimento> estabelecimentoLista;

    public GerenciarEstabelecimento() {
      this.estabelecimentoLista = new ArrayList();
    }
    

    // public boolean clienteExistente(String nome){
    //   for(IEstabelecimento checarEstabelecimento : estabelecimentoLista ){
    //     if (checarEstabelecimento.getNome() == nome ){
    //       return true;
    //     }
    //   }
    //   return false;
    // }

    // public void adicionarUsuario(Cliente clienteNovo){

    //   if (!clienteExistente(clienteNovo.getNome())){
    //       clienteLista.add(new Cliente(clienteNovo.getNome(),clienteNovo.getCpf(), clienteNovo.getSenha()));
    //     }
    //   }


    
}
