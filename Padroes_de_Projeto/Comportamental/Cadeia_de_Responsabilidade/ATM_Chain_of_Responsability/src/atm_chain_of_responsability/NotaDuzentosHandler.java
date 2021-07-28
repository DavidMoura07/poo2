/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_chain_of_responsability;

/**
 *
 * @author david
 */
public class NotaDuzentosHandler extends AbstractSaqueHandler {
    
    public static final int DUZENTOS = 200;
    
    @Override
    protected int getValorNota() {
        return DUZENTOS;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / DUZENTOS;
        System.out.println(qtdNotas + "x " + DUZENTOS);
        return valor - (qtdNotas * DUZENTOS);
    }
    
}
