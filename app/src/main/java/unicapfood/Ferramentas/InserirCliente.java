package unicapfood.Ferramentas;

import unicapfood.Cliente;

public class InserirCliente {

    private Cliente cliente;


    public InserirCliente(Cliente cliente) {
        // verifica, usando o "buscar", se o Cliente já é cadastrado.
        LSENode aux = LSENode.primeiro;
        LSENode result = LSENode.buscar(cliente);
        if (result != null) {
            System.out.println("O Cliente já está na lista!");
        } else {
            // insere um novo cliente no final de lista
            LSENode novo = new LSENode(cliente);
            if (this.isEmpty() == true) {
                this.primeiro = novo;
            } else {
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Cadastro efetuado!");
        }
    }
    
}
