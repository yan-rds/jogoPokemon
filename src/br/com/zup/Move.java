package br.com.zup;

public class Move { // Poder
    private String nome;
    private int level; // Por enquanto é inutil, tá aqui porque na api tem isso
    private Tipo tipo;
    private DamageCategory damageCategory; // Define se um ataque é especial, físico ou Status (não causa dano diretamente)
    private int power;
    private int accuracy; // Taxa de acerto
    private int pp; // quantidade de usos restantes

    public Move() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public DamageCategory getDamageCategory() {
        return damageCategory;
    }

    public void setDamageCategory(DamageCategory damageCategory) {
        this.damageCategory = damageCategory;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
}
