package practica;

public interface Hospital<T extends Medico> {

    void addMedico(T medico);

    void ordenarMedicosMayorAMenor();

    void ordenarMedicosMenorAMayor();

}
