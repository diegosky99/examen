package co.com.udem.view;

import java.util.ArrayList;
import java.util.List;
import co.com.udem.model.Zanahoria;
import co.com.udem.model.Lechugas;
import co.com.udem.model.Mora;
import co.com.udem.model.Clasificacion;

public class Vista {

    public  static void main(String[] args) {
        List<Clasificacion> lista = new ArrayList<>();

        lista.add(new Mora("fruta", "mora", "morado", 6));
        lista.add(new Zanahoria("verdura", "Zanahoria", "naranja", 3));
        lista.add(new Lechugas("verdura", "lechuga", "verde", 1));
        lista.add(new Lechugas("verdura", "repollo", "verde", 1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
    public void mostrarDatos() {
    }

}
