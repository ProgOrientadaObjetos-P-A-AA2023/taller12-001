package p2;

public abstract class TipoMatricula {
    
    protected double promedioMatriculas;
    
    public abstract void calcularPromedioMatriculas();
    
    public double obtenerPromedioMatriculas(){
        
        return promedioMatriculas;
        
    }
    
}
