package model;

public class Vehiculo {

    private int id;
    private String marca;
    private String modelo;
    private String color;
    private String cc;

    public Vehiculo(int id, String marca, String modelo, String color, String cc) {
        this.id = id;
        setMarca(marca);
        this.modelo = modelo;
        this.color = color;
        this.cc = cc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (this.marca == null) {
            throw new NullPointerException("La marca no puede ser nula");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cc=" + cc
                + "]";
    }

}
