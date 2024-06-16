package buceo;

public class Buceo implements Comparable<Buceo> {

    private int id;
    private String puntoDeBuceo;
    private int profundidad;

    public Buceo(int id, String puntoDeBuceo, int profundidad) {
        this.id = id;
        this.puntoDeBuceo = puntoDeBuceo;
        this.profundidad = profundidad;
    }

    @Override
    public int compareTo(Buceo o) {
        return Integer.compare(this.profundidad, o.profundidad);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuntoDeBuceo() {
        return puntoDeBuceo;
    }

    public void setPuntoDeBuceo(String puntoDeBuceo) {
        this.puntoDeBuceo = puntoDeBuceo;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Buceo [id=" + id + ", puntoDeBuceo=" + puntoDeBuceo + ", profundidad=" + profundidad + "]";
    }

}
