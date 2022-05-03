/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habilidades;

import java.io.Serializable;

/**
 *
 * @author PcCom
 */
public class Disciplina extends Habilidad implements Serializable {

    private String name;
    private int ataque;
    private int defensa;
    private int coste;

    public Disciplina(String nombre, int at, int def, int cost) {
        this.ataque = at;
        this.defensa = def;
        this.name = nombre;
        this.coste = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getMin() {
        return this.coste;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}