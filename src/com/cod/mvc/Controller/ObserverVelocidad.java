package com.cod.mvc.Controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;
import com.cod.mvc.View.View;

public class ObserverVelocidad implements Observer {
    /**
     * Este método es llamado siempre que hay un cambio
     * El observable cuando hace el notifyObservers
     * 'dispara' todos los update de los Observers
     *
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Coche arg, Model model) {
        System.out.println("[ObserverVelocidad] Se ha cambiado la velocidad: " + arg.velocidad.toString() + "km/hr");
        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.matricula, arg.velocidad);

        // tambien tenemos acceso al observable en este método,
        // es decir el com.cod.mvc.model.Model
        // por lo tanto tenemos acceso a 'parking'
        /*for (Coche coche : ((com.cod.mvc.model.Model) o).parking) {
            System.out.println(coche.matricula);
        }*/

    }
}