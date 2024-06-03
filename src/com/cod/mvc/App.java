package com.cod.mvc;

import com.cod.mvc.Controller.Controller;
import com.cod.mvc.Model.Model;

/**
 * Clase principal
 */
public class App {

    public static void main(String[] args) {
        // Inicializamos la app
        // instanciamos el modelo
        Model miModel = new Model();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");
        miController.crearCoche("Aston Martin", "FGH 3333");

        // Cambiar la velocidad de un coche
        miController.cambiarVelocidad("SBC 1234", 60);
        //bajar la velocidad a la mitad
        miController.bajarVelocidad("SBC 1234", 30);
        //subir la velocidad a 90
        miController.subirVelocidad("SBC 1234", 60);

        // otro cambio de velocidad
        // sobrepasando la velocidad máxima
        miController.cambiarVelocidad("HYU 4567", 150);

    }
}