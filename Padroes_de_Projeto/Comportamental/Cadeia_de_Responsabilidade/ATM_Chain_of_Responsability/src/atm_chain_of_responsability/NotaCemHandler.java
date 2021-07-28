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
public class NotaCemHandler extends AbstractSaqueHandler {
    public static final int CEM = 100;
    
    @Override
    protected int getValorNota() {
        return CEM;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / CEM;
        System.out.println(qtdNotas + "x " + CEM);
        return valor - (qtdNotas * CEM);
    }
}
