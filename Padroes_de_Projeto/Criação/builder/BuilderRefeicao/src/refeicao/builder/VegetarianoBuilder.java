

package refeicao.builder;

import refeicao.modelo.HamburgerVegetariano;
import refeicao.modelo.Refeicao;

/**
 *
 * @author felipe
 */
public class VegetarianoBuilder extends RefeicaoBuilder{
    
    public VegetarianoBuilder(Refeicao refeicao){
        this.refeicao = refeicao;
    }        
    public void preparaHamburgerVegetariano(){
        System.out.println("cria hamburger vegetariano");
        this.refeicao.setHamburger(new HamburgerVegetariano());
    }        
}


