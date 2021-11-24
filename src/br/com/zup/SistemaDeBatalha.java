package br.com.zup;

import java.util.Scanner;

public class SistemaDeBatalha {

    private static Scanner leitor (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}
