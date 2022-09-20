package unicapfood;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        

        int op;
        double raio, lado, lado1, lado2, altura, base;

        do {
            exibeMenu();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1: //quadrilátero
                        System.out.print("Insira o lado 1: ");
                        lado1 = in.nextDouble();
                        System.out.print("Insira o lado 2: ");
                        lado2 = in.nextDouble();
                        quadrilatero = new Quadrilatero(lado1, lado2);
                        quadrilatero.calculaPerimetro();
                        System.out.println("O perimetro é: " + quadrilatero.calculaPerimetro());
                        break;
                case 2: System.out.print("Insira o lado 1: ");
                        lado1 = in.nextDouble();
                        System.out.print("Insira o lado 2: ");
                        lado2 = in.nextDouble();
                        quadrilatero = new Quadrilatero(lado1, lado2);
                        quadrilatero.calculaArea();
                        System.out.println("A área é: " + quadrilatero.calculaArea());
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