/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author bossstore
 */


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private ArrayList<Consulta> consultas;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
//        this.edad = edad;
        this.consultas = new ArrayList<>();   
    }
    
    //Expesion de que no puede ser una edad negativa
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void mostrarHistorial() {
        System.out.println("📋 Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
        System.out.println("Historial de consultas:");
        for (int i = 0; i < consultas.size(); i++) {
            consultas.get(i).mostrarDetalleConsulta();
        }
    }
    
    // Métodos de acceso agregados
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }
}
