package com.cod.mvc.Model;

import com.cod.mvc.Controller.Observer;


public interface Observable  {
    // añade un observador
    void addObserver(Observer observer);
    // elimina un observador
    void removeObserver(Observer observer);
    // notifica a los observadores
    void notifyObservers(Coche coche);
}
