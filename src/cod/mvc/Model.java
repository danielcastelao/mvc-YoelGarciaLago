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

    public Coche getCoche(String matricula){
        Coche aux = null;
        for(int i = 0; i < parking.size(); i++){
            if(parking.get(i).getMatricula().equals(matricula)){
                aux = parking.get(i);
                break;
            }
        }
        return aux;
    }

    public void cambiarVelocidad(String matricula, Integer velocidad){
        for (int i = 0; i < parking.size(); i++){
            if(parking.get(i).getMatricula().equals(matricula)){
                parking.get(i).setVelocidad(parking.get(i).getVelocidad()+velocidad);
                break;
            }
        }
    }

    public Integer getVelocidad(String matricula){
        Integer aux = null;
        for (int i = 0; i < parking.size(); i++){
            if(parking.get(i).getMatricula().equals(matricula)){
                aux =  parking.get(i).getVelocidad();
            }
        }
        return aux;
    }
}

