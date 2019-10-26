
package futuro;

public class Main {
    static String resultado;
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + ":");
        veredicto(args[1], args[2]);
        System.out.println(resultado);

    }

    public static String veredicto(String valor1, String valor2) {


        if (Integer.valueOf(valor1) == Integer.valueOf(valor2)) {
            resultado = "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
            return resultado;
        } else if (Integer.valueOf(valor1) > Integer.valueOf(valor2)) {
            resultado = "Poco tiempo de estudio. Debes dedicar más tiempo.";
            return resultado;
        } else {

            resultado = "Ideal. Trabajas los contenidos en casa.";
        }
        return resultado;
    }
}

