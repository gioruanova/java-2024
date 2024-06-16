package practica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClinicaMedica<T extends Medico> implements Hospital<T> {

    // Singleton!
    private static ClinicaMedica instance;
    private List<T> medicos;

    private ClinicaMedica() {
        this.medicos = new ArrayList<T>();
    }

    public static ClinicaMedica getInstance() {
        if (instance == null) {
            instance = new ClinicaMedica();
        }
        return instance;
    }

    @Override
    public void addMedico(T medico) throws NullPointerException {
        if (medico == null) {
            throw new NullPointerException("Medico no puede ser nulo");
        }
        this.medicos.add(medico);
    }

    @Override
    public void ordenarMedicosMayorAMenor() {
        this.medicos.sort(Comparator.reverseOrder());
    }

    public List<T> getMedicos() {
        return this.medicos;
    }

    @Override
    public void ordenarMedicosMenorAMayor() {
        this.medicos.sort(Comparator.naturalOrder());
    }

}
