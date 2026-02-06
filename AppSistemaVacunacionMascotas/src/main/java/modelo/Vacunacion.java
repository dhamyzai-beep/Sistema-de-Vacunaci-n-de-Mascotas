/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author fl1pc24
 */
public class Vacunacion {
    public Mascota mascota;
    public String vacuna;
    public String dosis;
    public String fecha;
    public String observaciones;
    
    public Vacunacion(Mascota mascota, String vacuna, String dosis, String fecha, String observaciones){
        this.mascota = mascota;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.fecha = fecha;
        this.observaciones = observaciones;
    }
        
    public Mascota getMascota() { return mascota; }
    public String getVacuna() { return vacuna; }
    public String getDosis() { return dosis; }
    public String getFecha() { return fecha; }
    public String getObservaciones() { return observaciones; }

    public void setVacuna(String vacuna) { this.vacuna = vacuna; }
    public void setDosis(String dosis) { this.dosis = dosis; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
