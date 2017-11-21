
package teletaxi;

import java.util.ArrayList;


public class TaxiMonitor implements TransportVisitor {

    private ArrayList<PosicaoGPS> posicaoGPS = new ArrayList();
    private ArrayList<Integer> velocidade = new ArrayList();

    @Override
    public void visit(GPS gps) {
        //TODO
    }

    @Override
    public void visit(Velocidade velocidade) {        
        int veloc = velocidade.getVelocidade();        
        this.velocidade.add(veloc); 
    }

    @Override
    public void visit(Taxi taxi) {   
        System.out.println("Nome=" + taxi.getName());        
        //TODO
        for(Integer velo : this.velocidade){
            System.out.println("Velocidade:" + velo +  "\n");
        }
        
    }
}