package unicapfood;

public class PedidoInexistenteExeption extends Exception{

    public PedidoInexistenteExeption(){
        super("Pedido digitado  nao existe");
    }
    
}
