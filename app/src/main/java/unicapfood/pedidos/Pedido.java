package unicapfood.pedidos;

public class Pedido implements Comparable <Pedido>{
    
    private String item;
    private int numero;
    private double preco;


   

    public Pedido(String item, int numero, double preco) {
        this.item = item;
        this.numero = numero;
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    public int compareTo (Pedido pedido) {
        int result;
        result = this.getItem().compareTo(pedido.getItem());
        return result;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
