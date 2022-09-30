package unicapfood.pedidos;

import unicapfood.Clientes.Cliente;

public class Comanda {
    private Cliente cliente;
    private int nComanda;

    public Comanda(Cliente cliente, int nComanda) {
        this.cliente = cliente;
        this.nComanda = nComanda;
    }
    
}