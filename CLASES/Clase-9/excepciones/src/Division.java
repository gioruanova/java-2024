public class Division {

    public int a;
    public int b;

    public Division() {
        this.a = 10;
        this.b = 0;
    }

    public int division() {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

}
