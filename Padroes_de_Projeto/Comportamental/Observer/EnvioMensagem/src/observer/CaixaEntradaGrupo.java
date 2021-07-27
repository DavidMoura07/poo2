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
public class CaixaEntradaGrupo extends Observable {
    private String mensagem;

    public CaixaEntradaGrupo(String mensagem) {
        super();
        this.mensagem = mensagem;
    }
    
    
    
    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;
        this.notifyObserver();
    }
    
    public String getMensagem(){
        return this.mensagem;
    }
}
