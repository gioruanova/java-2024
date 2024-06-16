package herencia;

public abstract class Vehiculo {

    private String colorPrincipal;
    protected String marca;
    private String colorPublic;

    public Vehiculo(String colorPrincipal, String marca) {
        /*
         * Ejemplo de modularización, delego la responsabilidad
         * en los metoros setters
         */
        setColorPrincipal(colorPrincipal);
        setMarca(marca);
    }

    public Vehiculo() {
    }

    public String getColorPrincipal() {
        return this.colorPrincipal;
    }

    public String getColorPublic() {
        return colorPublic;
    }

    /*
     * Ejemplo de un setter private para validar
     * datos en el constructor
     */
    private void setMarca(String marca) {
        if (marca == null) {
            throw new IllegalArgumentException("La marca no puede ser nulo");
        }
        this.marca = marca;
    }

    private void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = "red";
    }

    public String getMarca() {
        return marca;
    }

    public void modificarMarca(String marca) {
        this.marca = marca;
    }

    /*
     * Para que se considere abstracta una clase no siempre basta
     * con por "abstract" en la firma de la clase, al menos
     * se considera que tenga 1 metodo abstract
     */
    public void frenar() {
        System.out.println("Un vehiculo frena");
    }

    public void acelerar() {
        System.out.println("Un vehiculo acelera");
    }

    public void metodoGerenal() {
        System.out.println("Llamado desde el padre");
    }

}
