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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CaixaEntradaGrupo cxGrupo = new CaixaEntradaGrupo("");
        MembroEmail email = new MembroEmail("email@email.com");
        MembroWhatsApp wpp = new MembroWhatsApp(999999999);
        
        cxGrupo.setNovaMensagem("Mensagem Sem Observadores");
        cxGrupo.addObserver(email);
        cxGrupo.setNovaMensagem("Mensagem com observador de email");
        cxGrupo.addObserver(wpp);
        cxGrupo.setNovaMensagem("Mensagem com observador de email e wpp");
        cxGrupo.deleteObserver(email);
        cxGrupo.setNovaMensagem("Mensagem somente com wpp");
        cxGrupo.deleteObserver(wpp);
        cxGrupo.setNovaMensagem("Mensagem sem ninguem");
    }
    
}
