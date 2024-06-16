package dao;

import java.util.ArrayList;
import java.util.List;

import model.Moto;

public class MotoDao implements MotoVehiculoDAO {

    // private List<Moto> motos = new ArrayList<>();
    private List<Moto> motos = new ArrayList<>();
    private static MotoDao instance;

    // Constructor privado para evitar instanciación directa
    private MotoDao() {
    }

    // Método estático para obtener la única instancia
    public static MotoDao getInstance() {
        if (instance == null) {
            instance = new MotoDao();
        }
        return instance;
    }

    @Override
    public List<Moto> findAll() {
        return new ArrayList<>(motos);
    }

    @Override
    public Moto findById(int id) {
        return motos.stream().filter(motos -> motos.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void save(Moto moto) {
        motos.add(moto);
    }

    @Override
    public void update(Moto moto) {
        Moto existingMoto = findById(moto.getId());
        if (existingMoto != null) {
            existingMoto.setMarca(moto.getMarca());
            existingMoto.setColor(moto.getColor());
        }
    }

    @Override
    public void delete(int id) {
        motos.removeIf(moto -> moto.getId() == id);
    }

}