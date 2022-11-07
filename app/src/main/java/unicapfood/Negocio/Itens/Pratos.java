package unicapfood.Negocio.Itens;

public class Pratos extends Itens {

    private int qntPessoasServidas;

    public Pratos(String nome, double preco, int qntPessoasServidas) {
        super(nome, preco);
        this.qntPessoasServidas = qntPessoasServidas;
    }

    public int getQntPessoasServidas() {
        return qntPessoasServidas;
    }

    public void setQntPessoasServidas(int qntPessoasServidas) {
        this.qntPessoasServidas = qntPessoasServidas;
    }

    
    
    
}
