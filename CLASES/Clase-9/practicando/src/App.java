import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String fecha1 = "2023-07-22";
        String fecha2 = "2023-12-22";

        System.out.println(diferenciaMayor60Dias(fecha1, fecha2));

    }

    public static boolean diferenciaMayor60Dias(String fechaString1, String fechaString2) {
        LocalDate fecha1 = LocalDate.parse(fechaString1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate fecha2 = LocalDate.parse(fechaString2, DateTimeFormatter.ISO_LOCAL_DATE);

        long diferenciaEnDias = ChronoUnit.DAYS.between(fecha1, fecha2);

        return diferenciaEnDias > 60;
    }

}
