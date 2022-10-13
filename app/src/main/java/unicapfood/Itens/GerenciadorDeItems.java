package unicapfood.Itens;

import java.util.ArrayList;

public class GerenciadorDeItems {

    private ArrayList<Itens> listaDeItens;

    public GerenciadorDeItems() {
      this.listaDeItens = new ArrayList();
    }
    
    public boolean itemExistente(String nome){
      for(Itens checarItem:listaDeItens ){
        if (checarItem.getNome() == nome ){
          return true;
        }
      }
      return false;
    }

    public void adicionarBebidas(Bebidas itemNovo){

      if (!itemExistente(itemNovo.getNome())){
        listaDeItens.add(new Bebidas(itemNovo.getNome(),itemNovo.getPreco(), itemNovo.getTamanho()));
        }
      }
      public void adicionarPrato(Pratos itemNovo){

        if (!itemExistente(itemNovo.getNome())){
          listaDeItens.add(new Pratos(itemNovo.getNome(),itemNovo.getPreco(), itemNovo.getQntPessoasServidas()));
          }
        }

    public void exibirItens() {
      System.out.println(listaDeItens);
    }
  
}
    

