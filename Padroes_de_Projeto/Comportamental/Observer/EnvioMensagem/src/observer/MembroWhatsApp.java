/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author david
 */
public class MembroWhatsApp implements Observer{
    private int numero;

    public MembroWhatsApp(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void printMessage(CaixaEntradaGrupo obs) {
        System.out.println(this.numero + ": " + obs.getMensagem());
    }

    @Override
    public void update(Observable obs) {
        this.printMessage((CaixaEntradaGrupo) obs);
    }

    
    
}
