package proyecto2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proyecto2 {
    static Scanner w = new Scanner(System.in);
   
    public static void main(String[] args) throws ClassNotFoundException {
        
        
        
        registro();
        Lectura();
     
        //Este ha sido lo maximo que llegue, no pude llegar sin usar arraylist o list, solo un imitador de eso; 
        //espero poder aprender este tema nuevamente el proximo semestre, ante todo gracias ingeniero;
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    public static void registro(){
        try{
        int dinamic = 0;
        String bool;
        do{
        lista[] coleccion = new lista[dinamic+1];    
        final Estudiante nuevo = new Estudiante();
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
        System.out.println("Total de Cursos Reprobados: ");
        nuevo.setTotalcursosreprobados(Integer.parseInt(w.nextLine()));
        System.out.println("\nIngrese los siguientes datos de los cursos aprobados");
        nuevo.cursosaprobados();
        System.out.println("\nIngrese los siguientes datos de los cursos reprobados");
        nuevo.cursosreprobados();
        
        System.out.println("{ " +nuevo.toString() + " } " + nuevo.getbuenos() + nuevo.getmalos());//el master
        coleccion[dinamic] = new lista(nuevo);
        
        
        
        System.out.println("Desea ingresar un nuevo registro?");
        bool = w.next().toLowerCase();
        
            try (ObjectOutputStream Estu = new ObjectOutputStream(Files.newOutputStream(Paths.get("Estudiantes.prj")))) {
                Estu.writeObject(coleccion[dinamic]);//se guarda el estudiante con todos sus cursos
            } //el segundo try fue recomendacion de netbeans
        dinamic=dinamic + 1;    
     }while("s".equals(bool));
    }
        
        catch(IOException error){
            System.err.println("hubo un error en la matrix: " + error.getMessage());
        }  
        
    }
    
    public static void Lectura() throws ClassNotFoundException{
        try {
            ObjectInputStream Est_list = new ObjectInputStream(Files.newInputStream(Paths.get("Estudiantes.prj")));
            lista nuevo = (lista) Est_list.readObject();
            System.out.println(nuevo);
            System.out.println(Arrays.toString(nuevo.getNuevo().getNuevos()));
            System.out.println(Arrays.toString(nuevo.getNuevo().getPerdidos() ));
            
        } catch (IOException ex) {
            Logger.getLogger(Proyecto2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    }
    
  
}
