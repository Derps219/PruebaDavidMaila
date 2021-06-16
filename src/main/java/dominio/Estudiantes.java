package dominio;

public class Estudiantes {
private String genero;
    private int nombre;
    private double calificaciones;

    public Estudiantes(String genero, int nombre, double califocaciones) {
        this.genero = genero;
        this.nombre = nombre;
        this.calificaciones = califocaciones;
    }

    public String getMarca() {
        return genero;
    }

    public int getAnioFab() {
        return nombre;
    }

    public double getPrecio() {
        return calificaciones;
    }
    
   
}    