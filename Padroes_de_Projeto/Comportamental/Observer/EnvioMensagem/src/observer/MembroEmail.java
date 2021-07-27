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
public class MembroEmail implements Observer{

    private String email;

    public MembroEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void printMessage(CaixaEntradaGrupo obs) {
        System.out.println(this.email + ": " + obs.getMensagem());
    }

    @Override
    public void update(Observable obs) {
        this.printMessage((CaixaEntradaGrupo) obs);
    }
    
}
