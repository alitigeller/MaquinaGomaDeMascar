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
public class GomaVendida implements MaquinaDeGomaEstado{
    MaquinaGoma maquina;

    public GomaVendida(MaquinaGoma maquina) {
        this.maquina = maquina;
    }
    
    @Override
    public void entregarGoma(){
        maquina.setNumeroGomas(maquina.getNumeroGomas()-1);

        if(maquina.getNumeroGomas()>0){
            maquina.setEstado(maquina.getSemMoeda());
        }else{
            maquina.setEstado(maquina.gomasAcabaram);
        }
        
    }

    @Override
    public void inserirMoeda(int valor) {
        System.out.println("Moeda jah inserida. \n");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda valida");
    }

    @Override
    public void puxarAlavanca() {
        System.err.println("Alavanca jah foi puxada. \n");
    }
}
