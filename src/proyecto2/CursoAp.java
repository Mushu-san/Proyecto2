package proyecto2;

import java.io.Serializable;


public class CursoAp implements Serializable{
    private String semestre;
    private String nombrecursoap;
    private String codcurso;
    private double zonaap;
    private double examen;
    private String fechaap;

        public CursoAp() {
        }

        public double getExamen() {
            return examen;
        }

        public void setExamen(double examen) {
            this.examen = examen;
        }

        public String getSemestre() {
            return semestre;
        }

        public void setSemestre(String semestre) {
            this.semestre = semestre;
        }
    

        

        public String getNombrecursoap() {
            return nombrecursoap;
        }

        public void setNombrecursoap(String nombrecursoap) {
            this.nombrecursoap = nombrecursoap;
        }

        public String getCodcurso() {
            return codcurso;
        }

        public void setCodcurso(String codcurso) {
            this.codcurso = codcurso;
        }

        public double getZonaap() {
            return zonaap;
        }

        public void setZonaap(double zonaap) {
            this.zonaap = zonaap;
        }

        public String getFechaap() {
            return fechaap;
        }

        public void setFechaap(String fechaap) {
            this.fechaap = fechaap;
        }
    
        @Override
        public String toString(){
        StringBuilder a = new StringBuilder();
        a.append("Semestre: ").append(semestre);
        a.append(", nombre del curso: ").append(nombrecursoap);
        a.append(", codigo del curso: ").append(codcurso);
        a.append(", zona: ").append(zonaap);
        a.append(", examenFinal nota: ").append(examen);
        a.append(", Fecha de Aprobacion: ").append(fechaap);
        return a.toString();
        }
        
    }