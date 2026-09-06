package estudos;

import java.util.*;

public class Campeonato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;

        String[] nome = new String[5];
        int[] numero = new int[5];
        int[] pontosJogador = new int[5];

        int contadorJogadores = 0;

        do {
            System.out.println("========================");
            System.out.println("       CAMPEONATO");
            System.out.println("========================");
            System.out.println("1 - Cadastrar jogador");
            System.out.println("2 - Registrar partida");
            System.out.println("3 - Ver jogadores");
            System.out.println("4 - Ver ranking");
            System.out.println("0 - Sair");
            System.out.println("========================");
            System.out.print("Opcao: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1: {

                    if (contadorJogadores < 5) {

                        System.out.print("Insira o Nome do Jogador: ");
                        String nomeJogador = sc.nextLine();

                        System.out.print("Numero do Jogador: ");
                        int numeroJogador = sc.nextInt();

                        nome[contadorJogadores] = nomeJogador;
                        numero[contadorJogadores] = numeroJogador;
                        pontosJogador[contadorJogadores] = 0;

                        contadorJogadores++;

                        System.out.println("Jogador cadastrado com sucesso!");

                    } else {
                        System.out.println("Limite de jogadores atingido!");
                    }

                    break;
                }

                case 2: {

                    System.out.print("Qual o numero do jogador: ");
                    int num = sc.nextInt();

                    boolean encontrou = false;
                    int indiceEncontrado = -1;

                    for (int i = 0; i < contadorJogadores; i++) {

                        if (numero[i] == num) {
                            encontrou = true;
                            indiceEncontrado = i;
                            break;
                        }
                    }

                    if (encontrou) {

                        System.out.print("Quantos pontos o jogador fez: ");
                        int pontos = sc.nextInt();

                        if (pontos >= 0) {
                            pontosJogador[indiceEncontrado] += pontos;

                            System.out.println("Pontos registrados com sucesso!");
                        } else {
                            System.out.println("A quantidade de pontos nao pode ser negativa!");
                        }

                    } else {
                        System.out.println("Jogador nao encontrado!");
                    }

                    break;
                }

                case 3: {

                    System.out.println("----- JOGADORES -----");

                    for (int i = 0; i < contadorJogadores; i++) {

                        System.out.println(
                                "Numero: " + numero[i]
                                + " | " + nome[i]
                                + " | Pontos: " + pontosJogador[i]
                        );
                    }

                    break;
                }

                case 4: {

                    // Ordenacao do maior para o menor
                    for (int i = 0; i < contadorJogadores - 1; i++) {

                        for (int j = i + 1; j < contadorJogadores; j++) {

                            if (pontosJogador[i] < pontosJogador[j]) {

                                // Troca pontos
                                int auxPontos = pontosJogador[i];
                                pontosJogador[i] = pontosJogador[j];
                                pontosJogador[j] = auxPontos;

                                // Troca nomes
                                String auxNome = nome[i];
                                nome[i] = nome[j];
                                nome[j] = auxNome;

                                // Troca numeros
                                int auxNumero = numero[i];
                                numero[i] = numero[j];
                                numero[j] = auxNumero;
                            }
                        }
                    }

                    System.out.println("----- RANKING -----");

                    for (int i = 0; i < contadorJogadores; i++) {

                        System.out.println(
                                (i + 1) + "º - "
                                + nome[i]
                                + " | " + pontosJogador[i]
                                + " pontos"
                        );
                    }

                    break;
                }

                case 0: {

                    System.out.println("Saindo do sistema...");

                    break;
                }

                default: {

                    System.out.println("Opcao invalida!");

                }
            }

        } while (op != 0);

        sc.close();
    }
}