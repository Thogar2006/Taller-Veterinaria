/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
/**
 *
 * @author bossstore
 */
public class Consulta {

      private String codigo;
//    private String fecha;
      private LocalDate fecha;
      private Veterinario veterinario;
      
      
    public Consulta(String codigo, LocalDate fecha, Veterinario veterinario) {
        if (fecha.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser futura"); // expecion de no ser una fecha futura
        }
        this.codigo = codigo;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }
    //Metodos de acceso nesesarios
    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void mostrarDetalleConsulta() {
        System.out.println("Consulta Código: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Veterinario: " + veterinario.getNombre() + " | Especialidad: " + veterinario.getEspecialidad());
        System.out.println("--------------------------");
    }
    
}

