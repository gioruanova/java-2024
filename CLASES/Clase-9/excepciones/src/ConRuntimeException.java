public class ConRuntimeException {

    public static void main(String[] args) {

        Division d = new Division();

        llamandoADivision(d);

    }

    public static void llamandoADivision(Division d) throws ArithmeticException {
        d.division();

    }

}
