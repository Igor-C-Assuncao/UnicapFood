package unicapfood;

public class LSENode {
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
}