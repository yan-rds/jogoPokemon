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
            escolherAtaque(new Pokemon()/*teste*/);
        }

        else if (escolha == 2){
            // Método de utilizar itens
        }

        else if (escolha == 3){
            // Método de trocar de pokemons
        }

    }

    public static void escolherAtaque (Pokemon pokemon){
        System.out.println("1-" +pokemon.getMoves.get(0));
        System.out.println("2-" +pokemon.getMoves.get(1));
        System.out.println("3-" +pokemon.getMoves.get(2));
        System.out.println("4-" +pokemon.getMoves.get(3));
        int escolha = leitor("").nextInt();

        if (escolha == 1){
            //Método que calcula dano utilizando o move 1 como parametro
        }
        else if (escolha == 2){
            //Método que calcula dano utilizando o move 2 como parametro
        }
        else if (escolha == 3){
            //Método que calcula dano utilizando o move 3 como parametro
        }
        else if (escolha == 4){
            //Método que calcula dano utilizando o move 4 como parametro
        }
    }


}
