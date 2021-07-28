/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_chain_of_responsability;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o valor que deseja sacar? ");
        int valorSaque = sc.nextInt();
        
        NotaDuzentosHandler duzentos = new NotaDuzentosHandler();
        NotaCemHandler cem = new NotaCemHandler();
        NotaCinquentaHandler cinquenta = new NotaCinquentaHandler();
        NotaVinteHandler vinte = new NotaVinteHandler();
        NotaDezHandler dez = new NotaDezHandler();
        NotaCincoHandler cinco = new NotaCincoHandler();
        NotaDoisHandler dois = new NotaDoisHandler();
        NotaUmHandler um = new NotaUmHandler();
        
        duzentos.setNextHandler(cem);
        cem.setNextHandler(cinquenta);
        cinquenta.setNextHandler(vinte);
        vinte.setNextHandler(dez);
        dez.setNextHandler(cinco);
        cinco.setNextHandler(dois);
        dois.setNextHandler(um);
        
        duzentos.processHandler(valorSaque);
        
    }
    
}
