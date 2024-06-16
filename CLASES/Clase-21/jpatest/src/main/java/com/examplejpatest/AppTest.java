package com.examplejpatest;

import java.util.Optional;

public class AppTest {

    public static void main(String[] args) {
        String nombre = "Tengo vida";
        Optional<String> optionalNombre = Optional.ofNullable(nombre);

        // // Verificando si el valor está presente
        if (optionalNombre.isPresent()) {
            // Si está presente, obtenemos el valor
            String nombreObtenido = optionalNombre.get();
            System.out.println("Nombre: " + nombreObtenido);
        } else {
            // Si no está presente, podemos manejarlo de alguna manera
            System.out.println("Nombre no está presente");
        }

        System.out.println(
                optionalNombre.orElse("nombre no presente"));

    }

}
