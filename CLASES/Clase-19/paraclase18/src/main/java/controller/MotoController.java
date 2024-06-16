package controller;

import java.util.List;

import model.Moto;
import services.MotoService;

public class MotoController {

    private MotoService motoService;

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    public List<Moto> getAllMotos() {
        return motoService.getAllMotos();
    }

    public Moto getMotoById(int id) {
        try {
            return motoService.getMotoById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void createMoto(Moto moto) {
        try {
            motoService.createMoto(moto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateMoto(Moto moto) {
        try {
            motoService.updateMoto(moto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteMoto(int id) {
        motoService.deleteMoto(id);
    }

}