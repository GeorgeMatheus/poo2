
package refeicao.builder;

import refeicao.builder.NonVegetarianoBuilder;
import refeicao.builder.VegetarianoBuilder;
import refeicao.modelo.Refeicao;

/**
 *
 * @author felipe
 */
public class DiretorRefeicao {        
    
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida){
        Refeicao novaRefeicao = new Refeicao();
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);

        if(tipoBebida.equalsIgnoreCase("refrigerante")){
            refeicaoBuilder.adicionarRefrigerante(sabor);

        } else{
            refeicaoBuilder.adicionarSuco(sabor);
        }

        refeicaoBuilder.preparaBatata();
        refeicaoBuilder.prepadaHamburgerCarne();
        return novaRefeicao;        
    }     
    public Refeicao preparaVegetariana(String sabor, String tipoBebida){        
        Refeicao novaRefeicao = new Refeicao();
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);

        if(tipoBebida.equalsIgnoreCase("refrigerante")){
            refeicaoBuilder.adicionarRefrigerante(sabor);

        } else{
            refeicaoBuilder.adicionarSuco(sabor);
        }

        refeicaoBuilder.preparaBatata();
        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;        
    }            
    
}
