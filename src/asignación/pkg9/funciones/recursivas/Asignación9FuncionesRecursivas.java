package asignación.pkg9.funciones.recursivas;

import java.util.Arrays;

public class Asignación9FuncionesRecursivas {

    public static void main(String[] args) {

        System.out.println("Fibonacci de 5: " + Recursividad.fibonacci(5));
        System.out.println("Fibonacci de 40: " + Recursividad.fibonacci(40));

        System.out.println("MCD de 45 y 75: " + Recursividad.mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + Recursividad.mcd(47, 91));

        Object numeros[] = {1, 2, 3, 3, 2, 3, 1};

        System.out.println("Ocurrencias de 3: " + Recursividad.count(numeros, numeros.length, 3));
        System.out.println("Ocurrencias de 1: " + Recursividad.count(numeros, numeros.length, 1));

        Object letras[] = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};

        System.out.println("Ocurrencias de C: " + Recursividad.count(letras, letras.length, 'C'));
        System.out.println("Ocurrencias de E: " + Recursividad.count(letras, letras.length, 'E'));

        Object numerosInvertidos[] = {1, 2, 3, 4, 5};

        Recursividad.reverse(numerosInvertidos, 0, numerosInvertidos.length - 1);

        System.out.println("Arreglo numerico invertido: " + Arrays.toString(numerosInvertidos));

        Object letrasInvertidas[] = {'A', 'B', 'C', 'D'};

        Recursividad.reverse(letrasInvertidas, 0, letrasInvertidas.length - 1);

        System.out.println("Arreglo de letras invertido: " + Arrays.toString(letrasInvertidas));
    }

}
