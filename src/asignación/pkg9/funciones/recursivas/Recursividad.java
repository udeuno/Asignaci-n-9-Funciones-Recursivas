package asignación.pkg9.funciones.recursivas;

import java.util.Objects;

public class Recursividad {

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual a 0");
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }

        return mcd(b, a % b);
    }

    public static int count(Object datos[], int n, Object o) {
        if (n <= 0) {
            return 0;
        }

        int encontrado = Objects.equals(datos[n - 1], o) ? 1 : 0;

        return encontrado + count(datos, n - 1, o);
    }

    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        Object temporal = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temporal;

        reverse(datos, inicio + 1, fin - 1);
    }
}
