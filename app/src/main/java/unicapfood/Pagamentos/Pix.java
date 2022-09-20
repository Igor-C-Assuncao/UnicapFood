package unicapfood.Pagamentos;

public class Pix implements ValidarPagamento{

    private String bandeira;
    private double valor;
    private boolean pixRealizado;

   
    public Pix(String bandeira, double valor, boolean pixRealizado) {
        this.bandeira = bandeira;
        this.valor = valor;
        this.pixRealizado = pixRealizado;
    }


    @Override
    public boolean statusDoPagamento() {
      
        if(pixRealizado){

            return true;
            
        }else{
            return false;
        }

    }
    
}
