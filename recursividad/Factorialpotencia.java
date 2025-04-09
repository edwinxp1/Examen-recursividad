package e.recursividad;

public class Factorialpotencia {

    public static class Factorial {
        public static long Factorial(int n) {
            if (n == 0) { 
                return 1;
            } else {
                return n * Factorial(n - 1);
            }
        }
    }

    public static class Potencia {
        public static long Potencia(int base, int n) {
            if (n == 0) { 
                return 1;
            } else {
                return base * Potencia(base, n - 1);
            }
        }
    }
}
