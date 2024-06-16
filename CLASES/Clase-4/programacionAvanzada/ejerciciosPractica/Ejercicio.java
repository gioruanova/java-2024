package programacionAvanzada.ejerciciosPractica;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio {

    public static void main(String[] args) {

        // Importo desde utils una lista de cursos para no ensuciar mucho el main
        List<Curso> cursos = Utils.listaCursos();

        /*
         * 1) Obtener la cantidad de cursos con una duración mayor a 5 horas.
         * 2) Obtener la cantidad de cursos con una duración menor a 2 horas.
         * 3) Listar el título de todos aquellos cursos con una cantidad de vídeos mayor
         * a 50.
         * 4) Mostrar en consola el título de los 3 cursos con mayor duración.
         * 5) Mostrar en consola la duración total de todos los cursos.
         * 6) Mostrar en consola todos aquellos libros que superen el promedio en cuanto
         * a duración se refiere.
         * 8) Mostrar en consola la duración de todos aquellos cursos que tengan una
         * cantidad de alumnos inscritos menor a 500.
         * 9) Obtener el curso con mayor duración.
         * 10) Crear una lista de Strings con todos los titulos de los cursos.
         */

        /*
         * PD: Cualquier consulta o duda estamos comunicados BUEN FINDE!!!
         */

        // Ejemplo 1:
        long cantidadCursosMayorACinco = cursos.stream().filter(curso -> curso.getDuracion() > 5f).count();
        System.out.printf("Obtener la cantidad de cursos con una duración mayor a 5 horas: %d cursos",
                cantidadCursosMayorACinco);

    }

}
