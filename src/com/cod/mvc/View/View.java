package com.cod.mvc.View;

import com.cod.mvc.Model.Model;

public class View {

    public static void muestraVelocidad(String matricula){
        System.out.println(Model.getVelocidad(matricula));
    }
}
