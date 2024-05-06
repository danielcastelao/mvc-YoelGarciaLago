import cod.mvc.Coche;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cod.mvc.Model;
import org.junit.jupiter.params.provider.EnumSource;


import static org.junit.jupiter.api.Assertions.*;

public class Model_test {
@Test
    public void crearCoches(){
    Model.crearCoche("AB33","Seat",33);

}

@Test
    public void cocheCreado(){
        Coche coche = new Coche("AB33", "Seat", 33);
        Model.crearCoche(coche.getMatricula(),coche.getModelo(),coche.getVelocidad());
        Assertions.assertNotNull(coche);
}

@Test
    public void cambiarVelocidad(){
    Model.crearCoche("AB33","Seat",33);
    Model.cambiarVelocidad("AB33",10);
    Assertions.assertEquals(10,Model.getVelocidad("AB33"));
}

@Test
    public void verVelocidad(){
    Model.crearCoche("AB33","Seat",33);
    assertEquals(33,Model.getVelocidad("AB33"));
}
@Test
    public void verCoche(){

    Coche coche = new Coche("AB33","Seat",33);
    Model.crearCoche(coche.getMatricula(),coche.getModelo(),coche.getVelocidad());
    Assertions.assertEquals(coche.getMatricula(),Model.getCoche("AB33").getMatricula());
}
}
