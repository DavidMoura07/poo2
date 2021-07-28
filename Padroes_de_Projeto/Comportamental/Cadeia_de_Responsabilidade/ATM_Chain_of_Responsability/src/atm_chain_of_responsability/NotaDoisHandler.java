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
public class NotaDoisHandler extends AbstractSaqueHandler {
    public static final int DOIS = 2;
    
    @Override
    protected int getValorNota() {
        return DOIS;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / DOIS;
        System.out.println(qtdNotas + "x " + DOIS);
        return valor - (qtdNotas * DOIS);
    }
}
