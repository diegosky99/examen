package co.com.udem.model;

public abstract class Plantas implements Clasificacion {
    private String reino;
    private String nombre;
    private String color;
    private int edad;

    public Plantas(String reino, String nombre, String color, int edad) {
        this.reino = reino;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
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
}
