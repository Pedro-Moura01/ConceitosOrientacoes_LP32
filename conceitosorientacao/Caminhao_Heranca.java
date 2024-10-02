/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitosorientacao;

/**
 *
 * @author Pedro Moura
 */
public class Caminhao_Heranca {
    class Caminhao extends Carro_Classe {
    private int carga;
    public Caminhao(String marca, String nome, int carga) {
        super(marca, nome);
        this.carga = carga;
    }
    public void mostraCarga() {
        System.out.println("O caminhão " + super.nomeCompleto() +
        " carrega " + carga + " toneladas");
    }
}
public class App {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);
        caminhao.mostraCarga();
    }
}
}


