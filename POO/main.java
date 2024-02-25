import java.util.ArrayList;
import java.util.Scanner;

import herance.obj.adaga_flamejante;
import herance.obj.dice;
import herance.obj.goblin;
import herance.obj.armas;
import herance.obj.asciarts;
import herance.obj.hero;
import herance.obj.player;
import herance.obj.pocao_cura;

import java.util.List;

public class main {
    private static List<player> tower = new ArrayList<player>();
    private static player jogador;
    private static Scanner resp = new Scanner(System.in);
    private static int andar = 0;
    private static ArrayList <pocao_cura> pocoes = new ArrayList <pocao_cura>(6);
    private static adaga_flamejante arma1 = new adaga_flamejante(10);

    public static void print_line() {
        System.out.println(
        "-------------------------------------------------------------------------------------------------\n");
    }

    public static void exibir_com_efeito(int tempo, String mensagem) {  
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.printf("%c", mensagem.charAt(i));
            sleep(tempo);
        }   
    }

    public static void pegar_super_recompensa() {
        limpar_terminal();
        if (true) {
            System.out.println(asciarts.bau); 
            exibir_com_efeito(100, "MEU DEUS VOCÊ RECEBEU UMA SUPER RECOMPENSA\n");
            arma1.tornar_usavel();;
        }
    };


    public static void pegar_recompensa() {
        limpar_terminal();
        System.out.printf("%s parábens aventureiro você acaba de achar um Bau do teusouro\n Espere ele abrir ", jogador.get_name());
        exibir_com_efeito(200,  ".............\n");
        if (dice.roll(2) == 1) {
            System.out.printf("Parabens vc recebeu uma recompensa por derrotar o %s \n", tower.get(andar).get_name());
            pocoes.add(new pocao_cura());
            sleep(2000);
        } else {
            System.out.println("Não tinha nada no bau infelizmente quem sabe na proxima\n");
            sleep(2000);
        }
        limpar_terminal();
    }

    public static void batalha() {
        int opc;
        int experiencia_ganha;
        int dano;
        System.out.printf("%s vc está enfrentando um %s\n", jogador.get_name(), tower.get(andar).get_name());
        boolean turno = false;
        while (true) {
            if (jogador.get_life() < 0) break;
            if (tower.get(andar).get_life() < 0) break;
            if (turno == false) {
                System.out.printf(
                "█████████████████████████████████████████████████████████\n" +
                "██ Torre atual %d                                        \n" +
                "██ Seu nível %d                                          \n" +
                "██ Ambiente de batalha                                   \n" +
                "██ Luis Hp = %d    %s hp = %d                            \n" +
                "█████████████████████████████████████████████████████████\n",andar, jogador.get_level(), 
                jogador.get_life(), tower.get(andar).get_name(), tower.get(andar).get_life());
                System.out.printf("\n");
                System.out.printf(
                "████████████████████████████████████████████████\n" +
                "██ Ataques dispovieis                         ██\n" +
                "██ 1 Celestial slash                          ██\n" +
                "██ 2                                          ██\n" +
                "██ 3                                          ██\n" +
                "██ Defesas disponiveis                        ██\n" +
                "██ 4 lestial dodge                            ██\n" +
                "██ 5                                          ██\n" +
                "████████████████████████████████████████████████\n");
                System.out.printf("\n");
                if (arma1.get_especial_point() > 0 && arma1.esta_ativa()) {
                    System.out.printf(
                        "████████████████████████████████████████████████\n" +
                    "   Ataques Especiais da sua arma     Restam %d disponíveis\n" +
                        "   %s                                           \n" +
                        "   Para tirar dano                              \n" +
                        "   6 Nuvem de fogo                              \n" +
                        "                                                \n" +
                        "   movimentos de defesa                         \n" +
                        "                                                \n" +
                        "   7 Nuvem de poeira                            \n" +
                        "████████████████████████████████████████████████\n", arma1.get_especial_point(), arma1.get_name());
                }

                System.out.printf("tecle para escolher o movimento (ataque ou defesa)\n");
                opc = resp.nextInt();
                resp.nextLine();
                if (opc == 1) {
                    dano = jogador.attack(tower.get(andar));
                    System.err.printf("Você casou %d de dano\n", dano);
                }
                else if (opc == 4) {
                    int d = 0;
                    d = dice.roll(50);
                    if(jogador.try_to_dodge()) {
                        System.out.printf("Esquiva-se com sucesso do ataque do %s\n ele levou %d de dano e está impossibilitado de atacar na proxima rodada\n", tower.get(andar).get_name(), d);
                        tower.get(andar).set_life(tower.get(andar).get_life()-d);
                    } else {
                        System.out.printf("Esquiva falhou vc levou %d e ainda vai ser atacado pelo inimigo\n", d);
                        jogador.set_life(jogador.get_life()-d);
                        turno = true;
                    }
                    sleep(1000);
                } 
                else if (opc == 6) {
                   dano = jogador.attack_2(jogador, arma1.nuvem_de_fogo());
                   System.err.printf("Você casou %d de dano\n", dano);
                }
                else if (opc == 7) {

                }
                else {
                    turno = true;
                }
                limpar_terminal();
            } else {
                System.out.printf("Vez do seu openente prepara-se para o ataque\n");
                sleep(1000);
                dano = tower.get(andar).attack(jogador);
                System.out.printf("Gooblin casou %d de dano\n", dano);
                limpar_terminal();
                turno = false;
            }
        }
        experiencia_ganha = dice.roll(70);
        jogador.set_exp(jogador.get_exp()+experiencia_ganha);
        if (jogador.level_up()) {
            System.err.printf("vc subiu de nivel foi de %d para %d\n", jogador.get_level()-1, jogador.get_level());
        }
        pegar_recompensa();
        pegar_super_recompensa();
        andar++;
    }

    public static void limpar_terminal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void sleep(int segundos) {
        try {
            Thread.sleep(segundos);
        } catch (InterruptedException e) {
        }
        ;

    }

    public static void text_principal() {
        main.print_line();
        String text = "Descrição do Plot:\n Em Ascensão da Torre Sombria, os jogadores embarcam em uma jornada desafiadora em uma misteriosa torre conhecida por seu poder mágico e segredos sombrios. A história começa com o personagem principal, um aventureiro corajoso, recebendo um chamado para explorar a Torre Sombria, que se ergue majestosamente no coração de uma terra mágica. \nA torre é habitada por criaturas das sombras e monstros místicos que guardam os andares superiores. O objetivo do jogador é subir a torre, enfrentando desafios e inimigos cada vez mais perigosos. A razão para essa jornada é revelada gradualmente através de pergaminhos antigos e narrativas encontradas ao longo do caminho. \nCada andar da torre apresenta um conjunto único de quebra-cabeças, armadilhas e, é claro, inimigos assustadores. O jogador precisa aprimorar suas habilidades de combate, coletar itens mágicos e desvendar os segredos ocultos da torre para progredir. À medida que avançam, os jogadores podem descobrir a história por trás da Torre Sombria, incluindo sua criação por um feiticeiro perdido e os mistérios que envolvem sua existência. \nAo longo da jornada, o jogador encontra aliados improváveis, como guardiões místicos e outros aventureiros que foram atraídos pela magia da torre. As escolhas do jogador, tanto em termos de enfrentar desafios quanto de interagir com personagens, influenciam o desenrolar da trama. \nA medida que o jogador chega aos andares superiores, a intensidade do jogo aumenta, culminando em um confronto épico com o guardião final da torre. O final revela os mistérios mais profundos da Torre Sombria e o destino que aguarda o jogador após a ascensão.\n";
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            sleep(0);
        }
        main.print_line();

    }

    public static void iniciar_dungeon() {
        for (int i = 0; i < 10; i++) {
            player inimigo = new goblin(0);
            inimigo.set_life(dice.roll(200));
            tower.add(inimigo);
        }
    }

    public static void main(String[] args) {
        text_principal();
        int resposta = 0;
        main.sleep(1000);
        limpar_terminal();
        while (true) {
            System.out.printf(
                "████████████████████████████████████████████████\n" +
                "██                                            ██\n" +
                "██  1 New game                                ██\n" +
                "██  2 exit                                    ██\n" +
                "██                                            ██\n" +
                "██                                            ██\n" +
                "██                                            ██\n" +
                "████████████████████████████████████████████████\n"
                );
            int op = resp.nextInt();
            if (op == 2)
                break;
            else {
                resp.nextLine();
                limpar_terminal();
                while (true) {
                    String name;
                    while (true) {
                        System.out.println("Digite o nome do seu personagem\n");
                        name = resp.nextLine();
                        if (name == "") {
                            System.out.println("Por favor digite um nome valido\n");
                            limpar_terminal();
                        } else {
                            limpar_terminal();
                            break;
                        }
                    }
                    while (true) {
                        System.out.printf(
                                "████████████████████████████████████████████████\n" +
                                "██         Classes disponiveis                ██\n" +
                                "██  1 Herói                                   ██\n" +
                                "████████████████████████████████████████████████\n"
                        );
                                op = resp.nextInt();
                        resp.nextLine();

                        if (op == 1) {
                            jogador = new hero(1, 100, 1, name);
                            break;
                        } else {
                            System.out.println("classe invalida escolha entre as disponivéis");
                            limpar_terminal();
                        }
                    }
                    
                    iniciar_dungeon();
                    String text = "Ola " + jogador.get_name() + " você acaba de adentrar na torre sombria agora para ganhar o game vc deve avançar todos os niveis da torre e chegar no topo\n a todo temos 10 niveis cada nível com seus inimigos e desáfio boa sorte !\n";
                    System.out.println(text);
                    sleep(1000);
                    limpar_terminal();
                    
                    while (andar != tower.size()) {
                        System.out.printf("Andar atual %d \n jogador %s  c encontrou um inimigo prepare-se\n uma batalha sangrante se aproxima !\n",andar , jogador.get_name());
                        limpar_terminal();
                        batalha();
                        System.out.printf("%s parábens vc derrotou o monstro deseja utilizar algum item da sua bag ?\n", jogador.get_name());
                        System.out.printf(
                            "████████████████████████████████████████████████\n" +
                            "  %s    hp = %d                                 \n" +
                            "                                                \n" +
                            "                                                \n" +
                            "████████████████████████████████████████████████\n", jogador.get_name(), jogador.get_life());
                        System.out.printf("\n");
                        if(pocoes.size() > 0) {
                            System.out.println("████████████████████████████████████████████████\n");
                            for (int i = 0; i < pocoes.size(); i++) {
                                System.out.printf(
                                    "|  itens disponiveis     |                       \n" +
                                    "| item (%d) |                                    \n" +
                                    " %s                                            \n" +
                                    " Pontos restaurados %d                        \n",i+1 , pocoes.get(i).name, pocoes.get(i).get_forca()
                                );
                            } 
                            System.out.println("████████████████████████████████████████████████\n");
                            sleep(10000);
                            limpar_terminal();
                            System.out.println("| 1 para sim | 2 para não |\n");
                            resposta = resp.nextInt();
                            resp.nextLine();

                            if (resposta == 1) {
                                jogador.heal((pocoes.get(pocoes.size()-1).get_forca()), jogador);
                                pocoes.remove(pocoes.size()-1);
                                System.out.printf("poção usada com sucesso novo hp %d\n", jogador.get_life());
                            } else {
                                System.out.println("Prepare-se para A Proxima batalha\n");
                            }
                            sleep(3000);
                        } else {
                            System.out.println("nenhum item disponivel no momento!\n");
                        }
                        limpar_terminal();
                    }
                }

            }
        }

        resp.close();
    }
}
