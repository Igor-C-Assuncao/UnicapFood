package unicapfood;

public class Pedido implements Comparable <Pedido>{
    private String item;

    public Pedido(String item) {
        this.item = item;
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
}
