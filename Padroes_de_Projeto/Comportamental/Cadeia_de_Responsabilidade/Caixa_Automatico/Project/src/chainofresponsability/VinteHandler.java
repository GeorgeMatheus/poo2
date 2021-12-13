/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import javax.swing.JOptionPane;

public class VinteHandler extends AbstractNotaHandler {
    public static final int VINTE = 20;
    @Override
    protected int handlerNota(int valor){
        int numNotas = valor/VINTE;
        int valorRestante = valor - (numNotas * VINTE);
        JOptionPane.showMessageDialog(null, "Retiradas " + numNotas + " nota(s) de vinte.");
        return valorRestante;
    }
    
    @Override
    protected int getValorNota() {
        return VINTE;
    }
}
