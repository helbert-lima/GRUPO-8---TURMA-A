package Projeto;
import java.util.Scanner;

public class ProjetoPi {
    public static int menu (){
        Scanner input = new Scanner(System.in);
        int menu;

        do {
        System.out.println("Testando");
        System.out.println("*-* MENU *-* ");
        System.out.println("\n1 - Novo Jogo");
        System.out.println("2 - créditos dos criadores");
        System.out.println("Digite o número equivalente a opção que desejar =D");
        menu = input.nextInt();
        if (menu < 1 || menu > 2){
            System.out.println("Operação Inválida");
            System.out.println("Escolha uma Operação");

            input.close();
        }
        }while(menu < 1 || menu > 4);
        return menu;
    }
    






    public static void main(String[] args) {
        System.out.println(menu());
    }
    
}
