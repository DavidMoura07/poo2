/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_chain_of_responsability;

import java.util.List;

/**
 *
 * @author david
 */
public interface SaqueHandler {
    public void setNextHandler(SaqueHandler handler);
    public void processHandler(int valor); 
}
