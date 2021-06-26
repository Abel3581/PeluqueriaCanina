
package Logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable {
    @Id
    private int numCliente;
    @Basic
    private String nombrePerro;
    private String raza;
    private String color;
    private String alergico;
    private String atenEspecial;
    private String nomDueño;
    private int celDueño;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(int numCliente, String nombrePerro, String raza, String color, String alergico, String atenEspecial, String nomDueño, int celDueño, String observaciones) {
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atenEspecial = atenEspecial;
        this.nomDueño = nomDueño;
        this.celDueño = celDueño;
        this.observaciones = observaciones;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtenEspecial() {
        return atenEspecial;
    }

    public void setAtenEspecial(String atenEspecial) {
        this.atenEspecial = atenEspecial;
    }

    public String getNomDueño() {
        return nomDueño;
    }

    public void setNomDueño(String nomDueño) {
        this.nomDueño = nomDueño;
    }

    public int getCelDueño() {
        return celDueño;
    }

    public void setCelDueño(int celDueño) {
        this.celDueño = celDueño;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

   
    
    
    
}
