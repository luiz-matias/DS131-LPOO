package com.luizmatias;

public class Tarefa1Ex8 {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = args.length-1; i >= 0; i--) {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("Nenhum argumento informado.");
        }
    }
}
