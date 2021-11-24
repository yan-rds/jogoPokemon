package br.com.zup;

import java.util.List;

public class Pokemon {

    private int pokedex;
    private String nome;
    private Tipo tipoUm;
    private Tipo tipoDois;
    private int hp; // vida
    private int defense; // defesa fisica
    private int spDef; // defesa especial
    private int attack; // ataque fisico
    private int spAtk; // Ataque especial
    private int speed; // velocidade
    private List<Move> moveList; // Apesar do pokemon ter uma infinidade de possibilidades de move, ele só poderá ter 4 de cada vez
    private List<Ability>abilityList; // Os pokemons tem de duas a três abilities

    public Pokemon() {
    }

    public int getPokedex() {
        return pokedex;
    }

    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipoUm() {
        return tipoUm;
    }

    public void setTipoUm(Tipo tipoUm) {
        this.tipoUm = tipoUm;
    }

    public Tipo getTipoDois() {
        return tipoDois;
    }

    public void setTipoDois(Tipo tipoDois) {
        this.tipoDois = tipoDois;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Move> moveList) {
        this.moveList = moveList;
    }

    public List<Ability> getAbilityList() {
        return abilityList;
    }

    public void setAbilityList(List<Ability> abilityList) {
        this.abilityList = abilityList;
    }
}
