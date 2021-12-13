/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public abstract class AbstractNotaHandler implements NotaHandler {
    private NotaHandler notaHandler;
    @Override
    public void setNextHandler(NotaHandler handler) {
        this.notaHandler = handler;
    }
    public void processHandler(int valor) {                
        
        if(valor >= getValorNota()){
            valor = handlerNota(valor);
        }
        if(notaHandler != null && valor>0){
            this.notaHandler.processHandler(valor);
        }
        
    }
    protected abstract int getValorNota();
    protected abstract int handlerNota(int valor);
}


