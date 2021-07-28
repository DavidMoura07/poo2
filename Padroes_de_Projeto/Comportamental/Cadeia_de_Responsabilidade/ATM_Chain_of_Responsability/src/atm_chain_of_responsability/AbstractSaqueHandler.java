/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_chain_of_responsability;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public abstract class AbstractSaqueHandler implements SaqueHandler {
    private SaqueHandler nextSaqueHandler;
    
    @Override
    public void setNextHandler(SaqueHandler handler) {
        this.nextSaqueHandler = handler;
    }
    
    @Override
    public void processHandler(int valor) {                
        if(valor >= getValorNota())
              valor = handlePagamento(valor);                               
        if (nextSaqueHandler != null && valor > 0)
            this.nextSaqueHandler.processHandler(valor);
        
    }
    
    protected abstract int getValorNota();    
    
    protected abstract int handlePagamento(int valor);
}
