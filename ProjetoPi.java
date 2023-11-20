package Projeto;

import java.util.Scanner;

public class ProjetoPi {        static String nome_jogador;


    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n..:: A JORNADA DO NOVATO..:: \n"
                + "Bem-vindo ao RPG \"A Jornada do Novato\"! Neste jogo você deverá decidir o futuro de um jovem indeciso e perdido.\n");
        avancarDialogo();
        System.out.println("Sem muito rumo ou noção do que deseja, ele se dá de cara com a impiedosa realidade da vida adulta. \n"
        + "\nSeu pai, cansado de ver que o filho que não tem emprego, finalmente o confronta e o pergunta quando ele \"...vai começar a ajudar com as contas\".\n"
        + "Mais tarde no mesmo dia, a sua mãe, impacientemente, o diz que lavar a casa e as roupas \"é nada mais que sua obrigação\"\n");
        avancarDialogo();
        System.out.println("\n\"É... não tem jeito. Preciso arranjar um emprego\".\n"
        + "\nE com essas palavras dá-se ínicio a jornada de um novato no mundo corporativo.\n"
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
        System.out.println("\nOlá tudo bem? poderia me dizer o seu nome?\n");
        nome_jogador = entrada.next();
        System.out.println("\n" + nome_jogador + " vê-se diante a recepção da empresa \"CorpoTech\". Logo a sua frente está uma funcionária da empresa; ao que tudo indicaria, uma recepcionista.");
        System.out.println("\n" + nome_jogador + " ouviu má boatos sobre essa tal de CorpoTech. Mas não é como se ele(a) tivesse o benefício da escolha."
        + "\nE por ter a audácia de não ter nascido sobrinho do gerente, terá de iniciar sua carreira em um degrau mais baixo da hierarquia.\n");
        avancarDialogo();
        System.out.println("Você: Meu nome é " + nome_jogador + 
        "\nRecepcionista: Ah sim! claro, " + nome_jogador +"."+ " estão lhe aguardando na sala 18 no 1º Andar\n"
        + nome_jogador + ": Agradecido.");
        avancarDialogo();
        System.out.println(nome_jogador + " sai em direção à sala onde ocorrerá a sua primeira entrevista de emprego. Boa sorte " +nome_jogador+ "!");
        capitulo_1();
        


    }

    static void capitulo_1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println( "\n\n     ..:: CAPITULO 1 ::..         \n" + "\n     A ENTREVISTA DE EMPREGO         \n\n\n");
        System.out.println(nome_jogador + " está diante a sala 18 no 1º Andar.\n"
        + "Suas pernas trêmulas e mãos frias indicam certa ansiedade\n"
        + "\n\"Recomponha-se " +nome_jogador+ "!\" não é hora de amarelar. - Pensa " + nome_jogador 
        + "\nUm suspiro profundo preenche o corredor antes de adentrar na sala."
        + "\nA entrevista está prestes a começar, e cada passo parece uma eternidade."
        );

        avancarDialogo();

        System.out.println("\n" + nome_jogador + " entra na sala, deparando-se com um entrevistador sério."
            + "\nA atmosfera pesada e a tensão no ar são quase palpáveis."
            + "\n- Bom dia, " + nome_jogador + ". Por favor, sente-se. - Diz o entrevistador"
            + "\nO coração acelera, mas é hora de mostrar sua melhor versão.\n");
            System.out.println("*---* Você está prestes a participar de um jogo de múltipla escolha, onde apenas uma das opções é correta. *---*\n"+
            "               Acerte as respostas para passar na entrevista de emprego!\n\n"
            + "Pergunta 1: Como você descreveria suas habilidades de trabalho em equipe?\n"
            + "\nA - Tenho dificuldade em trabalhar com outras pessoas\n"
            + "\nB - Eu trabalho bem em equipe e colaboro efetivamente”\n"
            + "\nC-  Prefiro trabalhar sozinho e evitar equipes\n"
            + "\nD-  nois trabalha sem câoh tá ligado meu? nois é responsa mano.\n"
            );

            String resposta_pergunta_1 = entrada.next();

            if (resposta_pergunta_1.equalsIgnoreCase("B")) {
                System.out.println("\n- Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta
            } else if (resposta_pergunta_1.equalsIgnoreCase("D")) {
                System.out.println("\n- É... tá certo, entendi \"mano\". Vamos para a próxima pergunta então..."); // Mensagem para resposta alternativa
            } else {
                System.out.println("\n- Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
            }
            
    }

    static void capitulo_2() {

    }

    static void capitulo_3() {

    }

    static void capitulo_4() {

    }

    static void creditos() {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu;
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
            return true; // Retorna true se o usuário pressionou apenas Enter
        } else {
            System.out.println("Por favor, pressione Enter para avançar.");
            return false; 
        }
    }
}