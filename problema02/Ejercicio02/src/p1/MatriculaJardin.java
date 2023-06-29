package p1;

import p2.TipoMatricula;

public class MatriculaJardin extends TipoMatricula {
    
    private double costoDesayunos;
    private double costoLibros;
    private double costoPaseos;

    public void establecerCostoDesayunos(double f) {
        
        costoDesayunos = f;
        
    }

    public void establecerCostoLibros(double f) {
        
        costoLibros = f;
        
    }

    public void establecerCostoPaseos(double f) {
        
        costoPaseos = f;
        
    }
    
    @Override
    public void calcularPromedioMatriculas(){
        
        promedioMatriculas = costoDesayunos + costoLibros + costoPaseos;
      
    }

    public double obtenerCostoDesayunos() {
        
        return costoDesayunos;
        
    }

    public double obtenerCostoLibros() {
        
        return costoLibros;
        
    }

    public double obtenerCostoPaseos() {
        
        return costoPaseos;
        
    }
    
}
