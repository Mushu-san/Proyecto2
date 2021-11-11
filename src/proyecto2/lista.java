package proyecto2;

import java.io.Serializable;


public class lista implements Serializable{
    private Estudiante nuevo;

    public lista(Estudiante nuevo) {
        this.nuevo = nuevo;
    }

    public Estudiante getNuevo() {
        return nuevo;
    }

    public void setNuevo(Estudiante nuevo) {
        this.nuevo = nuevo;
    }
    
    
    
    
    
    
    
}
