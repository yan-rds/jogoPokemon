package br.com.zup;

import java.util.Scanner;

public class SistemaDeBatalha {

    private static Scanner leitor (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void turnoDoJogador (){
        System.out.println("1 - Atacar");
        System.out.println("2 - Utilizar Itens");
        System.out.println("3 - Trocar de pokemon");
        int escolha = leitor("").nextInt();

        if (escolha == 1){
            // Método de selecionar os Ataques
        }

        else if (escolha == 2){
            // Método de utilizar itens
        }

        else if (escolha == 3){
            // Método de trocar de pokemons
        }

    }


}
