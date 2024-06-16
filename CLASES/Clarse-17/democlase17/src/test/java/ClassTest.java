import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClassTest {

    public static Persona p = new Persona("Jhon Doe", 30);

    @Test
    public void test() {
        System.out.println("Hello world!");
    }

    @Test
    public void testEdad() {
        assertAll("Multiple asersiones",
                () -> assertEquals(30, p.getEdad()),
                () -> assertEquals(p.getEdad().getClass().getName(), Integer.class.getName()));
    }

    @Test
    public void testEdadTryCatch() {
        try {
            p.setEdad(null);
            assertEquals(30, p.getEdad());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testPersons() {
        Persona p1 = new Persona("Jhon Doe", 30);
        Persona p2 = new Persona("Jhon Doe", 30);

        System.out.println(p1.equals(p2));
        assertEquals(p1, p2);
    }

    @Test
    public void testExcepcions() {
        assertThrows(RuntimeException.class, () -> p.setEdad(null));
    }

    @Test
    public void compararArrays() {
        Persona persona1 = new Persona("John", 30);
        Persona persona2 = new Persona("Jane", 25);
        Persona persona3 = new Persona("Jane", 22);
        Persona[] array1 = { persona1, persona2 };
        Persona[] array2 = { persona1, persona2, persona3 };
        Persona[] array3 = array2;
        /*
         * assertArrayEquals(array1, array2) da false porque los arrays no son iguales
         */
        assertArrayEquals(array1, array2);
        /*
         * assertNotEquals(array3, array2) da false porque los arrays son iguales
         */
        // assertNotEquals(array3, array2, "Los arrays no son iguales");
    }

    @Test
    public void testAssertSame() {
        Persona persona1 = new Persona("John", 30);
        Persona persona2 = new Persona("John", 31);
        Persona persona3 = persona1;
        System.out.println(persona1.equals(persona2));
        /*
         * assertSame(persona1, persona3) da true porque son la misma refencia en
         * memoria
         * 
         * assertNotSame (persona1, persona3) da false porque son objetos distintos
         */
        assertNotSame(persona3, persona2);
    }

}
