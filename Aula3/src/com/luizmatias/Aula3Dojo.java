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
                System.out.println("Digite um número ou S para sair.");
                String value = s.next();

                if (value.equalsIgnoreCase("s")) {
                    userWantsToQuit = true;
                } else {
                    float valueFormatted = Float.parseFloat(value);

                    if (firstInteraction) {
                        minValue = valueFormatted;
                        maxValue = valueFormatted;
                        average = valueFormatted;
                        firstInteraction = false;
                    }

                    if (minValue > valueFormatted) {
                        minValue = valueFormatted;
                    }

                    if (maxValue < valueFormatted) {
                        maxValue = valueFormatted;
                    }

                    average = ((average * interactions) + valueFormatted) / (interactions + 1);
                    interactions++;

                    System.out.printf("Mínimo: %.2f, Máximo: %.2f, Média: %.2f", minValue, maxValue, average);
                    System.out.println();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Você digitou um valor inválido.");
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
