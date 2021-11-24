package br.com.zup;

public class Ability {
    private String nome; // Por enquanto só tem nome, futuramente elas terão seu efeito

    public Ability() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
