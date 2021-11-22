

package refeicao.builder;

import refeicao.modelo.HamburgerCarne;
import refeicao.modelo.Refeicao;

/**
 *
 * @author felip
 */
public class NonVegetarianoBuilder extends RefeicaoBuilder{
 
    public NonVegetarianoBuilder(Refeicao novaRefeicao){
        this.refeicao = novaRefeicao;
    }    
    public void prepadaHamburgerCarne(){
        System.out.println("cria hamburger carne");
        this.refeicao.setHamburger(new HamburgerCarne());
    }

    /**
     *
     * @author felip
     */
    public static class BuilderRefeicao {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
        }

    }
}
