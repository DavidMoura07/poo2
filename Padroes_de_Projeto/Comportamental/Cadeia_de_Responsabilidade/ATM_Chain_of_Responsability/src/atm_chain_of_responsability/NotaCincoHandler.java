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
public class NotaCincoHandler extends AbstractSaqueHandler{
    public static final int CINCO = 5;
    
    @Override
    protected int getValorNota() {
        return CINCO;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / CINCO;
        System.out.println(qtdNotas + "x " + CINCO);
        return valor - (qtdNotas * CINCO);
    }
}
