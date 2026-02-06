/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author fl1pc24
 */
public class Dueño {
    public String nombre;
    public String cedula;
    public String telefono;
    public String direccion;
    
    public Dueño(String nombre, String cedula, String telefono, String direccion) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.telefono = telefono;
    this.direccion = direccion;
}

    
    public String toString(){
        return nombre;
    }
}
