package cod.mvc;

public class App {

    public void creacionCoche(){
        Model.crearCoche("wawa","seat",33);
    }

    public void mostrarCoche(){
        View.muestraVelocidad("wawa");
    }

}
