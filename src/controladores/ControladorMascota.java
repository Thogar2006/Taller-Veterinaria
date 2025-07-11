/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelo.Mascota;

/**
 *
 * @author bossstore
 */
public class ControladorMascota {
    
    private ArrayList <Mascota> mascotas;

    public ControladorMascota(){
        mascotas = new ArrayList<>();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    
    public boolean agregarMascota (Mascota mascota){
        mascotas.add(mascota);
        return true;
    }
    
    public Mascota buscarMascota(int codigo){
        for (int i = 0; i < mascotas.size(); i++) {
            if(mascotas.get(i) != null && codigo == mascotas.get(i).getCodigo()){
                return mascotas.get(i);
            }
        }
        return null;
    }
    
    public boolean elimianrMascota(int codigo ){
        for (int i = 0; i < mascotas.size(); i++) {
            if(mascotas.get(i) != null && mascotas.get(i).getCodigo() == codigo){
                mascotas.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean editarMascota(Mascota mascota){
        Mascota aux = buscarMascota(mascota.getCodigo());
        for (int i = 0; i < mascotas.size(); i++) {
            if(aux != null){
                aux.setNombre(mascota.getNombre());
                aux.setEspecie(mascota.getEspecie());
                return true;
            }
        }
        return false;
    }
    
}
