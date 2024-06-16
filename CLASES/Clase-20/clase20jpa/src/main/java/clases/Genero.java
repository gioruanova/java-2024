package clases;

public enum Genero {

    FEMENINO("F"), MASCULINO("M"), NO_DEFINIDO("X");

    private String desc;

    private Genero(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
