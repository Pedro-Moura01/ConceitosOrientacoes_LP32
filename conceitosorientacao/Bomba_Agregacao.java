/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitosorientacao;

/**
 *
 * @author Pedro Moura
 */
public class Bomba_Agregacao {
    
    class Bomba {
    private String combustivel;
    private Carro carroAbastecendo;
    public Bomba(String combustivel) {
        this.combustivel = combustivel;
    }
    public void abastecer(Carro carro) {
        this.carroAbastecendo = carro;
        System.out.println("O " + carro.getClass().getSimpleName() + " " + carro.nomeCompleto() + " está sendo abastecido com " + this.combustivel);
    }
    public boolean estaDisponivel() {
        return this.carroAbastecendo == null;
    }
}
public class App {
    public static void main(String[] args) {
        Bomba bomba = new Bomba("Gasolina");
        bomba.abastecer(new Carro("Fiat", "Gol")); 
    }
}

}
