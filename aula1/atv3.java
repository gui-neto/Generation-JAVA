package atividades;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {

        String nome;
        int idade;
        String primeira = "";

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        nome = leia.nextLine();

        System.out.println("Digite a idade do doador: ");
        idade = leia.nextInt();

        leia.nextLine();

        System.out.println("Primeira doação de sangue? (sim ou não) ");
        primeira = leia.nextLine();

        if (idade >= 18 && idade <= 69) {
            if (primeira.equalsIgnoreCase("não")) {
                System.out.println("Doador " + nome + " está Apto para doar sangue.");
            } else if (primeira.equalsIgnoreCase("sim")) {
                System.out.println("Doador " + nome + " NÃO está Apto para doar sangue, pois é sua primeira doação.");
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'sim' ou 'não'.");
            }
        } else {
            System.out.println("Doador " + nome + " NÃO está Apto para doar sangue devido à idade.");
        }

        leia.close();
    }
}
