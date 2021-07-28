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
public class NotaUmHandler extends AbstractSaqueHandler{
    public static final int UM = 1;
    
    @Override
    protected int getValorNota() {
        return UM;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / UM;
        System.out.println(qtdNotas + "x " + UM);
        return valor - (qtdNotas * UM);
    }
}
