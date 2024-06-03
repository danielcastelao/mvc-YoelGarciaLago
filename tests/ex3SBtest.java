import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.cod.mvc.Model.Model;

public class ex3SBtest {


    @Test
    public void pruebaSubirVelocidad(){
        Model model = new Model();
        model.crearCoche("toyota","ABCD 3");
        model.cambiarVelocidad("ABCD 3", 100);
        model.subirVelocidad("ABCD 3", 50);
        Assertions.assertEquals(150,model.getVelocidad("ABCD 3"));
    }

    @Test
    public void pruebaBajarVelocidad(){
        Model model = new Model();
        model.crearCoche("toyota","ABCD 3");
        model.cambiarVelocidad("ABCD 3", 100);
        model.bajarVelocidad("ABCD 3", 50);
        Assertions.assertEquals(50,model.getVelocidad("ABCD 3"));
    }


    @Test
    public void pruebaSubirYBajarVelocidad(){
        Model model = new Model();
        model.crearCoche("jaguar","1234 F");
        model.cambiarVelocidad("1234 F", 90);
        model.bajarVelocidad("1234 F", 40);
        model.subirVelocidad("1234 F",50);
        Assertions.assertEquals(100,model.getVelocidad("1234 F"));
    }
}
