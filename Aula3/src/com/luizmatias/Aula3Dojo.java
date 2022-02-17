package com.luizmatias;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula3Dojo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float minValue = 0;
        float maxValue = 0;
        float average = 0;
        int interactions = 0;
        boolean firstInteraction = true;
        boolean userWantsToQuit = false;

        while (!userWantsToQuit) {
            try {
                System.out.println("Digite um número ou qualquer outro valor para sair.");
                float value = s.nextFloat();

                if (firstInteraction) {
                    minValue = value;
                    maxValue = value;
                    average = value;
                    firstInteraction = false;
                }

                if (minValue > value) {
                    minValue = value;
                }

                if (maxValue < value) {
                    maxValue = value;
                }

                average = ((average * interactions) + value) / (interactions + 1);
                interactions++;

                System.out.printf("Mínimo: %.2f, Máximo: %.2f, Média: %.2f", minValue, maxValue, average);
                System.out.println();

            } catch (InputMismatchException e) {
                userWantsToQuit = true;
            }
        }

        if (firstInteraction) {
            System.out.println("Você não digitou nenhum valor. Encerrando o programa.");
        } else {
            System.out.println("FIM DA EXECUÇÃO");
            System.out.printf("Mínimo: %.2f, Máximo: %.2f, Média: %.2f", minValue, maxValue, average);
            System.out.println();
        }
    }
}
