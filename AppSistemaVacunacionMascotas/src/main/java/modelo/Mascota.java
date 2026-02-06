/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Mascota {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String sexo;
    private Dueño dueño;

    public Mascota(String nombre, String especie, String raza, int edad, String sexo, Dueño dueño) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Dueño getDueño() {
        return dueño;
    }

    @Override
    public String toString() {
        return nombre + " - " + especie;
    }
}

