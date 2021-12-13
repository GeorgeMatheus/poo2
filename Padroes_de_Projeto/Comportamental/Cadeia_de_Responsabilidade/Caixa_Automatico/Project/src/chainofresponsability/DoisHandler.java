package chainofresponsability;

import javax.swing.JOptionPane;

public class DoisHandler extends AbstractNotaHandler {
    public static final int DOIS = 2;
    @Override
    protected int handlerNota(int valor){
        int numNotas = valor/DOIS;
        int valorRestante = valor - (numNotas * DOIS);
        JOptionPane.showMessageDialog(null, "Retiradas " + numNotas + " nota(s) de dois.");
        return valorRestante;
    }
    
    @Override
    protected int getValorNota() {
        return DOIS;
    }
}
