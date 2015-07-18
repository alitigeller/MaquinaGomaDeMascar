/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.maquinagomademascar;

/**
 *
 * @author aeller
 */
public class GomasAcabaram implements MaquinaDeGomaEstado{
    MaquinaGoma maquina;
    GomasAcabaram(MaquinaGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda(int valor) {
        System.err.println("As gomas acabaram");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("nao tem nenhuma moeda na maquina. \n");
    }

    @Override
    public void puxarAlavanca() {
        System.err.println("Coloque uma moeda na maquina. \n");
    }

    @Override
    public void entregarGoma() {
        System.out.println("Puxe a alavanca. \n");
    }
    
}
