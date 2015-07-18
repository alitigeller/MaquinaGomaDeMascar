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
public class RecebeuMoeda implements MaquinaDeGomaEstado{
    MaquinaGoma maquina;

    public RecebeuMoeda(MaquinaGoma maquina) {
        this.maquina = maquina;
    }
    
    
    @Override
    public void puxarAlavanca() {
        if(maquina.getMoeda()==1){
            maquina.setEstado(maquina.getGomaVendida()); 
        }else{
            System.out.println("Moeda inválida, ejete-a. \n");
        }
        
    }

    @Override
    public void inserirMoeda(int valor) {
        System.out.println("Moeda já inserida na maquina. \n");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("moeda invalida. \n");
        maquina.setEstado(maquina.getSemMoeda());
    }

    @Override
    public void entregarGoma() {
        System.out.println("Puxe a alavanca. \n");
    }
    
}
