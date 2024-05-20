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

        ObserverLimite observoLimite = new ObserverLimite();
        miModel.addObserver(observoLimite);
    }

    public void crearCoche(String laFerrari, String s) {
        miModel.crearCoche(laFerrari,s);
    }

    public void cambiarVelocidad(String s, Integer i) {
        miModel.cambiarVelocidad(s,i);
    }
}
