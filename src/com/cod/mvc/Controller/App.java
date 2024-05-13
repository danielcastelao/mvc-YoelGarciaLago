package com.cod.mvc.Controller;
//
import com.cod.mvc.Model.Model;

public class App {

    public void creacionCoche() {
        Model.crearCoche("wawa","wawa",33);
    }

    public void mostrarCoche() {
        Model.getCoche("wawa");
    }
}
