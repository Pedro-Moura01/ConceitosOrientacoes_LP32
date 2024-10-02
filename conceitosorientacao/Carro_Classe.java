/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitosorientacao;

/**
 *
 * @author Pedro Moura
 */
public class Carro_Classe {
    
    private String marca;
    private String nome;
    public Carro_Classe(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    public void andar() {
        System.out.println("O carro " + marca + " " + nome + " está andando");
    }
}