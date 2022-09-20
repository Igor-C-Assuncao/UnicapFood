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
                case 1: 
                        break;
                case 2: 
                        break;
                case 0: System.out.println("Programa encerrado!");
                        break;
                default: System.out.println("Opção inválida");
            }           
        } while (op != 0);
    }
    public static void exibeMenu() {
        System.out.println("Opções:");
        System.out.println("1 - Calcular perimetro de um quadrilátero");
        System.out.println("2 - Calcular área de um quadrilátero");
    }
}