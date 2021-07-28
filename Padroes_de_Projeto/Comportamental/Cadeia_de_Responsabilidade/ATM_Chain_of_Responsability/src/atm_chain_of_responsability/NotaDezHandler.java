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
public class NotaDezHandler extends AbstractSaqueHandler{
    public static final int DEZ = 10;
    
    @Override
    protected int getValorNota() {
        return DEZ;
    }

    @Override
    protected int handlePagamento(int valor) {
        int qtdNotas = valor / DEZ;
        System.out.println(qtdNotas + "x " + DEZ);
        return valor - (qtdNotas * DEZ);
    }
}
