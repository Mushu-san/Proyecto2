package proyecto2;

import java.io.Serializable;


public class Estudiante implements Serializable{
    String Nombres;
    String Apellidos;
    String Carne;
    int Edad;
    String  Sexo;
    String  Carrera;
    int Totalcreditos;
    int Totalcursosaprobados;
    int Totalcursosreprobados;
    CursoAp[] cursosap;

    

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setCarne(String Carne) {
        this.Carne = Carne;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public void setTotalcreditos(int Totalcreditos) {
        this.Totalcreditos = Totalcreditos;
    }

    public void setTotalcursosaprobados(int Totalcursosaprobados) {
        this.Totalcursosaprobados = Totalcursosaprobados;
    }

    public void setTotalcursosreprobados(int Totalcursosreprobados) {
        this.Totalcursosreprobados = Totalcursosreprobados;
    }

  

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getCarne() {
        return Carne;
    }

    public int getEdad() {
        return Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public int getTotalcreditos() {
        return Totalcreditos;
    }

    public int getTotalcursosaprobados() {
        return Totalcursosaprobados;
    }

    public int getTotalcursosreprobados() {
        return Totalcursosreprobados;
    }
    
    
    
   
    public static class CursoAp implements Serializable{
    String semestre;
    String nombrecursoap;
    String codcurso;
    double zonaap;
    double examen;
    String fechaap;

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
    
    
    
    
    public static class CursoRep implements Serializable{
    String semestre;
    String nombrecursorp;
    String codcurso;
    double zonarp;
    double examen;
    String fecharp;

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
    
    @Override
    public String toString(){
        StringBuilder g = new StringBuilder();
        g.append("nombres: ").append(Nombres).append(", apellidos: ").append(Apellidos).append(", Carne: ").append(Carne);
        g.append(", edad: " ).append(Edad).append(", Sexo: ").append(Sexo).append(" Carrera: ").append(Carrera).append(", Total Creditos: ").append(Totalcreditos).append(", CantidadCursosAprobados").append(Totalcursosaprobados).append(", TotalCursosReprobados: ").append(Totalcursosreprobados);
        return g.toString();
    }
    
}
