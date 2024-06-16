import java.beans.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Checked {

    public static void main(String[] args) {

        // try {
        // File archivo = new File("archivo_que_no_existe.txt");
        // Scanner scanner = new Scanner(archivo);
        // while (scanner.hasNextLine()) {
        // System.out.println(scanner.nextLine());
        // }

        // scanner.close();
        // } catch (FileNotFoundException e) {
        // System.err.println("Msg de error: " + e.getMessage());
        // }

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_basededatos",
                    "usuario",
                    "contraseña");
            Statement consulta = (Statement) conexion.createStatement();
            ResultSet resultado = ((java.sql.Statement) consulta).executeQuery("SELECT * FROM tabla_que_no_existe");
            while (resultado.next()) {
                System.out.println(resultado.getString("columna"));
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("continuo.....");

    }

}
