package chainofresponsability;

import javax.swing.JOptionPane;

public class DezHandler extends AbstractNotaHandler{
    
    public static final int DEZ = 10;
    @Override
    protected int handlerNota(int valor){
        int numNotas = valor/DEZ;
        int valorRestante = valor - (numNotas * DEZ);
        JOptionPane.showMessageDialog(null, "Retiradas " + numNotas + " nota(s) de dez.");
        return valorRestante;
    }
    
    @Override
    protected int getValorNota() {
        return DEZ;
    }
}
