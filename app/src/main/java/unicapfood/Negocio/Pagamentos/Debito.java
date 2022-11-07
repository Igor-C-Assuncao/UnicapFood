package unicapfood.Negocio.Pagamentos;

public class Debito implements ValidarPagamento{

    private String bandeira;
    private double valor;
    private boolean cartaoAceito;
    
    @Override
    public boolean statusDoPagamento() {
        if(cartaoAceito){

            return true;
            
        }else{
            return false;
        }
    }
    
}
