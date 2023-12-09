package ProjetoPi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProjetoPi {
    static String nome_jogador = null;

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
                    "\n\n..:: A JORNADA DO NOVATO ::.. \n\n1 - Instruções \n2 - Jogar \n3 - Capítulos \n4 - Créditos \n5 - Sair");
            System.out.println("\n");
            escolha_menu = entrada.nextInt();
            if (escolha_menu == 1) {
                instrução();
            
            } else if (escolha_menu == 2) {
                jogo();
            } else if (escolha_menu == 3) {
                capitulos();
            } else if (escolha_menu == 4) {
                creditos();
            } else if (escolha_menu == 5) {
                System.exit(0);
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4 && escolha_menu != 5);
    }

    static void capitulos() {
        Scanner entrada = new Scanner(System.in);
        int escolha_capitulo;
        System.out.println("\n..:: A JORNADA DO NOVATO - Capítulos da História ::..");
        do {
            System.out.println(
                    "\n\n1 - A 1º entrevista de emprego\n2 - Os Anseios dos Recursos humanos\n3 - O Despertar!\n4 - Liderança e Mudança\n5 - A Revolução Corporativa");
            escolha_capitulo = entrada.nextInt();
            if (escolha_capitulo == 1) {
                capitulo_1();
            } else if (escolha_capitulo == 2) {
                capitulo_2();
            } else if (escolha_capitulo == 3) {
                capitulo_3();
            } else if (escolha_capitulo == 4) {
                capitulo_4();
            } else if (escolha_capitulo == 5) {
                capitulo_5();
            } else {
                System.out.println("\nOpção inválida, digite novamente: ");
            }
        } while (escolha_capitulo != 1 && escolha_capitulo != 2 && escolha_capitulo != 3 && escolha_capitulo != 4 && escolha_capitulo != 5);
    }
    
    static void instrução() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("\n\n     ..:: A JORNADA DO NOVATO - INSTRUÇÕES ::..         \n");
    	System.err.println("Etapa ainda em Produção.");
    	System.out.println("Mas você ainda pode voltar ao menu e optar por outras opções.");
    	System.out.println("\nPara voltar ao menu basta digitar \"Menu\" ou \"Voltar\", caso não, basta digitar \"Sair\" ou qualquer coisa.");
    	String resp = input.next().toUpperCase();
    	
    	switch(resp) {
    	case "MENU":
    	case "VOLTAR":
    		menu();
    	default:
    		System.exit(0);
    	}
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
        String a, b, c, d;
        System.out
                .println("\n\n     ..:: CAPITULO 1 ::..         \n" + "\n     A ENTREVISTA DE EMPREGO         \n\n\n");

        pedirNome();
        
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
                        + "Pergunta 1: Como você descreveria suas habilidades de trabalho em equipe?\n\n");
        
        a = " Tenho dificuldade em trabalhar com outras pessoas.\n\n";
        b = " Eu trabalho bem em equipe e colaboro efetivamente.\n\n";
        c = " Prefiro trabalhar sozinho e evitar equipes.\n\n";
        d = " Nois trabalha sem câoh tá ligado meu? nois é responsa mano.\n\n";
        
        ArrayList<String> listaResp = new ArrayList<String>();
        listaResp.add(0,a);
        listaResp.add(1,b);
        listaResp.add(2,c);
        listaResp.add(3,d);
        Collections.shuffle(listaResp);
        String embaralhaResp = "A)"+listaResp.get(0)+"B)"+listaResp.get(1)+"C)"+listaResp.get(2)+"D)"+listaResp.get(3);
        
        System.out.println(embaralhaResp);
        
        String resposta_pergunta_1 = entrada.next();
        String correct_resp = b;
        String resp_alt = d;
        int respostasCorretas = 0;

        switch(resposta_pergunta_1){
        	case "a":
        	case "A":
        		if(listaResp.get(0) == correct_resp) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta                                                                              
        		respostasCorretas++;
        		} else if (listaResp.get(0) == resp_alt) {
        			System.out.println(
                            "\nEntrevistadora: É... tá certo, entendi \"mano\". Vamos para a próxima pergunta então..."); //Mensagem para resposta alternativa
        		} else {
        			System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        		}	
        	break;
        	
        	case "b":
        	case "B":
        		if(listaResp.get(1) == correct_resp) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta                                                                              
        		respostasCorretas++;
        		} else if (listaResp.get(1) == resp_alt) {
        			System.out.println(
                            "\nEntrevistadora: É... tá certo, entendi \"mano\". Vamos para a próxima pergunta então..."); //Mensagem para resposta alternativa
        		} else {
        			System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        		}	
        	break;
        	
        	case "c":
        	case "C":
        		if(listaResp.get(2) == correct_resp) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta                                                                              
        		respostasCorretas++;
        		} else if (listaResp.get(2) == resp_alt) {
        			System.out.println(
                            "\nEntrevistadora: É... tá certo, entendi \"mano\". Vamos para a próxima pergunta então..."); //Mensagem para resposta alternativa
        		} else {
        			System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        		}	
        	break;
        	
        	case "d":
        	case "D":
        		if(listaResp.get(3) == correct_resp) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta                                                                              
        		respostasCorretas++;
        		} else if (listaResp.get(3) == resp_alt) {
        			System.out.println(
                            "\nEntrevistadora: É... tá certo, entendi \"mano\". Vamos para a próxima pergunta então..."); //Mensagem para resposta alternativa
        		} else {
        			System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        		}	
        	break;
        	
        	default:
            System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
                                                                                                     
        }

        System.out.println("\nPergunta 2: Como você prioriza suas tarefas quando tem várias para fazer?\n\n");
        
        a = " Eu fico sobrecarregado e não sei por onde começar.\n\n";
        b = " Eu priorizo tarefas com base em sua importância e prazos.\n\n";
        c = " Eu procrastino e deixo tudo para a última hora.\n\n";
        d = " \"Nois\" tá sempre no corre sabe como é ne, a vida não perdoa os \"cria.\"\n\n";
        
        ArrayList<String> listaResp2 = new ArrayList<String>();
        listaResp2.add(0,a);
        listaResp2.add(1,b);
        listaResp2.add(2,c);
        listaResp2.add(3,d);
        Collections.shuffle(listaResp2);
        String embaralhaResp2 = "A)"+listaResp2.get(0)+"B)"+listaResp2.get(1)+"C)"+listaResp2.get(2)+"D)"+listaResp2.get(3);
        
        System.out.println(embaralhaResp2);
        
        String resposta_pergunta_2 = entrada.next();
        String correct_resp2 = b;
        String resp_alt2 = d;

        switch(resposta_pergunta_2){
        case "a":
        case "A":
        	if(listaResp2.get(0) == correct_resp2) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta
        		respostasCorretas++;
        	} else if (listaResp2.get(0) == resp_alt2) {
        		System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem para resposta alternativa
        	} else {
        		System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        	}
            break;
            
        case "b":
        case "B":
        	if(listaResp2.get(1) == correct_resp2) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta
        		respostasCorretas++;
        	} else if (listaResp2.get(1) == resp_alt2) {
        		System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem para resposta alternativa
        	} else {
        		System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        	}
            break;
            
        case "c":
        case "C":
        	if(listaResp2.get(2) == correct_resp2) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta
        		respostasCorretas++;                                                              
        	} else if (listaResp2.get(2) == resp_alt2) {
        		System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem para resposta alternativa
        	} else {
        		System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        	}
            break;
            
        case "d":
        case "D":
        	if(listaResp2.get(3) == correct_resp2) {
        		System.out.println("\nEntrevistadora: Hmm. Tudo bem. Vamos à próxima pergunta."); // Mensagem para resposta correta
        		respostasCorretas++;                                                              
        	} else if (listaResp2.get(3) == resp_alt2) {
        		System.out.println("\nEntrevistadora: Beleza \"menor\". Vamos para a próxima pergunta então..."); // Mensagem para resposta alternativa
        	} else {
        		System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        	}
            break;
            
        default:
            System.out.println("\nEntrevistadora: Tem certeza? Ok. Vamos para a próxima pergunta."); // Mensagem para resposta incorreta
        }

        System.out.println("\nPergunta 3: Qual é a sua abordagem ao aprender novas habilidades ou tecnologia?\n\n");
        
        a = " Eu não gosto de aprender coisas novas.\n\n";
        b = " Estou disposto a aprender e me manter atualizado.\n\n";
        c = " Eu já sei tudo o que é importante.\n\n";
        d = " Eu falo com o Dérick.\n\n";
        
        ArrayList<String> listaResp3 = new ArrayList<String>();
        listaResp3.add(0,a);
        listaResp3.add(1,b);
        listaResp3.add(2,c);
        listaResp3.add(3,d);
        Collections.shuffle(listaResp3);
        String embaralhaResp3 = "A)"+listaResp3.get(0)+"B)"+listaResp3.get(1)+"C)"+listaResp3.get(2)+"D)"+listaResp3.get(3);
        
        System.out.println(embaralhaResp3);
        
        String resposta_pergunta_3 = entrada.next();
        String correct_resp3 = b;
        String resp_alt3 = d;

        switch(resposta_pergunta_3){
        	case "a":
        	case "A":
        		if(listaResp3.get(0) == correct_resp3) {
        			System.out.println("\n-Entrevistadora: Hmm. Tudo bem. Esta foi a última pergunta."); // Mensagem para resposta correta
        			respostasCorretas++;
        		} else if (listaResp3.get(0) == resp_alt3) {
        			System.out.println("\nEntrevistadora: Quem é  \"Derick\"? "); // Mensagem para resposta alternativa
            		System.out.println(nome_jogador
                        + ": É o meu primo que tá estudando essas coisa ai de computador ele manja muito tá ligado?");
            		System.out.println(
                        "Entrevistador: Entendi, gostei desse Dérick. Estamos aceitando indicações caso sinta que o Derick se encaixe no perfil da empresa.");
            		System.out.println("Pó deixa chefia.");
        		} else {
        			System.out.println("\nEntrevistador: Tem certeza? Ok. Esta foi a última pergunta."); // Mensagem para resposta incorreta
        		}
                break;
                
        	case "b":
        	case "B":
        		if(listaResp3.get(1) == correct_resp3) {
        			System.out.println("\n-Entrevistadora: Hmm. Tudo bem. Esta foi a última pergunta."); // Mensagem para resposta correta
        			respostasCorretas++;
        		} else if (listaResp3.get(1) == resp_alt3) {
        			System.out.println("\nEntrevistadora: Quem é  \"Derick\"? "); // Mensagem para resposta alternativa
            		System.out.println(nome_jogador
                        + ": É o meu primo que tá estudando essas coisa ai de computador ele manja muito tá ligado?");
            		System.out.println(
                        "Entrevistador: Entendi, gostei desse Dérick. Estamos aceitando indicações caso sinta que o Derick se encaixe no perfil da empresa.");
            		System.out.println("Pó deixa chefia.");
        		} else {
        			System.out.println("\nEntrevistador: Tem certeza? Ok. Esta foi a última pergunta."); // Mensagem para resposta incorreta
        		}
                break;
        	case "c":
        	case "C":
        		if(listaResp3.get(2) == correct_resp3) {
        			System.out.println("\n-Entrevistadora: Hmm. Tudo bem. Esta foi a última pergunta."); // Mensagem para resposta correta
        			respostasCorretas++;
        		} else if (listaResp3.get(2) == resp_alt3) {
        			System.out.println("\nEntrevistadora: Quem é  \"Derick\"? "); // Mensagem para resposta alternativa
            		System.out.println(nome_jogador
                        + ": É o meu primo que tá estudando essas coisa ai de computador ele manja muito tá ligado?");
            		System.out.println(
                        "Entrevistador: Entendi, gostei desse Dérick. Estamos aceitando indicações caso sinta que o Derick se encaixe no perfil da empresa.");
            		System.out.println("Pó deixa chefia.");
        		} else {
        			System.out.println("\nEntrevistador: Tem certeza? Ok. Esta foi a última pergunta."); // Mensagem para resposta incorreta
        		}
                break;
        	case "d":
        	case "D":
        		if(listaResp3.get(3) == correct_resp3) {
        			System.out.println("\n-Entrevistadora: Hmm. Tudo bem. Esta foi a última pergunta."); // Mensagem para resposta correta
        			respostasCorretas++;
        		} else if (listaResp3.get(3) == resp_alt3) {
        			System.out.println("\nEntrevistadora: Quem é  \"Derick\"? "); // Mensagem para resposta alternativa
            		System.out.println(nome_jogador
                        + ": É o meu primo que tá estudando essas coisa ai de computador ele manja muito tá ligado?");
            		System.out.println(
                        "Entrevistador: Entendi, gostei desse Dérick. Estamos aceitando indicações caso sinta que o Derick se encaixe no perfil da empresa.");
            		System.out.println("Pó deixa chefia.");
        		} else {
        			System.out.println("\nEntrevistador: Tem certeza? Ok. Esta foi a última pergunta."); // Mensagem para resposta incorreta
        		}
                break;
                
        	default:
            	System.out.println("\nEntrevistador: Tem certeza? Ok. Esta foi a última pergunta."); // Mensagem para resposta incorreta
        }

        int totalPerguntas = 3;
        if (respostasCorretas == totalPerguntas) {
            System.out.println("\n" + nome_jogador
                    + " gostei bastante da sua abordagem as perguntas. Acredito que você se encaixará bem na cultura de nossa \nempresa. Quer começar semana que vem? "
                    + "A entrevistadora se levanta com um sorriso acolhedor e estende a mão para  " + nome_jogador
                    + ".\n"
                    + nome_jogador
                    + " se levanta, sem sinais de nervosismo e com sua auto-estima revigorada, aperta a mão da entrevistadora e se \nretira da sala."
                    + "\nAtrás de si uma porta se fecha. Só o que resta agora é o Jornada em frente."
                    + "\n\n“Parabéns, "+nome_jogador+", suas respostas indicam que você é o candidato perfeito! Seja Bem-Vindo CorpoTech”");
            avancarDialogo();
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

        pedirNome();
    	
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

        int escolha_comportamento = entrada.nextInt();

        if (escolha_comportamento == 1) {
            System.out.println("\nAo participar ativamente " + nome_jogador
                    + " destaca suas habilidades sociais, o que pode impactar suas relações na empresa.");
        } else if (escolha_comportamento == 2) {
            System.out.println(
                    "\nA escolha mais reservada sugere uma abordagem cautelosa, possivelmente refletindo um mecanismo de defesa.");
        } else {
            System.out.println("\nOptando por uma escolha diferente das que estavam à mostra, indica não saber ao certo como se opõe \na essas escolhas, se sentindo ali no meio entre uma coisa e outra.");
        }

        avancarDialogo();

        System.out.println("--- Escritório de " + nome_jogador + " - Tarde ---");

        avancarDialogo();

        System.out.println("Após o treinamento, " + nome_jogador + " recebe sua primeira avaliação de desempenho.");

        if (escolha_comportamento == 1) {
            System.out.println("\nInstrutor: Apesar de se demonstrar alguém colaborativo e de fácil comunicação, "
                    + "notei certa exaltação em determinados \nmomentos, demonstrando uma postura não tão profissional.");
        } else {
            System.out
                    .println(
                            "\nInstrutor: Aqui na CorpoTech acreditamos que a composição de laços entre os funcionários "
                                    + "é de suma importância na construção \nde um bom trabalho em equipe, e hoje notamos que você participou minimamente das dinâmicas da empresa.");
        }
        System.out.println(
                "\nOpção 1: " + nome_jogador
                        + " aceita as críticas de maneira diplomática, tentando se adaptar às expectativas da empresa."
                        + "\nOpção 2: " + nome_jogador
                        + " expressa desacordo com algumas avaliações, defendendo sua abordagem única e suas qualidades individuais.");

        int escolha_comportamento2 = entrada.nextInt();

        if (escolha_comportamento2 == 1) {
            System.out.println(
                    "A busca por vantagens colaborativas destaca a abertura de " + nome_jogador + " para feedbacks,"
                            + " influenciando nas relações de trabalho.");
        } else {
            System.out.printf(
                    "A escolha de desacordo que reforça mais a autoconfiança pode proteger emocionalmente %s,"
                            + " \nmas também afetar sua adaptabilidade.", nome_jogador);
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
            avancarDialogo();
            capitulo_3();
        } else {
            System.out.println("\n" + nome_jogador + ": Tsc. Que saco.");
            avancarDialogo();
            capitulo_3();
        }
    }

    static void capitulo_3() {
        System.out.println("\n\n     ..:: CAPITULO 3 ::..         \n" + "\n     O DESPERTAR         \n\n\n");
        Scanner entrada = new Scanner(System.in);

        pedirNome();
    	
        System.out.println(nome_jogador + " se vê trabalhando na CorpoTech a alguns meses. Sempre muito diligente, "+nome_jogador+
        " é um(a) trabalhador(a) exemplar.\n" 
        + "todo o seu esforço não é em vão, claro. Seus superiores rapidamente percebem o seu alto nível de dedicação, e logo decidem lhe recompensar...\n"
        + "\n...com mais tarefas.\n"
        + nome_jogador + " está designado a um projeto com prazos irrealistas e uma carga de trabalho esmagadora. Ele se sente pressionado para cumprir todas as demandas.\n"
        + "\"Isso não é certo... mas bem, fazer o quê.\" - pensa " + nome_jogador
        + "\nAlguns dias se passam, e as cobranças excessivas parecem ter se tornado o novo normal.\n"
        + nome_jogador + " tenta discutir a carga de trabalho excessiva com seu superior, mas é recebido com desdém.\n"
        + "Superior: Você é novo aqui, "+nome_jogador+". Precisa mostrar seu comprometimento com a empresa. \n"
        + nome_jogador + ": Entendo, mas essas expectativas são realmente alcançáveis?\n"
        + "\nSuperior: Todos conseguem, é só questão de esforço. Não quero desculpas, quero resultados.\n");
        avancarDialogo();
        System.out.println("O superior então vira as costas e sai andando tranquilamente em direção ao seu computador, onde aparenta estar vigiando minuciosamente o progresso de seu projeto.\n"
        + nome_jogador + " percebe que não é o único enfrentando essa sobrecarga. Ele se reúne com alguns colegas para discutir estratégias.\n"
        + "Colega: Estamos todos enfrentando o mesmo problema. Essa pressão não é saudável.\n"
        + nome_jogador + ": Concordo. Precisamos encontrar uma maneira de lidar com isso sem comprometer nossa saúde mental.\n"
        + nome_jogador + " e seu colega de trabalho começam a pesquisar sobre como lidar com sobrecarga de trabalho e práticas de gestão saudáveis.\n"
        + "\n*---* Você está prestes a participar de um jogo de múltipla escolha, onde apenas uma das opções é correta. *---*\n");


        System.out.println("Pergunta 1 - Quais são as abordagens comuns para a divisão de tarefas?\r\n" +
                "\r\n" +
                "A) Divisão por especialização\r\n" +
                "B) Divisão por interesse pessoal\r\n" +
                "C) Divisão por ordem alfabética\r\n" +
                "D) Divisão por sorteio");

        String resposta_pergunta_1_cap_3 = entrada.next();
        int respostasCorretas_cap_3 = 0;

        if (resposta_pergunta_1_cap_3.equalsIgnoreCase("A")) {
            System.out.println("\nColega: Concordo plenamente!");
            respostasCorretas_cap_3++;

        } else  {
            System.out.println("\nColega: Isso não me parece ser sensato......");
        }

        System.out.println(
                "Pergunta 2 - Quais estratégias podem ser eficazes ao negociar prazos e demandas excessivas com a administração?\r\n"
                        + //
                        "\r\n" + //
                        "A) Abordagem assertiva\r\n" +
                        "B) Adoção da postura de confronto\r\n" +
                        "C) Uso de exemplos pessoais\r\n" +
                        "D) Apresentação de ultimatos");

        String resposta_pergunta_2_cap_3 = entrada.next();
        if (resposta_pergunta_2_cap_3.equalsIgnoreCase("A")) {
            System.out.println("\nColega: Concordo plenamente!");
            respostasCorretas_cap_3++;

        } else  {
            System.out.println("\nColega: Isso não me parece ser sensato......");
        }

        System.out.println("Pergunta 3 - Quais métodos são utilizados para gerenciar o tempo e priorizar tarefas?\r\n" + //
                "\r\n" + //
                "A) Matriz de Eisenhower (Tabela de Prioridades)\r\n" + //
                "B) Método da aleatoriedade\r\n" + //
                "C) Abordagem do último a chegar, primeiro a fazer\r\n" + //
                "D) Técnica do pior para o melhor");

        String resposta_pergunta_3_cap_3 = entrada.next();
        if (resposta_pergunta_3_cap_3.equalsIgnoreCase("A")) {
            System.out.println("\nColega: Concordo plenamente!");
            respostasCorretas_cap_3++;

        } else {
            System.out.println("\nColega: Isso não me parece ser sensato......");
        }
        int totalPerguntas_cap3 = 3;
        if (respostasCorretas_cap_3 == totalPerguntas_cap3) {
            System.out.println("\n"
                    + nome_jogador
                    + " aborda seu superior e lhe apresenta um relatório elaborado com métodos que visam melhorar as condições de trabalho \nde seu setor."
                    + "\nSuperior: Hmm, parece uma boa sugestão. Vou considerar e discutir com a equipe. \n\n"

                    +nome_jogador+ " e seus colegas veem uma redução na sobrecarga de trabalho, mostrando que a negociação e a busca por soluções podem \ntrazer mudanças positivas.");
            capitulo_4();
        } else {
            System.out.println(
                    "\nSua iniciativa de buscar soluções é admirável, no entanto lhe faltou bom senso; infelizmente. Por favor, tente \nse aprofundar mais nos conceitos que você abordou.\n");
            System.out.println("Aquele que se empenha a resolver as dificuldades resolve-as antes que elas surjam. \nAquele que se ultrapassa a vencer os inimigos triunfa antes que as suas ameaças se concretizem."
                    + "                                      \n                                                   Sun Tzu - A Arte da Guerra\n\n\n");
        }
    }


    

    static void capitulo_4() {
    	System.out.println("\n\n     ..:: CAPITULO 4 ::..         \n" + "\n     LIDERANÇA E MUDANÇA         \n\n\n");
    	
    	Scanner scanner = new Scanner(System.in);
    	pedirNome();
        
        System.out.println(nome_jogador + ", agora em um papel de liderança, enfrenta o desafio de transformar a cultura da CorpoTech para melhorar "
        		+ "\no bem-estar dos funcionários enquanto mantém a eficiência da empresa. Ele reconhece a necessidade de aplicar os princípios "
        		+ "\naprendidos em administração para liderar essa mudança.");
        avancarDialogo();

        // Escritório de (Nome do usuário) - Tarde
        System.out.println("----------------------- Escritório de " + nome_jogador + " - Tarde -----------------");
        System.out.println(nome_jogador + " se encontrava em seu novo escritório, encarando a vastidão do desafio que tinha pela frente. Sua promoção "
        		+ "\na um cargo de liderança na CorpoTech não era apenas um avanço na carreira, mas também uma oportunidade de moldar a cultura da empresa.");
        avancarDialogo();
        
        // Refletindo sobre a tarefa
        System.out.println(nome_jogador + " reflete sobre a enormidade da tarefa à sua frente e compartilha seus pensamentos com um colega.");
        System.out.println(nome_jogador + ": \"Estou prestes a liderar uma transformação aqui. Preciso aplicar o que aprendi sobre administração "
        		+ "\npara fazer isso direito.\"");
        avancarDialogo();
        
        // Pergunta 1
        System.out.println("\nO que " + nome_jogador + " deve priorizar ao liderar uma transformação organizacional?\n" +
                "Opção A: Apenas as necessidades imediatas da empresa.\n" +
                "Opção B: Um equilíbrio entre as necessidades da empresa e o bem-estar dos funcionários.\n" +
                "Opção C: A satisfação pessoal dos líderes.");
        char resposta1 = ConferenciaDeResposta(scanner);
        if (resposta1 == 'A' || resposta1 == 'C') {
            System.out.println("\n\"Priorizar apenas as necessidades imediatas da empresa pode negligenciar o impacto nas pessoas, e a satisfação pessoal "
            		+ "\ndos líderes pode não refletir nas necessidades organizacionais ou dos funcionários.\"");
        } else if (resposta1 == 'B') {
        }
        
        // Pergunta 2
       System.out.println(nome_jogador + " decide analisar as tarefas da equipe em busca de eficiência. Um colega pergunta sobre a abordagem.");
       System.out.println("Colega: \"Você está seguindo a Administração Científica. Isso não vai prejudicar a moral dos trabalhadores?\"");
       System.out.println(nome_jogador + ": Preciso equilibrar eficiência com o bem-estar. Como podemos fazer isso?\"");
       avancarDialogo();

       System.out.println("\nQual abordagem de liderança compatível com a Administração Científica poderia minimizar impactos negativos na moral dos trabalhadores?\n" +
        "Opção A: Desconsiderar as preocupações dos trabalhadores para alcançar a eficiência máxima.\n" +
        "Opção B: Analisar as tarefas de maneira cuidadosa e incluir os trabalhadores no processo de decisão.\n" +
        "Opção C: Ignorar completamente os princípios da Administração Científica.");
       char resposta2 = ConferenciaDeResposta(scanner);
       if (resposta2 == 'A' || resposta2 == 'C') {
       System.out.println("\n\"Desconsiderar as preocupações dos trabalhadores pode levar à resistência, e ignorar completamente os princípios da Administração "
       		+ "\nCientífica pode resultar em falta de eficiência.\"");
      
       System.out.println("Pressione ENTER para avançar para a próxima pergunta.");
       scanner.nextLine();
       } else if (resposta2 == 'B') {
       
       }
       
        // Pergunta 3
        System.out.println("\nEnquanto reorganiza a estrutura organizacional, " + nome_jogador + " encontra resistência. Um funcionário expressa preocupações.");
        System.out.println("Funcionário: \"Mudança sempre assusta. Estamos perdendo a autonomia. Isso é administração clássica?\"");
        System.out.println(nome_jogador + " :Estamos buscando eficiência, mas não quero sacrificar tudo. Como posso promover a mudança sem perder a autonomia? O que tem a me sugerir? \"");
        avancarDialogo();

        System.out.println("\nQual característica da abordagem clássica pode ajudar " + nome_jogador + " a promover mudanças sem perder a autonomia dos trabalhadores?\n"
                + "Opção A: Ignorar a hierarquia organizacional.\n"
                + "Opção B: Valorização da especialização do trabalho.\n"
                + "Opção C: Desprezar completamente a autonomia.");
        char resposta3 = ConferenciaDeResposta(scanner);
        if (resposta3 == 'A' || resposta3 == 'C') {
            System.out.println("\n\"Ignorar a hierarquia organizacional ou desprezar completamente a autonomia pode resultar em problemas de liderança e descontentamento dos funcionários.\"");
            avancarDialogo();
        } else if (resposta3 == 'B') {
            avancarDialogo();
        }

        
        System.out.println("------------------------ Apartamento de " + nome_jogador + " - Noite. --------------------");
        System.out.println(nome_jogador + " retorna para casa, refletindo sobre o dia. "
        		+ ": \"Foi um dia cansativo, a muito o que se fazer, espero estar no caminho certo, e melhor eu ir descansar, para poder pensar melhor diante dessa semana cheia de trabalho, bora dormir!\"");
        avancarDialogo();

        
        capitulo_5();
    }

    // Função para obter a resposta do usuário
    static char ConferenciaDeResposta(Scanner scanner) {
        System.out.print("\nEscolha a opção correta (A, B ou C): ");
        String input = scanner.nextLine().toUpperCase();
        return input.charAt(0);
        
    }


    

    static void capitulo_5() {
        System.out
                .println("\n\n     ..:: CAPITULO 5 ::..         \n" + "\n     A REVOLUÇÃO CORPORATIVA         \n\n\n");
        Scanner entrada = new Scanner(System.in);
        
        pedirNome();
    	String c = null;
        
        System.out
                .println("Mesmo após ter assumido um cargo de liderança e tentado diversas vezes implementar melhorias "
                        + "na empresa\nCorpoTech, o pessoal da alta gerência vem ignorando o seu trabalho, "
                        + c
                        + " viu que a empresa \nnão estava respeitando a missão, visão e valores que lhe foi apresentado no dia da entrevista. ");

        avancarDialogo();

        System.out.println(nome_jogador
                + ": Não sei mais o que faço para poderem me escutar, e verem que minhas propostas \nsão para o bem da empresa.");

        avancarDialogo();

        System.out.printf("------------------------No Escritório de %s - Tarde ------------------------\n\n\n",
                nome_jogador);

        System.out.printf(
                " O escritório de %s estava agora imerso em murmúrios, conversas sussurradas e a expectativa de mudanças.\n"
                        + " %s estava determinado a liderar uma revolta silenciosa contra as práticas degradantes da CorpoTech.\n"
                        + " Ele reuniu sua equipe para discutir estratégias.\n\n",
                nome_jogador, nome_jogador);

        avancarDialogo();

        System.out.printf(
                "%s: Precisamos agir com inteligência. O que sugerem para iniciar essa revolução silenciosa? ",
                nome_jogador);

        System.out.println(
                "\n\n1 - Divulgar publicamente as práticas da empresa. \n2 - Iniciar conversas individuais com funcionários. ");

        int escolha_opção_1 = entrada.nextInt();

        if (escolha_opção_1 == 1) {
            System.out.println("Tem certeza? Ok...");
        } else if (escolha_opção_1 == 2) {
            System.out.println(nome_jogador + ": opta por uma abordagem individualizada, "
                    + "decidindo iniciar conversas profundas com os funcionários \npara entender melhor suas preocupações.");
        }

        avancarDialogo();

        System.out.println(nome_jogador + ": A força está na colaboração. "
                + "Como podemos abordar as preocupações dos funcionários de maneira mais eficaz?");

        System.out.println("\n\n1 - Ignorar as preocupações e implementar mudanças rápidas."
                + "\n2 - Demonstrar empatia e oferecer soluções específicas.");

        int escolha_opção_2 = entrada.nextInt();

        if (escolha_opção_2 == 1) {
            System.out.println("");
        } else if (escolha_opção_2 == 2) {
            System.out.printf("\nCom base nas conversas individuais, %s planeja implementar mudanças graduais na CorpoTech.", nome_jogador);
        }

        avancarDialogo();

        System.out.println(nome_jogador + ": Precisamos ser estratégicos. Que tipo de mudanças graduais podem impactar positivamente \na cultura da empresa?");
        System.out.println("\n\n1 - Implementar um novo sistema de avaliação de desempenho.\n" 
        + "2 - Introduzir políticas de flexibilidade no trabalho.");

        int escolha_opção_3 = entrada.nextInt();

        if (escolha_opção_3 == 1 || escolha_opção_3 == 2) {
            System.out.printf("\nÀ medida que as mudanças são implementadas, %s encontra resistência de alguns membros da alta gerência\n\n", nome_jogador);
        } else {
            System.out.printf("Digite uma opção válida");
        }

        avancarDialogo();

        System.out.println("Membro da Alta Gerência: Você está comprometendo a eficiência da empresa. Isso terá consequências.\n\n\n");
        System.out.printf("%s: Precisamos lidar com as consequências de maneira ética. Como podemos fazer isso?"
        + "\n\n1 - Ignorar as consequências em prol da moral da equipe." + "\n2 - Buscar soluções que equilibrem eficiência e bem-estar dos funcionários.\n\n", nome_jogador);

        int escolha_opção_4 = entrada.nextInt();

        if (escolha_opção_4 == 1) {
            System.out.printf("\nÀ principio parece ser a rota mais fácil, mas o futuro traz consequências...", nome_jogador);
        } else if (escolha_opção_4 == 2) {
            System.out.printf("Você é capaz de motivar a equipe, ao mesmo tempo em que transmite segurança aos membros da Alta Gerência.");
        } else {
            System.out.println("Opção inválida.");
        }

        avancarDialogo();

        System.out.println(nome_jogador + ": O que construímos aqui é mais do que uma revolução corporativa.\n" 
        + "É uma lição sobre equilibrar as necessidades corporativas com valores éticos.\nComo essa história vai terminar, depende de nós.");


        /*
         * Mesmo após ter assumido o cargo de liderança e tentado diversas vezes
         * implementado melhorias
         * na empresa “CorpoTech”, o pessoal da alta gerência vem ignorando o seu
         * trabalho, (Nome do
         * usuário) viu que a empresa não estava respeitando a missão, visão e valores
         * que lhe foi
         * apresentado no dia da entrevista.
         * 
         * O escritório de (Nome do usuário) estava agora imerso em murmúrios, conversas
         * sussurradas e a expectativa de mudanças. Alex estava determinado a liderar
         * uma revolta silenciosa contra as práticas degradantes da CorpoTech. Ele
         * reuniu sua equipe para discutir estratégias.
         * 
         */
    }

    static void creditos() {
        Scanner entrada = new Scanner(System.in);
        int escolha_menu;
        System.out.println(
                "\n\n</> Desenvolvedores </>\n\n-> Helbert Lima \n-> Juan Miller \n-> Melina Michele \n-> Rômulo Andrade");
        do {
            System.out.println("\n2 - Voltar/Sair");
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
            System.out.println("Por favor, pressione Enter para avançar.\n");
            return false;
        }
    }
    
    static void pedirNome() {
    	Scanner scanner = new Scanner(System.in);
        if(nome_jogador == null){
            System.out.println("Antes de prosseguir, digite o seu Nome: \n");
            nome_jogador = scanner.next();
            System.out.println("");
        }
    }
}
