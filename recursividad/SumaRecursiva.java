package e.recursividad;

public class SumaRecursiva {
    public static int sumarArregloDesdeElFinal(int[] arreglo, int n) {
        if (n < 0) {
            return 0;
        } else {
            return arreglo[n] + sumarArregloDesdeElFinal(arreglo, n - 1);
        }
    }
}
