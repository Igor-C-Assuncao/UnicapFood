package unicapfood.Negocio.Pagamentos;

public class Credito implements ValidarPagamento {

    private String bandeira;
    private double valor;
    private boolean cartaoAceito;

    
    
    public Credito(String bandeira, double valor, boolean cartaoAceito) {
        this.bandeira = bandeira;
        this.valor = valor;
        this.cartaoAceito = cartaoAceito;
    }

    public void taxaCredito(){

        double valorTaxa = this.valor * 0.1;

        this.valor = this.valor + valorTaxa ;

    }

    @Override
    public boolean statusDoPagamento() {
    if(cartaoAceito){

        return true;
        
    }else{
        return false;
    }

    }

    
    
    
}
