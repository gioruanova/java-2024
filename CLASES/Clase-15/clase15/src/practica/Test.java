package practica;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) throws Exception {

        ClinicaMedica<MedicoClinico> clinicaMedica = ClinicaMedica.getInstance();

        // Admitir medicos:

        clinicaMedica.addMedico(new MedicoClinico("Dr. Juan"));
        clinicaMedica.addMedico(new MedicoClinico("Dr. Pedro"));
        clinicaMedica.addMedico(new MedicoClinico("Dr. Ana"));
        clinicaMedica.addMedico(new MedicoClinico("Dr. House"));
        clinicaMedica.addMedico(new MedicoClinico("Dra Marie Curie"));

        clinicaMedica.ordenarMedicosMenorAMayor();
        // Mostramos la lista ordenada de mayor a menor:
        for (MedicoClinico mc : clinicaMedica.getMedicos()) {
            System.out.println(mc.toString());
        }
        clinicaMedica.getMedicos().forEach(x -> System.out.println(x.toString()));

        clinicaMedica.getMedicos().stream().limit(3).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        for (int i = 0; i < clinicaMedica.getMedicos().size(); i++) {
            System.out.println(clinicaMedica.getMedicos().get(i).toString());
        }

        // soyUnMetodoGenerico(22);
        // soyUnMetodoGenerico("22");
        // soyUnMetodoGenerico(true);

    }

    public static <T> T soyUnMetodoGenerico(T a) {
        return a;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b, int c) {
        return a + b;
    }

    public static int suma(String a, int b, int c) {
        return Integer.parseInt(a) + b;
    }
}
