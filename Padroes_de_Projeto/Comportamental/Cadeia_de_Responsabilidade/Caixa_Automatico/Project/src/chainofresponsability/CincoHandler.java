package chainofresponsability;

import javax.swing.JOptionPane;

public class CincoHandler extends AbstractNotaHandler {
    
    public static final int CINCO = 5;
    @Override
    protected int handlerNota(int valor){
        int numNotas = valor/CINCO;
        int valorRestante = valor - (numNotas * CINCO);
        JOptionPane.showMessageDialog(null, "Retiradas " + numNotas + " nota(s) de cinco.");
        return valorRestante;
    }
    
    @Override
    protected int getValorNota() {
        return CINCO;
    }
}
