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
public class MaquinaGoma {
    private int moeda;
    private int numeroGomas;
    MaquinaDeGomaEstado estadoCorrente;
    SemMoeda semMoeda;
    RecebeuMoeda recebeuMoeda;
    GomaVendida gomaVendida;
    GomasAcabaram gomasAcabaram ;

    public MaquinaGoma(int numeroGomas) {
        this.numeroGomas = numeroGomas;
        this.semMoeda = new SemMoeda(this);
        this.recebeuMoeda = new RecebeuMoeda(this);
        this.gomaVendida = new GomaVendida(this);
        this.gomasAcabaram  = new GomasAcabaram(this);
        
        this.estadoCorrente = semMoeda;
    }
    
    

    public MaquinaDeGomaEstado getEstadoCorrente() {
        return estadoCorrente;
    }

    public void setEstado(MaquinaDeGomaEstado estadoCorrente) {
        this.estadoCorrente = estadoCorrente;
    }

    public void inserirMoeda(int valor){
        estadoCorrente.inserirMoeda(valor);
    }
    
    public void ejetarMoeda(){
        estadoCorrente.ejetarMoeda();
    }
    
    public void puxarAlavanca(){
        estadoCorrente.puxarAlavanca();
    }
    
    public void entrgarGoma(){
        estadoCorrente.entregarGoma();
    }
    
    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public int getNumeroGomas() {
        return numeroGomas;
    }

    public void setNumeroGomas(int numeroGomas) {
        this.numeroGomas = numeroGomas;
    }

    public SemMoeda getSemMoeda() {
        return semMoeda;
    }

    public void setSemMoeda(SemMoeda semMoeda) {
        this.semMoeda = semMoeda;
    }

    public RecebeuMoeda getRecebeuMoeda() {
        return recebeuMoeda;
    }

    public void setRecebeuMoeda(RecebeuMoeda recebeuMoeda) {
        this.recebeuMoeda = recebeuMoeda;
    }

    public GomaVendida getGomaVendida() {
        return gomaVendida;
    }

    public void setGomaVendida(GomaVendida gomaVendida) {
        this.gomaVendida = gomaVendida;
    }

    public GomasAcabaram getGomasAcabaram() {
        return gomasAcabaram;
    }

    public void setGomasAcabaram(GomasAcabaram gomasAcabaram) {
        this.gomasAcabaram = gomasAcabaram;
    }
    
    
    
}
