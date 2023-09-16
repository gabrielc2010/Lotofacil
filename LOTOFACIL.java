import java.util.Random;
import java.util.Scanner;

public class LOTOFACIL {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;
        char letraPremiada = 'G';
        do {
            System.out.println("*******************************");
            System.out.println("Menu da loterica");
            System.out.println("1 - Aposta de 0 a 100 ");
            System.out.println("2 - Aposta de A á Z");
            System.out.println("3 - Aposta em par ou impar");
            System.out.println("0 - para sair");
            System.out.println("*******************************");


            System.out.println(" Escolha um opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite um numero de 0 a 100: ");
                    int numeroApostado = scanner.nextInt();
                    int numeroSorteado = random.nextInt(102);
                    if (numeroApostado >= 0 && numeroApostado <= 100) {
                        if (numeroApostado == numeroSorteado) {
                            System.out.print("Parabens voce ganhou R$ 1.000,00");
                        } else {
                            System.out.println("Que pena! o numero sorteado foi : " + numeroSorteado + " ");
                        }
                    } else {
                        System.out.println(" \n A posta invalida \n .");
                    }
                }
                case 2 -> {
                    System.out.println("Digite uma letra de A a Z: ");
                    char letraApostado = Character.toUpperCase(scanner.next().charAt(0));
                    if (Character.isLetter(letraApostado)) {
                        if (letraApostado == letraPremiada) {
                            System.out.println("Parabens voce ganhou R$ 500,00 reais ");
                        } else {
                            System.out.println("que pena! A letra sorteada foi : " + letraPremiada + " ");
                        }
                    } else {
                        System.out.println("Aposta invalida");
                    }
                }
                case 3 -> {
                    System.out.println("Entre com um número interio ");
                    int numeroParImpar = scanner.nextInt();
                    if (numeroParImpar % 2 == 0) {
                        System.out.print("Parabens voce ganhou R$ 100,00 \n\n ");
                    } else {
                        System.out.println("Que pena ! A premiacao foi para numeros pares");
                    }
                }
                case 0 -> System.out.println("Fechando casa de aposta... Obrigado por jogar! ");
                default -> System.out.println("opção invalida! Selecione uma opção valida ");
            }


        } while (opcao != 0);
        scanner.close();
    }
}