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
                case 1: System.out.println("");
                        break;
                case 2: System.out.println("");
                        break;
                case 3: System.out.println("");
                        break;
                case 4: System.out.println("");
                        break;
                case 5: System.out.println("");
                        break;
                case 6: System.out.println("");
                        break;
                case 7: System.out.println("");
                        break;
                case 8: System.out.println("");
                        break;
                case 9: System.out.println("");
                        break;
                case 10: System.out.println("");
                        break;
                case 0: System.out.println("Tchau! Obrigada por utilizar nosso app!!");
                        break;
                default: System.out.println("Opção inválida");
            }           
        } while (op != 0);
    }
    public static void exibeMenu() {
        System.out.println("Opções:");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        System.out.println("4 - ");
        System.out.println("5 - ");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("8 - ");
        System.out.println("9 - ");
        System.out.println("10 - ");
        System.out.println("0 - Sair");
    }
}