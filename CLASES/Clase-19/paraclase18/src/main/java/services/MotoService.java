package services;

import java.util.List;

import model.Moto;

public interface MotoService {
    List<Moto> getAllMotos();

    Moto getMotoById(int id) throws Exception;

    void createMoto(Moto moto);

    void updateMoto(Moto moto);

    void deleteMoto(int id);
}