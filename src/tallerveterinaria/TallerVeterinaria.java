/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerveterinaria;

import java.time.LocalDate;
import java.util.Scanner;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Propietario;
import modelo.Veterinario;

/**
 *
 * @author bossstore
 */
public class TallerVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Datos del propietario
        System.out.print("Nombre del propietario: ");
        String nombreProp = sc.nextLine();

        System.out.print("Documento: ");
        String doc = sc.nextLine();

        System.out.print("Teléfono: ");
        String tel = sc.nextLine();

        Propietario propietario = new Propietario(nombreProp, doc, tel);

        System.out.print("¿Cuántas mascotas desea registrar? ");
        int cantidadMascotas = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cantidadMascotas; i++) {
            System.out.println("--- Mascota #" + (i + 1) + " ---");

            System.out.print("Nombre: ");
            String nombreMascota = sc.nextLine();

            System.out.print("Especie: ");
            String especie = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            Mascota mascota = new Mascota(nombreMascota, especie, edad);

            System.out.print("¿Cuántas consultas tiene esta mascota? ");
            int cantidadConsultas = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < cantidadConsultas; j++) {
                System.out.println("  -> Consulta #" + (j + 1));

                System.out.print("  Código: ");
                String codigo = sc.nextLine();

//              System.out.println("Fecha (dd/mm/yyyy)");
//              String fecha = sc.nextLine();
//              sc.nextLine();

                System.out.print("  Fecha (YYYY-MM-DD): ");
                LocalDate fecha = LocalDate.parse(sc.nextLine());

                System.out.print("  Nombre del veterinario: ");
                String nombreVet = sc.nextLine();

                System.out.print("  Especialidad: ");
                String especialidad = sc.nextLine();

                Veterinario vet = new Veterinario(nombreVet, especialidad);
                Consulta consulta = new Consulta(codigo, fecha, vet);
                mascota.agregarConsulta(consulta);
            }

            propietario.agregarMascota(mascota);
        }

        // Mostrar toda la información
        System.out.println();
        propietario.mostrarInformacionCompleta();

        sc.close();
    }
    
}
