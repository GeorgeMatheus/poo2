
package chainofresponsability;

import java.util.List;


public interface NotaHandler {    
    public void setNextHandler(NotaHandler handler);
    public void processHandler(int valor);    
}
