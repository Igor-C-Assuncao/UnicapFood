package unicapfood.Negocio.Estabelecimento;

public class Estabelecimento implements IEstabelecimento {

    private String nome;
    private int codigo;
   
   
   
    public Estabelecimento(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }



    @Override
    public void listaDePedidos() {
        // TODO Auto-generated method stub
        
    }
    
    
    
    @Override
    public void procurarPedido(int numeroPedido) {
        // TODO Auto-generated method stub
        
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getCodigo() {
        return codigo;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
