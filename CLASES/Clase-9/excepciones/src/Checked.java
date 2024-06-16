import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Checked {

    public static class TestException {
        public static void handleFile() throws FileNotFoundException {
            File archivo = new File("archivo_que_no_existe.txt");
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        }
    }

    // Connection conexion =
    // DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_basededatos",
    // "usuario",
    // "contraseña");
    // Statement consulta = conexion.createStatement();
    // ResultSet resultado = consulta.executeQuery("SELECT * FROM
    // tabla_que_no_existe");
    // while (resultado.next()) {
    // System.out.println(resultado.getString("columna"));
    // }
    // conexion.close();

    public static class TestExceptionUnchecked {
        public static void handleArray() {
            String[] arrayString = new String[3];

            for (int i = 0; i < arrayString.length + 1; i++) {
                System.out.println(arrayString[i]);
            }
        }
    }

    public static void main(String[] args) {
        /*
         * Chequeada
         */
        // TestException.handleFile();
        /*
         * No chequeada
         */
        // TestExceptionUnchecked.handleArray();

        try {
            String numeroString = "123";
            // System.out.println("Número entero: " + numeroEntero);
            testExcepcionCustomizada(numeroString);

            int numeroEntero = Integer.parseInt(numeroString);
            System.out.println("La variable no contiene letras, se convirtio a numero con exito: " + numeroEntero);

        } catch (ExcepcionCustomizada e) {
            System.err.println("Error controlado: " + e.getLocalizedMessage());
        }
    }

    public static void testExcepcionCustomizada(String texto) throws ExcepcionCustomizada {
        if (texto.matches(".*[a-zA-Z].*")) {
            throw new ExcepcionCustomizada("El texto contiene letras, no se puede convertir en numero");
        }
    }

}
