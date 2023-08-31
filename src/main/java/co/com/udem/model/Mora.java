package co.com.udem.model;

public class Mora extends Plantas {
    private String nombre;
    private String color;
    private int edad;

    public Mora(String reino, String nombre, String color, int edad) {
        super(reino, nombre, color, edad);
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mora{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public String color() {
        return null;
    }

    @Override
    public int edad() {
        return 0;
    }
}
