package cod.mvc;

public class View {

    public static void muestraVelocidad(String matricula){
        System.out.println(Model.getVelocidad(matricula));
    }
}
