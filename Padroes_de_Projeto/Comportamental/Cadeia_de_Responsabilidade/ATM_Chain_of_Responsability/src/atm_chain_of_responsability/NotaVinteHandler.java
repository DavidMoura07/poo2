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
public class NotaVinteHandler extends AbstractSaqueHandler {
    public static final int VINTE = 20;
    
    @Override
    protected int getValorNota() {
        return VINTE;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / VINTE;
        System.out.println(qtdNotas + "x " + VINTE);
        return valor - (qtdNotas * VINTE);
    }
}
