/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.numeros.de.telefone;

/**
 *
 * @author david
 */
public class Main {

    public static void main(String[] args) {
        
        // Criando vários geradores para mostrar que não faz diferença qual variavel usarei, a instancia será sempre a mesma
        CellphoneNumberGenerator generator0 = CellphoneNumberGenerator.getInstance();        
        CellphoneNumberGenerator generator1 = CellphoneNumberGenerator.getInstance();
        CellphoneNumberGenerator generator2 = CellphoneNumberGenerator.getInstance();
        
        // Gerando numeros através de variáveis diferentes, entretanto a sequencia não é perdida
        System.out.println(generator0.generateNextCellphoneNumber());
        System.out.println(generator1.generateNextCellphoneNumber());
        System.out.println(generator2.generateNextCellphoneNumber());
        System.out.println(generator1.generateNextCellphoneNumber());
        System.out.println(generator0.generateNextCellphoneNumber());

    }
    
}
