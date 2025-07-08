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
      
      
    public Consulta(String codigo, Veterinario veterinario) {
//        if (fecha.isAfter(LocalDate.now())) {
//            System.out.println("Fecha futura detectada. Se usará la fecha actual.");
//            this.fecha = LocalDate.now();
//        } else {
//            this.fecha = fecha;
//        }
        this.fecha = LocalDate.now();
        this.codigo = codigo;
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

