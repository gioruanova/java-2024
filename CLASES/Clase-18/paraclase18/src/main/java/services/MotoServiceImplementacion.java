package services;

import java.util.List;

import dao.MotoDao;
import excepciones.MotoCreateExcepcion;
import model.Moto;

public class MotoServiceImplementacion implements MotoService {

    private MotoDao motoDao;

    public MotoServiceImplementacion(MotoDao motoDao) {
        this.motoDao = motoDao;
    }

    @Override
    public List<Moto> getAllMotos() {
        return this.motoDao.findAll();
    }

    @Override
    public Moto getMotoById(int id) throws Exception {
        Moto moto = motoDao.findById(id);
        if (moto == null) {
            throw new Exception("Moto no encontrada!");
        }
        return moto;
        // return this.motoDao.findById(id);
    }

    @Override
    public void createMoto(Moto moto) {
        if (moto == null) {
            throw new MotoCreateExcepcion("La instancia de moto no puede ser nula");
        }
        this.motoDao.save(moto);
    }

    @Override
    public void updateMoto(Moto moto) {
        try {
            this.motoDao.update(moto);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void deleteMoto(int id) {
        this.motoDao.delete(id);
    }

}