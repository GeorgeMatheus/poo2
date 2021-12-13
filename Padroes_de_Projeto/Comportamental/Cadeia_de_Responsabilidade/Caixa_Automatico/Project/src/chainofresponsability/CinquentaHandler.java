/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

import javax.swing.JOptionPane;

public class CinquentaHandler extends AbstractNotaHandler {
    public static final int CINQUENTA = 50;
    @Override
    protected int handlerNota(int valor){
        int numNotas = valor/CINQUENTA;
        int valorRestante = valor - (numNotas * CINQUENTA);
        JOptionPane.showMessageDialog(null, "Retiradas " + numNotas + " nota(s) de cinquenta.");
        return valorRestante;
    }
    
    @Override
    protected int getValorNota() {
        return CINQUENTA;
    }
}
