import cod.mvc.Coche;
import cod.mvc.View;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cod.mvc.Model;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class View_test {
@Test
    public void pruebaMuestreoTest(){
    Model.crearCoche("wawa","seat",33);
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    PrintStream printStream1 = System.out;
    System.setOut(printStream);
    View.muestraVelocidad("wawa");
    System.out.flush();
    System.setOut(printStream1);
    String output = outputStream.toString();
    System.out.println(output);
    Assertions.assertEquals(output.trim(),"33");

}

}
