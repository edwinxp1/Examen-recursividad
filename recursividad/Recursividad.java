package e.recursividad;

//Edwin Rodriguez
//31.117.957
public class Recursividad {

    public static void main(String[] args) {
//Ejercicio 1        
/*
        int[] numeros = {7, 5, 9, 10, 3};

        System.out.println("Arreglo original: " + convertirArregloACadena(numeros));

        if (numeros == null || numeros.length == 0) {
            System.out.println("El arreglo está vacío, la suma es 0.");
        } else {
            
            int ultimoIndice = numeros.length - 1;
            int sumaTotal = SumaRecursiva.sumarArregloDesdeElFinal(numeros, ultimoIndice);

            
            System.out.println("La suma recursiva de los elementos (desde el ultimo al primero) es: " + sumaTotal);
        }
    }

    public static String convertirArregloACadena(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return "[]";
        }

        StringBuilder resultado = new StringBuilder("[");
        for (int i = 0; i < arreglo.length; i++) {
            resultado.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                resultado.append(", ");
            }
        }
        resultado.append("]");
        return resultado.toString();
*/

//Ejercicio 2
/*
        ListaCircular miLista = new ListaCircular();

        miLista.insertar("When");
        miLista.insertar("haces");
        miLista.insertar("tus");
        miLista.insertar("momos");
        miLista.insertar("en");
        miLista.insertar("codigo");

        // (Opcional) Imprimir la lista para verificar la estructura
        System.out.print("Lista Circular Creada: ");
        miLista.imprimirLista();

        // 3. Llamar a la función recursiva para concatenar
        String resultadoConcatenacion = miLista.concatenarPalabrasRecursivo();

        
        System.out.println("\nResultado de la concatenacion recursiva:");
        System.out.println("\"" + resultadoConcatenacion + "\"");
*/

//Ejercicio 3
/*
        // Crear una pila y llenarla con datos
        Pila miPilaNumeros = new Pila();
        miPilaNumeros.push(8); //Fondo
        miPilaNumeros.push(4);
        miPilaNumeros.push(25);
        miPilaNumeros.push(10); //Superior

        System.out.print("Pila impresa en orden invertido: ");
        miPilaNumeros.imprimirInvertidoRecursivo();
*/

//Ejercicio 4
/*
        Factorialpotencia.Factorial valorFactorial = new Factorialpotencia.Factorial();
        Factorialpotencia.Potencia valorPotencia = new Factorialpotencia.Potencia();
        
        long factorial = valorFactorial.Factorial(5);
        long potencia = valorPotencia.Potencia(6, 2);
        
        long resultado = factorial * potencia;
        System.out.println("Resultado de " + factorial + "! * " + potencia + " = " + resultado);
*/        
    }
}
