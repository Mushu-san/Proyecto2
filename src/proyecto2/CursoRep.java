package proyecto2;

import java.io.Serializable;


public class CursoRep implements Serializable{
    private String semestre;
    private String nombrecursorp;
    private String codcurso;
    private double zonarp;
    private double examen;
    private String fecharp;

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

        public String getNombrecursorp() {
            return nombrecursorp;
        }

        public void setNombrecursorp(String nombrecursorp) {
            this.nombrecursorp = nombrecursorp;
        }

        public String getCodcurso() {
            return codcurso;
        }

        public void setCodcurso(String codcurso) {
            this.codcurso = codcurso;
        }

        public double getZonarp() {
            return zonarp;
        }

        public void setZonarp(double zonarp) {
            this.zonarp = zonarp;
        }

        public String getFecharp() {
            return fecharp;
        }

        public void setFecharp(String fecharp) {
            this.fecharp = fecharp;
        }
    
    @Override
        public String toString(){
        StringBuilder a = new StringBuilder();
        a.append("Semestre: ").append(semestre);
        a.append(", nombre del curso: ").append(nombrecursorp);
        a.append(", codigo del curso: ").append(codcurso);
        a.append(", zona: ").append(zonarp);
        a.append(", examenFinal nota: ").append(examen);
        a.append(", Fecha de Repruebo: ").append(fecharp);
        return a.toString();
        }
    
    }