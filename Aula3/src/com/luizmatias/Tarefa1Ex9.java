package com.luizmatias;

public class Tarefa1Ex9 {

    public static void main(String[] args) {

        try {
            float firstNumber = Float.parseFloat(args[0]);
            float secondNumber = Float.parseFloat(args[1]);
            String operator = args[2];

            switch (operator) {
                case "+":
                    System.out.println((firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println((firstNumber - secondNumber));
                    break;
                case "/":
                    System.out.println((firstNumber / secondNumber));
                    break;
                case "*":
                    System.out.println((firstNumber * secondNumber));
                    break;
                default:
                    System.out.println("Operador inválido");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Argumentos inválidos");
        }

    }
}
