package integrador;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Creamos instancias de clase
        Gerente gerente = new Gerente("Laura", 5000);
        Desarrollador desarrollador = new Desarrollador("Juan", 4000);
        Analista analista = new Analista("María", 3500);

        // Utilizamos polimorfismo
        gerente.trabajar();
        desarrollador.trabajar();
        analista.trabajar();

        // Evaluar desempeño (solo disponible para gerente)
        gerente.revisarDesempeño();

        // Utilizamos Singleton RegistroEmpleados
        RegistroEmpleados registro = RegistroEmpleados.obtenerInstancia();
        registro.agregarEmpleado();
        System.out.println(registro.getCantidadEmpleados());

        analista.testSingleton();

        System.out.println(registro.getCantidadEmpleados());

    }

}
