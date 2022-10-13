package unicapfood;
import java.util.ArrayList;
import java.util.Scanner;

import unicapfood.Clientes.Cliente;
import unicapfood.Estabelecimento.IEstabelecimento;
import unicapfood.Itens.Itens;
import unicapfood.pedidos.Comanda;
import unicapfood.pedidos.Pedido;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        ArrayList<Cliente> clienteLista;
        ArrayList<Pedido> listaDePedidos;
        ArrayList<IEstabelecimento> estabelecimentoLista;
        ArrayList<Itens> listaDeItens;
        
        int op, op2;
        String nomeCliente, pedidoNovo, senha, pedido;
        Comanda comanda;
        Cliente clienteNovo;
        Itens carpadio;
        int cpf;
        int nComanda = 0;


        do {
            exibeMenu();
            op = in.nextInt(); in.nextLine();
        switch (op) {
                case 1: //cadastro do cliente (criar lista de clientes)
                        System.out.println("Insira seu nome: ");
                        nomeCliente = in.nextLine();
                        System.out.println("Insira seu CPF: ");
                        cpf = in.nextInt();
                        System.out.println("Insira sua senha: ");
                        senha = in.nextLine();
                        clienteNovo = new Cliente(nomeCliente, cpf, senha);
                        clienteLista.adicionarUsuario(clienteNovo);
                        break;
                case 2: //gerar comanda (gerar um número novo aleatório ou no contador)
                        nComanda = nComanda + 1;
                        System.out.println("Insira seu cpf: ");
                        cpf = in.nextInt();
                        System.out.println("O número da sua comanda será: "+ nComanda);
                        comanda = new Comanda(cpf, nComanda);
                        break;
                case 3: //realizar pedido (adicionar um item novo no final da lista)
                        System.out.println("Insira seu pedido: ");
                        pedidoNovo = in.nextLine();
                        pedidoNovo.adicionarPedido(pedidoNovo);
                        break;
                case 4: //ver carpadio 
                        System.out.println("Cardapio: ");
                        cardapio.exibirItens();
                        break;
                case 5: //exibir a parcial (mostrar todos os itens pedidos até o momento)
                        System.out.println("Parcial da comanda "+ nComanda + ":");
                        comanda.exibirPedidos();
                        break;
                case 6: //fechar a comanda e realizar pagamento
                        System.out.println("Seus pedidos foram: ");
                        listaDePedidos.exibirPedidos();
                        System.out.println(" ");
                        System.out.println("Escolha uma forma de pagamento: ");
                        System.out.println("1- Crédito");
                        System.out.println("2- Débito");
                        System.out.println("3- Pix");
                        op2 = in.nextInt(); in.nextLine();

                        switch (op2) {
                                case 1: //pagamento no crédito
                                        System.out.println("Pagamento Aprovado");
                                        break;
                                case 2: //pagamento no dédito
                                        System.out.println("Pagamento Aprovado");
                                        break;
                                case 3: //pagamento no pix
                                        System.out.println("Pagamento Aprovado");
                                        break;
                                default: System.out.println("Opção inválida!");
                                        break;
                        }
                        break;
                case 7: //cancelar pedido (remover algum item da lista) 
                        System.out.println("Insira qual item você gostaria de retirar: ");
                        pedido = in.nextLine();
                        listaDePedidos.remove(pedido);
                        break;
                case 0: System.out.println("Tchau! Obrigada por utilizar nosso app!!");
                        break;
                default: System.out.println("Opção inválida");
                        break;
            }
        } while (op != 0);
    }
    public static void exibeMenu() {
        System.out.println("Opções:");
        System.out.println("1 - Cadastro de Cliente");
        System.out.println("2 - Gerar Comanda");
        System.out.println("3 - Realizar Pedido");
        System.out.println("4 - Ver Cardapio");
        System.out.println("5 - Exibir a Parcial");
        System.out.println("6 - Fechar Comanda e realizar pagamento");
        System.out.println("7 - Cancelar Pedido");
        System.out.println("0 - Sair");
    }
}