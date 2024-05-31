package com.cod.mvc.View;

import com.cod.mvc.Model.Model;

public class View {

    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;

        }

    /**
     *
     * @param list lista con todos los parámetros del coche que quieres mostrar
     */
    public static void mostrarTodo(String[] list){
        System.out.println("Datos del coche:\nMatricula: " + list[0] + "\nVelocidad: " + list[2] + "\nModelo: " + list[1]);
    }

    public static void mensajeNulo(){
        System.out.println("No existe el coche :p");
    }
    }
