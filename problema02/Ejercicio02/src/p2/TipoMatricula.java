/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public abstract class TipoMatricula {
    
    protected double promedioMatriculas;
    
    public abstract void calcularPromedioMatriculas();
    
    public double obtenerPromedioMatriculas(){
        
        return promedioMatriculas;
        
    }
    
}
