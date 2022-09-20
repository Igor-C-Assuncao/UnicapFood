package unicapfood.Ferramentas;

import unicapfood.Cliente;
import unicapfood.Pedido;

public class LSENode {
    public static LSENode primeiro;
    // Atributos
    private Cliente info;
    private Pedido item;
    private LSENode prox;

    // Construtor      
    public LSENode (Cliente valor) {
        this.info = valor;
    }  
    
    public LSENode (Pedido valor) {
        this.item = valor;
    }

    // Métodos GET e SET
    public void setInfo (Cliente valor) {
        this.info = valor;
    }

    public void setItem(Pedido valor) {
        this.item = valor;
    }

    public void setProx (LSENode novoProx) {
        this.prox = novoProx;
    }

    public Cliente getInfo() {
        return this.info;
    }
    
    public LSENode getProx() {
        return this.prox;
    }

    public Pedido getItem() {
        return this.item;
    }    

    public LSENode buscar(Pedido pedido) {
        LSENode aux;
        if (IsEmpty.isEmpty() == true) {
            return null;
        } else {
            aux = LSENode.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(pedido) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }
}