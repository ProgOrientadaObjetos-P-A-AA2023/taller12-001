package p1;

import p2.TipoMatricula;


public class MatriculaCampamento extends TipoMatricula {
    private double costoTransporte;
    private double costoComida;
    private double costoInstructores;
    
    @Override
    public void calcularPromedioMatriculas(){
        promedioMatriculas = costoTransporte + costoComida + 
                costoInstructores;
        
    }
    
    
    public double obtenerCostoTransporte() {
        return costoTransporte;
    }
    
    public double obtenerCostoComida() {
        return costoComida;
    }
    
    public double obtenerCostoInstructores() {
        return costoInstructores;
    }
    
    public void establecerCostoTransporte(double x) {
        costoTransporte = x;
    }
    
    public void establecerCostoComida(double x) {
        costoComida = x;
    }
    
    public void establecerCostoInstructores(double x) {
        costoInstructores = x;
    }
        
    
}
