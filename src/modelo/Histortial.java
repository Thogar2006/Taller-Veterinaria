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

// Neueva clase 
public class Histortial {
    
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> obtenerConsultas() {
        return new ArrayList<>(consultas);
    }
}
