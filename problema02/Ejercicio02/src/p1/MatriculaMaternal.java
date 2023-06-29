package p1;

import p2.TipoMatricula;

public class MatriculaMaternal extends TipoMatricula {
    
    private double costoDesayunos;
    private double costoAlmuerzo;
    private double costoMedico;

    public void establecerCostoDesayunos(double c) {
        costoDesayunos = c;
    }

    public void establecerCostoAlmuerzo(double c) {
        costoAlmuerzo = c;
    }

    public void establecerCostoMedico(double c) {
        costoMedico = c;
    }
    
    @Override
    public void calcularPromedioMatriculas(){
        promedioMatriculas = costoDesayunos + costoAlmuerzo + costoMedico;
    }

    public double obtenerCostoDesayunos() {
        return costoDesayunos;
    }

    public double obtenerCostoAlmuerzo() {
        return costoAlmuerzo;
    }

    public double obtenerCostoMedico() {
        return costoMedico;
    }
    
}