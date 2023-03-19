package tema5_ej20;

import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public interface EmpresaPaqueteria {
    public void registrarPedido();
    
    public List<Transportista> getTransportistas();
    
    void enviarPaquetes();
}
