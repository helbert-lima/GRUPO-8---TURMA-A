package Projeto;

import java.util.Scanner;

public class ProjetoTeste {
    static String nome_jogador;

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n..:: A JORNADA DO NOVATO..:: \n"
                + "Bem-vindo ao RPG \"A Jornada do Novato\"! Neste jogo você deverá decidir o futuro de um jovem indeciso e perdido.\n");
        avancarDialogo();
        System.out.println(
                "Sem rumo ou noção do que deseja, ele se dá de cara com a impiedosa realidade da vida adulta. \n"
                        + "\nSeu pai, cansado de ver que o filho não tem emprego, finalmente o confronta e o pergunta quando ele\n \"...vai começar a ajudar com as contas\".\n"
                        + "Mais tarde no mesmo dia, a sua mãe, impacientemente, o diz que lavar a casa e as roupas\n \"é nada mais que sua obrigação.\"\n");
        avancarDialogo();
        System.out.println("\n\"É... não tem jeito. Preciso arranjar um emprego\".\n"
                + "\nE com essas palavras dá-se ínicio a jornada de um novato no mundo corporativo.\n"
                + "Seu objetivo agora é se preparar para uma entrevista de emprego, algo que certamente não lhe foi ensinado na \nescola.\n");
        avancarDialogo();
        System.out.println("Restante da história a desenvolver.\n");
        // + "determinarão o resultado final. Vamos começar!");
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
                    "\nMestre: Mesmo digitando uma opção inválida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios...");
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
        System.out.println("\nOlá, tudo bem? poderia me dizer o seu nome?\n");
        nome_jogador = entrada.next();
        avancarDialogo();
        System.out.println("\n" + nome_jogador
                + " vê-se diante a recepção da empresa \"CorpoTech\". Logo a sua frente está uma funcionária da empresa; ao que \ntudo indicaria, uma recepcionista.");
        System.out.println("\n" + nome_jogador
                + " ouviu maus boatos sobre essa tal de CorpoTech. Mas não é como se ele(a) tivesse o benefício da escolha."
                + "\nE por ter a audácia de não ter nascido sobrinho do gerente, terá de iniciar sua carreira em um degrau mais baixo da hierarquia.\n");
        avancarDialogo();
        System.out.println("Você: Meu nome é " + nome_jogador + "." +
                "\nRecepcionista: Ah, sim! claro, " + nome_jogador + "."
                + " Estão lhe aguardando na sala 18 no 1º Andar.\n"
                + nome_jogador + ": Agradecido.");
        avancarDialogo();
        System.out.println(
                nome_jogador + " sai em direção à sala onde ocorrerá a sua primeira entrevista de emprego. Boa sorte "
                        + nome_jogador + "!");
        capitulo_1();

    }

    static void capitulo_1() {
        Scanner entrada = new Scanner(System.in);
        System.out
                .println("\n\n     ..:: CAPITULO 1 ::..         \n" + "\n     A ENTREVISTA DE EMPREGO         \n\n\n");
        System.out.println(nome_jogador + " está diante a sala 18 no 1º Andar.\n"
                + "Suas pernas trêmulas e mãos frias indicam certa ansiedade.\n"
                + "\n\"Recomponha-se, " + nome_jogador + "!\" não é hora de amarelar. - Pensa " + nome_jogador
                + "\nUm suspiro profundo preenche o corredor antes de adentrar na sala."
                + "\nA entrevista está prestes a começar, e cada passo parece uma eternidade.");

        avancarDialogo();

        System.out.println("\n" + nome_jogador + " entra na sala, deparando-se com uma entrevistadora séria."
                + "\nA atmosfera pesada e a tensão no ar são quase palpáveis."
                + "\nEntrevistadora: Bom dia, " + nome_jogador + ". Por favor, sente-se."
                + "\nO coração acelera, mas é hora de mostrar sua melhor versão.\n");
        System.out.println(
                "*---* Você está prestes a participar de um jogo de múltipla escolha, onde apenas uma das opções é correta. *---*\n"
                        +
                        "               Acerte as respostas para passar na entrevista de emprego!\n\n"
                        + "Pergunta 1: Como você descreveria suas habilidades de trabalho em equipe?\n"
                        + "\nA - Tenho dificuldade em trabalhar com outras pessoas.\n"
                        + "\nB - Eu trabalho bem em equipe e colaboro efetivamente.\n"
                        + "\nC - Prefiro trabalhar sozinho e evitar equipes.\n"
                        + "\nD - nois trabalha sem câoh tá ligado meu? nois é responsa mano.\n");

        String resposta_pergunta_1 = entrada.next();
        int respostasCorretas = 0;

        if (resposta_pergunta_1.equalsIgnoreCase("B")) {
            System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta
                                                                                              // correta
            respostasCorretas++;
        } else if (resposta_pergunta_1.equalsIgnoreCase("D")) {
            System.out.println(
                    "\nEntrevistadora: É... tá certo, entendi \"mano\". Vamos para a próxima pergunta então..."); // Mensagem
                                                                                                                  // para
                                                                                                                  // resposta
                                                                                                                  // alternativa
        } else {
            System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para
                                                                                                     // resposta
                                                                                                     // incorreta
        }

        System.out.println("\nPergunta 2: Como você lida com feedback e críticas construtivas?\n"
                + "\nA - Fico defensivo e não gosto de receber feedback.\n"
                + "\nB - Valorizo feedback e tento melhorar com base nele.\n"
                + "\nC - Eu não costumo receber feedback porque sou perfeito.\n"
                + "\nD - É o seguinte meoh eu não gosto de recalque não menor.\n");

        String resposta_pergunta_2 = entrada.next();

        if (resposta_pergunta_2.equalsIgnoreCase("B")) {
            System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta
                                                                                              // correta
            respostasCorretas++;
        } else if (resposta_pergunta_2.equalsIgnoreCase("D")) {
            System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem
                                                                                                              // para
                                                                                                              // resposta
                                                                                                              // alternativa
        } else {
            System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para
                                                                                                     // resposta
                                                                                                     // incorreta
        }

        System.out.println("\nPergunta 3: Como você prioriza suas tarefas quando tem várias para fazer?\n"
                + "\nA - Eu fico sobrecarregado e não sei por onde começar.\n"
                + "\nB - Eu priorizo tarefas com base em sua importância e prazos.\n"
                + "\nC - Eu procrastino e deixo tudo para a última hora.\n"
                + "\nD - \"Nois\" tá sempre no corre sabe como é ne, a vida não perdoa os \"cria.\"\n");

        String resposta_pergunta_3 = entrada.next();

        if (resposta_pergunta_3.equalsIgnoreCase("B")) {
            System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta
                                                                                              // correta
            respostasCorretas++;
        } else if (resposta_pergunta_2.equalsIgnoreCase("D")) {
            System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem
                                                                                                              // para
                                                                                                              // resposta
                                                                                                              // alternativa
        } else {
            System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para
                                                                                                     // resposta
                                                                                                     // incorreta
        }

        System.out.println("\nPergunta 4: Como você lida com situações de conflito no local de trabalho?\n"
                + "\nA - Eu evito conflitos a todo o custo e não me envolvo.\n"
                + "\nB - Eu tento resolver conflitos de maneira construtiva e comunicativa.\n"
                + "\nC - Eu geralmente sou a causa dos conflitos.\n"
                + "\nD - Tem que botar ordem nesses folgado ta ligado?\n");

        String resposta_pergunta_4 = entrada.next();

        if (resposta_pergunta_4.equalsIgnoreCase("B")) {
            System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta
                                                                                              // correta
            respostasCorretas++;
        } else if (resposta_pergunta_4.equalsIgnoreCase("D")) {
            System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem
                                                                                                              // para
                                                                                                              // resposta
                                                                                                              // alternativa
        } else {
            System.out.println("\nEntrevistadora:  Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para
                                                                                                      // resposta
                                                                                                      // incorreta
        }

        System.out.println("\nPergunta 5: Qual é a sua abordagem ao aprender novas habilidades ou tecnologia?\n"
                + "\nA - Eu não gosto de aprender coisas novas.\n"
                + "\nB - Estou disposto a aprender e me manter atualizado.\n"
                + "\nC - Eu já sei tudo o que é importante.\n"
                + "\nD - Eu falo com o Dérick.\n");

        String resposta_pergunta_5 = entrada.next();

        if (resposta_pergunta_5.equalsIgnoreCase("B")) {
            System.out.println("\n-Entrevistadora: Hmm. Tudo bem. Esta foi a última pergunta."); // Mensagem para
                                                                                                 // resposta correta
            respostasCorretas++;
        } else if (resposta_pergunta_5.equalsIgnoreCase("D")) {
            System.out.println("\nEntrevistadora: Quem é  \"Derick\"? "); // Mensagem para resposta alternativa
            System.out.println(nome_jogador
                    + ": É o meu primo que tá estudando essas coisa ai de computador ele manja muito tá ligado?");
            System.out.println(
                    "Entrevistador: Entendi, gostei desse Dérick. Estamos aceitando indicações caso sinta que o Derick se encaixe no perfil da empresa.");
            System.out.println("Pó deixa chefia.");
        } else {
            System.out.println("\nEntrevistador: Tem certeza? Ok. Esta foi a última pergunta."); // Mensagem para
                                                                                                 // resposta incorreta
        }

        int totalPerguntas = 5;
        if (respostasCorretas == totalPerguntas) {
            System.out.println("\n" + nome_jogador
                    + " gostei bastante da sua abordagem as perguntas. Acredito que você se encaixará bem na cultura de nossa \nempresa. Quer começar semana que vem? "
                    + "A entrevistadora se levanta com um sorriso acolhedor e estende a mão para  " + nome_jogador
                    + ".\n"
                    + nome_jogador
                    + " se levanta, sem sinais de nervosismo e com sua auto-estima revigorada, aperta a mão da entrevistadora e se \nretira da sala."
                    + "\nAtrás de si uma porta se fecha. Só o que resta agora é o Jornada em frente.");
            capitulo_2();
        } else {
            System.out.println(
                    "\nEntrevistadora: Obrigado por comparecer, lhe daremos uma devolutiva após a finalização do processo seletivo. Fique no aguardo!\n");
            System.out.println("Apesar desta ser a sua primeira entrevista, " + nome_jogador
                    + " sente que eles não irão de fato retornar contato."
                    + "\nIsto não significa, no entando, que acabaram as esperanças. Você pode sempre tentar mais uma vez, e haverá sempre um novo amanhã."
                    + "\n\"...Se você conhece o inimigo e conhece a si mesmo, não precisa temer o resultado de cem batalhas."
                    + "\nSe você se conhece mas não conhece o inimigo, para cada vitória ganha sofrerá também uma derrota.\n"
                    + "Se você não conhece nem o inimigo nem a si mesmo, perderá todas as batalhas...\""
                    + "                                      \n                                                   Sun Tzu - A Arte da Guerra\n\n\n");
        }
    }

    // LISTA DE COISAS QUE FALTARAM PRA FAZER NO CAPITULO 1!!!!!!!!!!!!!!

    // Ler observações
    // Verificar se as respostas estão corretamente para avançar para o próximo
    // capítulo, se
    /*
     * estiverem todas corretas apresentará a mensagem a seguir:
     * “Parabéns, Alex, suas respostas indicam que você é o candidato perfeito! Seja
     * Bem-Vindo
     * a CorpoTech”
     * // Se o usuário errar algumas das perguntas ao final da entrevista
     * apresentará a mensagem
     * a seguir:
     * “Lamentamos Alex, suas respostas não atendem os critérios da empresa”
     * // Será mostrado observações do ponto a ser melhorado (Seria como se fosse
     * uma Dica do
     * jogo)
     * “Observação da pergunta 1: “Sua habilidade de trabalho em equipe é um ponto
     * fraco.”
     * “Observação da pergunta 2: “Você precisa melhor sua capacidade de lidar com
     * feedback”
     * “Observação da pergunta 3: “Sua habilidade de gerenciamento de tempo pode ser
     * aprimorada”
     * “Observação da pergunta 4: “Sua capacidade de gerenciamento de conflitos pode
     * ser uma
     * preocupação”
     * “Observação da pergunta 5: “Ser mais disposto a aprender é essencial no nosso
     * ambiente
     * de trabalho”
     * //Apresentar as observações das respostas errada apenas, se ele errar as 5,
     * apresentar as
     * cinco observações, se errar 2. apresentar duas observações.
     * //Após as observações de cada pergunta, perguntar ao jogador se ele:
     * “Deseja tentar Novamente? Digite “Sim” para tentar novamente, se digitar
     * “Não”, “Fim de
     * jogo”
     * //Se ele digitar “Sim”, perguntar se ele deseja uma Dica/ Observação geral
     * para fazer a
     * entrevista novamente, tipo assim:
     * “Sim” > “Deseja uma Dica para Tentar novamente a entrevista?”
     * //Se ele digitar “Sim” para a dica apresentar a seguinte mensagem da dica:
     * “Lembre-se de que a entrevista é uma oportunidade para mostrar suas
     * habilidades e qualificações”
     * “O mercado de trabalho valoriza candidatos que podem se adaptar e aprender
     * com suas
     * experiências”
     * // Após a Mensagem/Dica acima ir para as 5 perguntas da entrevista novamente.
     */

    static void capitulo_2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(
                "\n\n     ..:: CAPITULO 2 ::..         \n" + "\n     OS ANSEIOS DOS RECURSOS HUMANOS         \n\n\n");
        System.out.println(nome_jogador + " se viu novamente nos corredores da CorpoTech.\n"
                + "Andando em direção a um corredor que parecia não ter fim, estranhou a falta de pessoas naquele dia."
                + "\n\"Será que é um feriado e eu não tô sabendo?\"\n"
                + "Estava mais frio que o comum. " + nome_jogador
                + " nunca teve um ar-condicionado em sua vida, seria essa a origem dessa friaca?\n"
                + "A sensação de estar perdido aumenta a cada porta que ele(a) passa. À distância, é possível avistar uma porta \nfamiliar...\n"
                + "Ao chegar mais perto " + nome_jogador + " vê que trata-se da infâme sala 18.\n"
                + "Você: Mas... Eu passei na entrevista.. Não é?... E-eu tô ansioso de novo?");
        avancarDialogo();
        System.out.println(
                "\nUma ventania forte passa por trás dele(a) e abre a porta. No local onde uma vez estava a entrevistadora agora \nestá uma figura escura e misteriosa\n"
                        + "A figura dá uma investida em direção de " + nome_jogador + " e então..."
                        + "**Plim plim plim!!**\n"
                        + "Era o som de seu despertador.");
        avancarDialogo();
        System.out.println(nome_jogador
                + " acorda em seu apartamento. A luz do sol invade o quarto, destacando a estante de livros e o\r\n" + //
                "diploma recém-conquistado na parede. Ele recebe uma mensagem no telefone informando sobre\r\n" + //
                "o primeiro dia de treinamento na \"CorpoTech\".");
        // Para começar bem o seu dia, nome_jogador decide:
        // Opção 1: Preparar um café reforçado, querendo enfrentar o dia com energia.
        // Opção 2: Pular o café para economizar tempo e chegar cedo ao trabalho.
        // Ao escolher a opção 1, apresentar a mensagem “Café na mão, Alex enfrenta o
        // dia com energia renovada.”
        // Ao escolher a opção 2, apresentar a mensagem "Sem café, Alex corre para a
        // CorpoTech,priorizando a pontualidade e mostrando sua dedicação ao novo
        // emprego."
        System.out.println(nome_jogador
                + " chega a \"CorpoTech\" bem antes do horário, cumprimenta a secretária da empresa, que lhe\r\n" + //
                "informa a sala de treinamento. " + nome_jogador + " se dirige a sala e aguarda.");
        System.out.println(
                "No horário, o instrutor chega a sala de treinamento, inicia a apresentação, destacando a missão,\r\n" + //
                        "visão e valores da CorpoTech.\r\n" +
                        "\nBom dia, " + nome_jogador
                        + ". Gostaria de saber um pouco mais sobre a missão, visão e valores da empresa?");

        System.out.println("\n1 - Sim. | 2 - Não...");
        int escolha_mvv = entrada.nextInt();

        avancarDialogo();

        if (escolha_mvv == 1) {
            System.out.println(
                    "\nInstrutor: Aqui na CorpoTech nossa missão é potencializar talentos, impulsionando o crescimento profissional \ne pessoal dos nossos colaboradores.");

            avancarDialogo();

            System.out.println(
                    "\n\nInstrutor: Em nossa visão, buscamos ser referência em inovação e excelência, criando um ambiente onde \no sucesso individual contribui para o sucesso coletivo.");

            avancarDialogo();

            System.out.println("\n\nInstrutor: Além disso, somos movidos por alguns valores, dentre os quais temos: "
                    + "\n\nInovação: Buscamos constantemente soluções criativas para desafios corporativos."
                    + "\nCrescimento: Investimos no desenvolvimento contínuo de nossos colaboradores."
                    + "\nColaboração: Valorizamos a diversidade e promovemos um ambiente de trabalho colaborativo."
                    + "\nÉtica: Atuamos com integridade, transparência e responsabilidade."
                    + "\nRespeito: Cultivamos um ambiente onde o respeito e a empatia são fundamentais."
                    + "\nSustentabilidade: Comprometemo-nos com práticas empresariais sustentáveis para um futuro melhor.");
        } else {
            System.out.println(
                    "\nIntrutor: Como quiser.");
        }

        avancarDialogo();

        System.out.println("Os recém-contratados começam a entender a importância de adquirir estratégias"
                + " valiosas para "
                + "enfrentar desafios \ncorporativos e desenvolver habilidades de relações humanas.");

        avancarDialogo();

        System.out.println("A partir disso, " + nome_jogador + ":");

        System.out.println(
                "\nOpção 1: Participa ativamente, focando em estratégias que fortaleçam suas habilidades interpessoais."
                        + "\n\nOpção 2: Adota uma postura mais reservada, observador e atento a tudo o que o instrutor tem a passar, \npara assim decidir fazer uma melhor uma abordagem.");

        avancarDialogo();

        int escolha_comportamento = entrada.nextInt();

        if (escolha_comportamento == 1) {
            System.out.println("\nAo participar ativamente " + nome_jogador
                    + " destaca suas habilidades sociais, o que pode impactar suas relações na empresa.");
        } else if (escolha_comportamento == 2) {
            System.out.println(
                    "\nA escolha mais reservada sugere uma abordagem cautelosa, possivelmente refletindo um mecanismo de defesa.");
        } else {
            System.out.println("\nOpção inválida.");
        }

        avancarDialogo();

        System.out.println("--- Escritório de " + nome_jogador + " - Tarde ---");

        avancarDialogo();

        System.out.println("Após o treinamento, " + nome_jogador + " recebe sua primeira avaliação de desempenho.");

        if (escolha_comportamento == 1) {
            System.out.println("\nInstrutor: Apesar de se demonstrar alguém colaborativo e de fácil comunicação, "
                    + "notei certa exaltação \nem determinados momentos, demonstrando uma postura não tão profissional.");
        } else {
            System.out
                    .println("\nInstrutor: Aqui na CorpoTech acreditamos que a composição de laços entre os funcionários "
                            + "é de suma importância na construção de um bom trabalho em equipe, e hoje notamos que você participou minimamente das dinâmicas da empresa.");
        }
        System.out.println(
                "\nOpção 1: " + nome_jogador
                        + " aceita as críticas de maneira diplomática, tentando se adaptar às expectativas da empresa."
                        + "\nOpção 2: " + nome_jogador
                        + " expressa desacordo com algumas avaliações, defendendo sua abordagem única e suas \nqualidades individuais.");

        int escolha_comportamento2 = entrada.nextInt();

        if (escolha_comportamento2 == 1) {
            System.out.println(
                    "A busca por vantagens colaborativas destaca a abertura de " + nome_jogador + " para feedbacks,"
                            + " influenciando nas relações de trabalho.");
        } else {
            System.out.println(
                    "A escolha de desacordo que reforça mais a autoconfiança pode proteger emocionalmente Alex,"
                            + " \nmas também afetar sua adaptabilidade.");
        }

        avancarDialogo();

        System.out.println("--- Apartamento de " + nome_jogador + " - Noite.");

        avancarDialogo();

        System.out.println(nome_jogador + " retorna para casa, refletindo sobre o dia. Ele recebe mensagens"
                + " automáticas da CorpoTech, " + "\nlembrando-o de prazos e regras. " + nome_jogador + ":");

        System.out
                .println("\n\nOpção 1: Decide seguir as orientações à risca, evitando qualquer confronto com a empresa."
                        + "\n\nOpção 2: Questiona internamente se vale a pena sacrificar sua "
                        + "individualidade em prol do sucesso corporativo.");

        int escolha_comportamento3 = entrada.nextInt();

        if (escolha_comportamento3 == 1) {
            System.out.println("\n" + nome_jogador + ": Bom, é hora de dormir.");
        } else if (escolha_comportamento3 == 2) {
            System.out.println("\n" + nome_jogador + ": Tsc. Que saco.");
        }

        /*
         * // Fim do Capítulo 2: As escolhas estratégicas do jogador afetam não apenas a
         * narrativa, mas
         * também moldam o desenvolvimento de vantagens relacionadas a relações humanas,
         * mecanismos
         * de defesa e posicionamento profissional. O sistema de vidas adiciona um
         * elemento estratégico,
         * incentivando escolhas que equilibrem a adaptação à cultura corporativa e a
         * preservação da
         * individualidade de Alex. O desfecho final é moldado pelas escolhas do
         * jogador, oferecendo
         * diferentes resultados com base nas estratégias adotadas.
         * Essas sugestões são apenas direcionamentos gerais, e a beleza do jogo está na
         * variedade de
         * escolhas que os jogadores podem fazer para moldar a história de acordo com
         * suas preferências.
         */

    }

    static void capitulo_3() {
        System.out.println("\n\n     ..:: CAPITULO 3 ::..         \n" + "\n     O DESPERTAR         \n\n\n");
        Scanner entrada = new Scanner(System.in);
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
