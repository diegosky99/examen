package co.com.udem.model;

public class Lechugas extends Plantas {
    private String nombre;
    private String color;
    private int edad;

    public Lechugas(String reino, String nombre, String color, int edad) {
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
        String aux = "{\"Lechugas\":\n"
                + "        \"Nombre\":\n"
                + "        \"" + super.getNombre() + "\",\n"
                + "        \"Reino\":\n"
                + "        \"" + super.getReino() + "\",\n"
                + "        \"Color\":\n"
                + "        \"" + super.getColor() + "\",\n"
                + "        \"Vida\":\n"
                + "        \"" + super.getEdad() + "\",\n"
                + "    }\n"
                + "}";
        return aux;
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
