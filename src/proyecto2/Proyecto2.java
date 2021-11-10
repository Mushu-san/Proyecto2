package proyecto2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Scanner;

public class Proyecto2 {
    static Scanner w = new Scanner(System.in);
   
    public static void main(String[] args) throws ClassNotFoundException {
     
        registro();
     
     
     
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    public static void registro(){
        try{   Estudiante nuevo = new Estudiante();
        String curvisa = "";
        String curvisre = "";
        System.out.println("Bienvenido al Registro de datos");
        System.out.println("Ingrese los siguientes datos del estudiante: ");
        System.out.println("\nNombres: ");
        nuevo.setNombres(w.nextLine());
        System.out.println("Apellidos: ");
        nuevo.setApellidos(w.nextLine());
        System.out.println("Carnet: ");
        nuevo.setCarne(w.nextLine());
        System.out.println("Edad: ");
        nuevo.setEdad(Integer.parseInt(w.nextLine().trim()));
        System.out.println("Sexo: ");
        nuevo.setSexo(w.nextLine());
        System.out.println("carrera");
        nuevo.setCarrera(w.nextLine());
        System.out.println("Total de Creditos Obtenidos: ");
        nuevo.setTotalcreditos(Integer.parseInt(w.nextLine()));
        System.out.println("Total de Cursos Aprobados: ");
        nuevo.setTotalcursosaprobados(Integer.parseInt(w.nextLine()));
        final int N = nuevo.getTotalcursosaprobados();//consigo el dato para el iterador y lo meto en una variable para no confundirme tanto
        System.out.println("Total de Cursos Reprobados: ");
        nuevo.setTotalcursosreprobados(Integer.parseInt(w.nextLine()));
        final int M = nuevo.getTotalcursosreprobados();
        System.out.println("\nIngrese los siguientes datos de los cursos aprobados");
        Estudiante.CursoAp[] cursoap = new Estudiante.CursoAp[N];//se crea un array de cursos aprobados dentro del objeto nuevo
        for (int i = 0; i < N ; i++) {
            cursoap[i] = new Estudiante.CursoAp();
            System.out.println("semestre al que pertenece el curso: ");
            cursoap[i].setSemestre(w.nextLine());
            System.out.println("nombre del curso: ");
            cursoap[i].setNombrecursoap(w.nextLine());
            System.out.println("codigo del curso");
            cursoap[i].setCodcurso(w.nextLine());
            System.out.println("Zona obtenida por el estudiante: ");
            cursoap[i].setZonaap(Double.valueOf(w.nextLine()));
            System.out.println("Nota de examen final obtenida por el estudiante: ");
            cursoap[i].setExamen(Double.valueOf(w.nextLine()));
            System.out.println("Fecha de aprobacion del alumno: ");
            cursoap[i].setFechaap(w.nextLine());
        }
        System.out.println("\nIngrese los siguientes datos de los cursos reprobados");
        Estudiante.CursoRep[] cursoreprobado = new Estudiante.CursoRep[M];
        for (int i = 0; i < M ; i++) {//misma operacion solo que con reprobados
            cursoreprobado[i] = new Estudiante.CursoRep();
            System.out.println("semestre al que pertenece el curso: ");
            cursoreprobado[i].setSemestre(w.nextLine());
            System.out.println("nombre del curso: ");
            cursoreprobado[i].setNombrecursorp(w.nextLine());
            System.out.println("codigo del curso");
            cursoreprobado[i].setCodcurso(w.nextLine());
            System.out.println("Zona obtenida por el estudiante: ");
            cursoreprobado[i].setZonarp(Double.valueOf(w.nextLine()));
            System.out.println("Nota de examen final obtenida por el estudiante: ");
            cursoreprobado[i].setExamen(Double.valueOf(w.nextLine()));
            System.out.println("Fecha En que se reprobo: ");
            cursoreprobado[i].setFecharp(w.nextLine());
        }
        for (int i = 0; i < N; i++) {
            curvisa = curvisa+ "{ " + cursoap[i].toString() + " }";
        }
        for (int i = 0; i < M; i++) {
            curvisre = curvisre + "{ " + cursoreprobado[i].toString() + " }";
        }
        System.out.println("{ " +nuevo.toString() + " } " + curvisa + curvisre);
        
        ObjectOutputStream Estu = new ObjectOutputStream(Files.newOutputStream(Paths.get("Estudiantes.txt")));
        Estu.writeObject(nuevo);
        for (int i = 0; i < N; i++) {
            Estu.writeObject(cursoap[i]);
        }
        for (int i = 0; i < M; i++) {
            Estu.writeObject(cursoreprobado[i]);
        }
        Estu.close();
        
        
        
    }
        
        catch(IOException error){
            System.err.println("hubo un error en la matrix: " + error.getMessage());
        }  
        
    }
    
    
    
  
}
