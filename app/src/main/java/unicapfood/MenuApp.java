package unicapfood;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int op;
        String nomeCliente;

        do {
            exibeMenu();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: //cadastro do cliente (criar lista de clientes)
                        System.out.println("");
                        break;
                case 2: //gerar comanda (gerar um número novo aleatório ou no contador)
                        System.out.println("");
                        break;
                case 3: //realizar pedido (adicionar um item novo no final da lista)
                        System.out.println("");
                        break;
                case 4: //ver carpadio 
                        System.out.println("");
                        break;
                case 5: //exibir a parcial (mostrar todos os itens pedidos até o momento)
                        System.out.println("");
                        break;
                case 6: //fechar a comanda (exibir a conta até o momento e trancar para não realizar mais pedidos)
                        System.out.println("");
                        break;
                case 7: //realizar pagamento (??)
                        System.out.println("");
                        break;
                case 8: //cancelar pedido (remover algum item da lista) 
                        System.out.println("");
                        break;
                case 0: System.out.println("Tchau! Obrigada por utilizar nosso app!!");
                        break;
                default: System.out.println("Opção inválida");
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
        System.out.println("6 - Fechar Comanda");
        System.out.println("7 - Realizar Pagamento");
        System.out.println("8 - Cancelar Pedido");
        System.out.println("0 - Sair");
    }
}