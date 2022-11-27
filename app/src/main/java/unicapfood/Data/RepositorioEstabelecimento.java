package unicapfood.Data;

import java.util.ArrayList;

import unicapfood.Negocio.Estabelecimento.Estabelecimento;

public class RepositorioEstabelecimento {


    private ArrayList<Estabelecimento> estabelecimentoLista;

    public void GerenciarEstabelecimento() {
      this.estabelecimentoLista = new ArrayList();
    }
    

    public boolean estabelecimenmtoExistente(String nome){
      for(Estabelecimento checarEstabelecimento : estabelecimentoLista ){
        if (checarEstabelecimento.getNome() == nome ){
          return true;
        }
      }
      return false;
    }

    public void  estabelecimenmtoNovo(Estabelecimento estabelecimenmtoNovo){

      if (! estabelecimenmtoExistente(estabelecimenmtoNovo.getNome())){
        estabelecimentoLista.add(new Estabelecimento(estabelecimenmtoNovo.getNome(),estabelecimenmtoNovo.getCodigo()));
        }
      }


    
}
