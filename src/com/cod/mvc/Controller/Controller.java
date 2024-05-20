package com.cod.mvc.Controller;
import com.cod.mvc.Model.Model;
import com.cod.mvc.Model.Coche;
import com.cod.mvc.View.View;

public class Controller {

    private final Model miModel;

    public Controller(Model miModel) {
        this.miModel = miModel;
        
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModel.addObserver(observoVelocidad);
    }

    public static void main(String [] args){

    Model.crearCoche("LaFerrari", "SBC 1234");
    Model.crearCoche("Alpine", "HYU 4567");
    Model.crearCoche("Aston Martin", "FGH 3333");

    Coche ferrari = Model.getCoche("SBC 1234");
    // modifica la velocidad
    Model.cambiarVelocidad("SBC 1234", 30);
    boolean hecho = View.muestraVelocidad("SBC 1234", Model.getVelocidad("SBC 1234"));

    System.out.println(hecho);
}

}
