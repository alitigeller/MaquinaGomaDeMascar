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
public class SemMoeda implements MaquinaDeGomaEstado{
    MaquinaGoma maquina;

    public SemMoeda(MaquinaGoma maquina) {
        this.maquina = maquina;
    }

    
    @Override
    public void inserirMoeda(int valor) {
        this.maquina.setMoeda(valor);
        maquina.setEstado(maquina.getRecebeuMoeda());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nao tem moeda na máquina. \n");
    }

    @Override
    public void puxarAlavanca() {
        System.out.println("Insira uma moeda na máquina. \n");
    }

    @Override
    public void entregarGoma() {
        System.out.println("Insira uma moeda na máquina. \n");
    }
 
    
    
}
