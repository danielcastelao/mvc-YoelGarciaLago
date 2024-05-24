package com.cod.mvc.Controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;

/**
 * Otro observador que se suscribe a los cambios de velocidad de un coche
 */
public class ObserverLimite implements Observer {
    // velocidad máxima
    final static int LIMITE = 120;
    /**
     * Este es el observador de limite de velocidad
     * @param coche Coche al que se le actualizó la velocidad
     */
    @Override
    public void update(Coche coche, Model model) {
        // verificamos veloidad máxima
        if (coche.velocidad > LIMITE) {
            // avisamos de una infracción
            System.out.println("[ObserverLimite] INFRACCION");
            model.cambiarVelocidad(coche.getMatricula(), coche.velocidad - 10);

        }
    }
}