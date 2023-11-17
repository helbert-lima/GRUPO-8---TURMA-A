package Projeto;

import java.util.Scanner;

public class ProjetoPi {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n..:: A JORNADA DO NOVATO..:: \n"
                + "Bem-vindo ao RPG \"A Jornada do Novato\"! Neste jogo você deverá decidir o futuro de um jovem indeciso e perdido.\n");
        avancarDialogo();
        System.out.println("Sem muito rumo ou noção do que deseja, ele se dá de cara com a impiedosa realidade da vida adulta.\"Preciso de um emprego.\". \n"
                //+ "missão é ajudar Alex a navegar pelos desafios do mundo corporativo, aprender sobre administração\n"
                + "E com essas palavras dá-se ínicio a jornada de um novato no mundo corporativo. \n"
                + "Seu objetivo agora é se preparar para uma entrevista de emprego, algo que certamente não lhe foi ensinado na escola.\n");
        avancarDialogo();
        System.out.println("Restante da história a desenvolver.\n");
        //                + "determinarão o resultado final. Vamos começar!");
        System.out.println("Eai, tá pronto?");

        System.out.println("\n1 - Estou pronto. | 2 - Eu nasci pronto |3 - Sei lá...");
        int escolha_menu = entrada.nextInt();
        if (escolha_menu == 1 || escolha_menu == 2) {
            System.out.println("\nMestre: Conheça o pavor da vida adulta!");
            menu();
        } else if (escolha_menu == 3) {
            System.out.println(
                    "\nMestre: Não se engane jovem, não é como se você tivesse muita escolha... Aceite ou seja derrotado pelos boletos!");
            menu();
        } else {
            System.out.println(
                    "\nMestre: Mesmo digitando uma opção inválida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios e encontre a cura...");
            menu();
        }
    }

    static void menu() {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu;
        do {
            System.out.println(
                    "\n\n..:: A JORNADA DO NOVATO ::.. \n\n1 - Jogar \n2 - Capítulos\n3 - Créditos \n4 - Sair");
            System.out.println("\n");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 1) {
                jogo();

            } else if (escolha_menu == 2) {
                capitulos();
            } else if (escolha_menu == 3) {
                creditos();
            } else if (escolha_menu == 4) {
                System.exit(0);
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
    }

    static void capitulos() {
        Scanner entrada = new Scanner(System.in);
        int escolha_capitulo;
        System.out.println("\n..:: A JORNADA DO NOVATO - Capítulos da História ::..");
        do {
            System.out.println(
                    "\n\n1 - A 1º entrevista de emprego\n2 - Os Anseios dos Recursos humanos\n3 - O Despertar!\n4 - Voltar");
            escolha_capitulo = entrada.nextInt();
            if (escolha_capitulo == 1) {
                capitulo_1();
            } else if (escolha_capitulo == 2) {
                capitulo_2();
            } else if (escolha_capitulo == 3) {
                capitulo_3();
            } else if (escolha_capitulo == 4) {
                capitulo_4();
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_capitulo != 1 && escolha_capitulo != 2 && escolha_capitulo != 3 && escolha_capitulo != 4);
    }

    static void jogo() {
        Scanner entrada = new Scanner(System.in);

    }

    static void capitulo_1() {

    }

    static void capitulo_2() {

    }

    static void capitulo_3() {

    }

    static void capitulo_4() {

    }

    static void creditos() {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu, temp_narrativa = 150;
        System.out.println(
                "\n\n</> Desenvolvedores </>\n\n-> Helbert \n-> Juan Miller \n-> Melina Michele \n-> Rômulo Andrade");
        do {
            System.out.println("\n2 - Sair");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 2) {
                menu();
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_menu != 2);
    }

    static Boolean avancarDialogo() {
        System.out.println("\nPressione ENTER para avançar.\n");
        Scanner entrada = new Scanner(System.in);
        String avancar = entrada.nextLine();

        if (avancar.equals("")) {
            return true; 
        } else {
            System.out.println("Por favor, pressione Enter para avançar.");
            return false; 
        }
    }
}