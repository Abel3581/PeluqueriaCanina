
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void altaCliente(int numCliente, String nombrePerro, String raza, String color, String alergico, String atenEspecial, String nomDueño, int celDueño, String observaciones){
        
        Cliente cli = new Cliente();
        
        cli.setNumCliente(numCliente);
        cli.setNombrePerro(nombrePerro);
        cli.setRaza(raza);
        cli.setColor(color);
        cli.setAlergico(alergico);
        cli.setAtenEspecial(atenEspecial);
        cli.setNomDueño(nomDueño);
        cli.setCelDueño(celDueño);
        cli.setObservaciones(observaciones);
        
        controlPersis.altaCliente(cli);
        
        
    }
}
