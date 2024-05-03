package cod.mvc;

import java.util.ArrayList;

public class Model {

    ArrayList<Coche> parking = new ArrayList<>();

    public Coche crearCoche (String matricula, String modelo, Integer velocidad){
        Coche aux = null;
        aux.setMatricula(matricula);
        aux.setModelo(modelo);
        aux.setVelocidad(velocidad);
        parking.add(new Coche(aux.getMatricula(),aux.getModelo(),aux.getVelocidad()));
        return aux;
    }

}
