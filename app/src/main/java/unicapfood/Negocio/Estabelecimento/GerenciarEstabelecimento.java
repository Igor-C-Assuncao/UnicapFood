package unicapfood.Negocio.Estabelecimento;

import java.util.ArrayList;

import unicapfood.Data.RepositorioEstabelecimento;

public class GerenciarEstabelecimento {

private RepositorioEstabelecimento rEstabelecimento;

    public boolean estabelecimenmtoExistente(String nome){
      
      return rEstabelecimento.estabelecimenmtoExistente(nome);
    }

    public void  estabelecimenmtoNovo(Estabelecimento estabelecimenmtoNovo){

      rEstabelecimento.estabelecimenmtoNovo(estabelecimenmtoNovo);

    }
    
}
