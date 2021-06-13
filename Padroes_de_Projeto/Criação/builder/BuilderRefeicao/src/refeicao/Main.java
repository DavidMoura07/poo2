
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //constroi uma refeicao.
        Boolean adicionarBatata = true;
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", adicionarBatata);
        adicionarBatata = false;
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", adicionarBatata);       
    }    
}
