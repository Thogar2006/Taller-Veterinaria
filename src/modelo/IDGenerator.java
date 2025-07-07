/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bossstore
 */

// clase para generar codigos unicos 
public class IDGenerator {
    
    private static int contador = 0;

    public static String generarCodigo() {
        contador++;
        return "C" + String.format("%03d", contador);
    }
}
