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


public class Propietario {
    private String nombre;
    private String documento;
    private String telefono;
    private ArrayList<Mascota> mascotas;

    public Propietario(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

//    public void mostrarInformacionCompleta() {
//        System.out.println("===== FICHA CLÍNICA =====");
//        System.out.println("Propietario: " + nombre);
//        System.out.println("Documento: " + documento);
//        System.out.println("Teléfono: " + telefono);
//        System.out.println();
//
//        for (int i = 0; i < mascotas.size(); i++) {
//            mascotas.get(i).mostrarHistorial();
//            System.out.println();
//        }
//    }
    
    // Métodos de acceso agregados
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Mascota> getMascotas() {
        return new ArrayList<>(mascotas);
    }
}

