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
public class NotaCinquentaHandler extends AbstractSaqueHandler {
    public static final int CINQUENTA = 50;
    
    @Override
    protected int getValorNota() {
        return CINQUENTA;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / CINQUENTA;
        System.out.println(qtdNotas + "x " + CINQUENTA);
        return valor - (qtdNotas * CINQUENTA);
    }
}
