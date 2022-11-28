package unicapfood.UI;

import java.util.Scanner;

import unicapfood.Negocio.Fachada;
import unicapfood.Negocio.Clientes.Cliente;
import unicapfood.Negocio.Clientes.GerenciarCliente;
import unicapfood.Negocio.Itens.GerenciadorDeItems;
import unicapfood.Negocio.Itens.Itens;
import unicapfood.Negocio.pedidos.Comanda;
import unicapfood.Negocio.pedidos.GerenciarPedidos;
import unicapfood.Negocio.pedidos.Pedido;

public class MenuApp {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        Scanner incpf = new Scanner (System.in);
        Scanner instring = new Scanner (System.in);
        
       
   

        Fachada fachada = new Fachada();
        int op, op2,numeroPedido = 0;
        String nomeCliente, senha,item;
        Comanda comanda;
        Cliente clienteNovo;
        Itens carpadio;
        Pedido pedidoNovo;
        int cpf;
        int nComanda = 0;
        double preco;


        do {
            exibeMenu();
            op = in.nextInt(); in.nextLine();
        switch (op) {
                case 1: //cadastro do cliente (criar lista de clientes)
                        System.out.println("Insira seu nome: ");
                        nomeCliente = in.nextLine();
                        System.out.println("Insira seu CPF: ");
                        cpf = incpf.nextInt();
                        System.out.println("Crie uma senha: ");
                        senha = instring.nextLine();
                        clienteNovo = new Cliente(nomeCliente, cpf, senha);
                        fachada.adicionarUsuario(clienteNovo);
                        break;
                case 2: //gerar comanda (gerar um número novo no contador)
                        nComanda = nComanda + 1;
                        System.out.println("Insira seu cpf: ");
                        cpf = in.nextInt();
                        fachada.buscarCliente(cpf);
                        System.out.println("O número da sua comanda será: "+ nComanda);
                        comanda = new Comanda(cpf, nComanda);
                        break;
                case 3: //realizar pedido (adicionar um item novo no final da lista)
                        System.out.println("Insira seu pedido: ");
                        System.out.println("item: ");
                        item = in.nextLine();
                        numeroPedido++;
                        System.out.println(" Preço :");
                        preco = in.nextInt();
                        pedidoNovo = new Pedido(item, numeroPedido, preco);
                        fachada.adicionarPedido(pedidoNovo);
                        break;
                case 4: //ver carpadio 
                        System.out.println("Cardapio: ");
                        fachada.exibirItens();
                        break;
                case 5: //exibir a parcial (mostrar todos os itens pedidos até o momento)
                        System.out.println("Parcial da comanda "+ nComanda + ":");
                        fachada.toString();
                        break;
                case 6: //fechar a comanda e realizar pagamento
                        System.out.println("Seus pedidos foram: ");
                        fachada.toString();
                        System.out.println(" ");
                        System.out.println("Escolha uma forma de pagamento: ");
                        System.out.println("1- Crédito");
                        System.out.println("2- Débito");
                        System.out.println("3- Pix");
                        op2 = in.nextInt(); in.nextLine();

                        switch (op2) {
                                case 1: //pagamento no crédito
                                        System.out.println("Pagamento Aprovado");
                                        fachada.fecharMesa();
                                        break;
                                case 2: //pagamento no dédito
                                        System.out.println("Pagamento Aprovado");
                                        fachada.fecharMesa();
                                        break;
                                case 3: //pagamento no pix
                                        System.out.println("Pagamento Aprovado");
                                        fachada.fecharMesa();
                                        break;
                                default: System.out.println("Opção inválida!");
                                        break;
                        }
                        break;
                case 7: //cancelar pedido (remover algum item da lista) 
                        System.out.println("Insira o numero do pedido você gostaria de retirar: ");
                        int nPedido = in.nextInt();
                        Pedido pedidoBuscado = fachada.buscarPedido(nPedido);
                        fachada.excluirPedido(pedidoBuscado);                        
                        fachada.fecharMesa();
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