package proyecto2;

import java.io.Serializable;
import static proyecto2.Proyecto2.w;


public class Estudiante implements Serializable{
    private String Nombres;
    private String Apellidos;
    private String Carne;
    private int Edad;
    private String  Sexo;
    private String  Carrera;
    private int Totalcreditos;
    private int Totalcursosaprobados;
    private int Totalcursosreprobados;
    private CursoAp[] nuevos = new CursoAp[getTotalcursosaprobados()];
    private CursoRep[] perdidos = new CursoRep[getTotalcursosreprobados()];
    private String curvisa = "";
    private String curvisre = "";
    
    
    public CursoAp[] getNuevos() {
        return nuevos;
    }

    public CursoRep[] getPerdidos() {
        return perdidos;
    }
    
    
    
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
    
    
    
    
    public void cursosaprobados(){
        nuevos = new CursoAp[getTotalcursosaprobados()];//esta onda es para hacerle un override al valor del variable, rellamando al total cursos aprobados
        for (int i = 0; i < getTotalcursosaprobados() ; i++) {//mando a llamar al metodo que determina el ancho de mi array mas arriba
            nuevos[i] = new CursoAp();
            System.out.println("semestre al que pertenece el curso: ");
            nuevos[i].setSemestre(w.nextLine());
            System.out.println("nombre del curso: ");
            nuevos[i].setNombrecursoap(w.nextLine());
            System.out.println("codigo del curso");
            nuevos[i].setCodcurso(w.nextLine());
            System.out.println("Zona obtenida por el estudiante: ");
            nuevos[i].setZonaap(Double.valueOf(w.nextLine()));
            System.out.println("Nota de examen final obtenida por el estudiante: ");
            nuevos[i].setExamen(Double.valueOf(w.nextLine()));
            System.out.println("Fecha de aprobacion del alumno: ");
            nuevos[i].setFechaap(w.nextLine());
        }
    }
    
    public void cursosreprobados(){
        perdidos = new CursoRep[getTotalcursosreprobados()];
    for (int i = 0; i < getTotalcursosreprobados() ; i++) {//misma operacion solo que con reprobados
            perdidos[i] = new CursoRep();
            System.out.println("semestre al que pertenece el curso: ");
            perdidos[i].setSemestre(w.nextLine());
            System.out.println("nombre del curso: ");
            perdidos[i].setNombrecursorp(w.nextLine());
            System.out.println("codigo del curso");
            perdidos[i].setCodcurso(w.nextLine());
            System.out.println("Zona obtenida por el estudiante: ");
            perdidos[i].setZonarp(Double.valueOf(w.nextLine()));
            System.out.println("Nota de examen final obtenida por el estudiante: ");
            perdidos[i].setExamen(Double.valueOf(w.nextLine()));
            System.out.println("Fecha En que se reprobo: ");
            perdidos[i].setFecharp(w.nextLine());
        }
    }

    public String getbuenos(){
    for(CursoAp nu: nuevos){
        curvisa = curvisa+ "{ " + nu.toString() + " }";
    }
    
    
    return curvisa;
    }
    
    public String getmalos(){
    for(CursoRep metal: perdidos){
        curvisre = curvisre + "{ " + metal.toString() + " }";
    }
    return curvisre;
    }
   
    
    
    
    
    
    
    
    @Override
    public String toString(){
        StringBuilder g = new StringBuilder();
        g.append("nombres: ").append(Nombres).append(", apellidos: ").append(Apellidos).append(", Carne: ").append(Carne);
        g.append(", edad: " ).append(Edad).append(", Sexo: ").append(Sexo).append(" Carrera: ").append(Carrera).append(", Total Creditos: ").append(Totalcreditos).append(", CantidadCursosAprobados").append(Totalcursosaprobados).append(", TotalCursosReprobados: ").append(Totalcursosreprobados);
        return g.toString();
    }
    
}
