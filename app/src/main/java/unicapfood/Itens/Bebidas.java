package unicapfood.Itens;

public class Bebidas extends Itens {

    private int tamanho;

    public Bebidas(String nome, double preco, int tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
