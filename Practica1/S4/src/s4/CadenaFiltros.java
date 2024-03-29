/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class CadenaFiltros {
    
    private ArrayList<Filtro> filtros = new ArrayList<>();
    
    double ejecutar(double revoluciones, EstadoMotor estado){
        for (Filtro f : filtros){
            revoluciones = f.ejecutar(revoluciones, estado);
        }
        return revoluciones;
    }
    
    void añadeFiltro(Filtro filtro){
        filtros.add(filtro);
    }
    
}
