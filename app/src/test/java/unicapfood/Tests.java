package unicapfood;

import unicapfood.Negocio.Clientes.Cliente;
import unicapfood.Negocio.Pagamentos.Credito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {

    private Cliente cliente;
    private Credito credito;


    @BeforeEach
    public void create(){
        this.cliente = new Cliente( "carol", 123456, "1234");
        this.credito = new Credito("visa", 100, true);
        
    }

    @Test
    public void addCliente(){

        String expected = "carol" ;

        String actual = cliente.getNome();

        assertEquals(expected, actual);

        
       
        
    }

    @Test
    public void testaTaxa(){

         credito.taxaCredito();
        double actual = credito.getValor();
        double expected = 110;

        assertEquals(expected,actual );
        
    }
    
}
