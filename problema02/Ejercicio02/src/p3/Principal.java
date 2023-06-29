/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList<TipoMatricula> lista = new ArrayList<>();
        
        MatriculaCampamento mcamp = new MatriculaCampamento(100.2,30.2,90.2);
        lista. add(mcamp);
        
        MatriculaColegio mcolegio = new MatriculaColegio(150.2,140.2, 240.2, 300.4);
        lista. add(mcolegio);
        
        MatriculaEscuela mescuela = new MatriculaEscuela(50.2, 40.2, 140.2, 200.4);
        lista. add(mescuela);
        
        MatriculaJardin mjardin = new MatriculaJardin(50.2, 140.2, 40);
        lista. add(mjardin);
        
        MatriculaMaternal mmaternal = new MatriculaMaternal(50.2,40.2,80.2);
        MatriculaMaternal mmaternal2 = new MatriculaMaternal(55.2, 35.2, 84.9);
        lista. add(mmaternal);
        lista. add(mmaternal2);
        
        for(TipoMatricula m : lista){
        
            m.obtenerPromedioMatriculas();
        
        }
        
        System.out.printf("%s\n", lista);
        
    }
    
}
