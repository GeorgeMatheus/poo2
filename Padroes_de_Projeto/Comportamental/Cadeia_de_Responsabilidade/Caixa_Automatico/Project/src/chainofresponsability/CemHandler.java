package chainofresponsability;

import java.util.List;
import javax.swing.JOptionPane;

public class CemHandler extends AbstractNotaHandler{
    
    public static final int CEM = 100;
    @Override
    protected int handlerNota(int valor){
        int numNotas = valor/CEM;
        int valorRestante = valor - (numNotas * CEM);
        JOptionPane.showMessageDialog(null, "Retiradas " + numNotas + " nota(s) de cem.");
        return valorRestante;
    }
    
    @Override
    protected int getValorNota() {
        return CEM;
    }

}
