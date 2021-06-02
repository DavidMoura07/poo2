/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author david
 */
public class FabricaPadrao extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        JButton cancel = new JButton();
        cancel.setText("Cancel");
        return cancel;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton ok = new JButton();
        ok.setText("OK");
        return ok;
    }
    
}
