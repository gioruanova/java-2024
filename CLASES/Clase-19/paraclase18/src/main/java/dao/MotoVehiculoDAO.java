package dao;

import java.util.List;

import model.Moto;

public interface MotoVehiculoDAO {
    List<Moto> findAll();

    Moto findById(int id);

    void save(Moto moto);

    void update(Moto moto);

    void delete(int id);
}