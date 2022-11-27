package unicapfood.Negocio.Itens;

import java.util.ArrayList;

import unicapfood.Data.RepositorioItens;

public class GerenciadorDeItems {

    

    private RepositorioItens rItens;

    
    public boolean itemExistente(String nome){
        return rItens.itemExistente(nome);
    }

    public void adicionarBebidas(Bebidas itemNovo){

      rItens.adicionarBebidas(itemNovo);
      }
    
    public void adicionarPrato(Pratos itemNovo){

      rItens.adicionarPrato(itemNovo);
    }

    public void exibirItens() {
    rItens.exibirItens();
    }
  
}
    

