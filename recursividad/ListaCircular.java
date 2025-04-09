package e.recursividad;

public class ListaCircular {

    private Nodo ultimo;
    

    public ListaCircular() {
        this.ultimo = null; 
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public void insertar(String palabra) {
        Nodo nuevoNodo = new Nodo(palabra);
        if (estaVacia()) {
            ultimo = nuevoNodo;
            ultimo.siguiente = ultimo;
        } else {
            nuevoNodo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
    }

    
    public String concatenarPalabrasRecursivo() {
        if (estaVacia()) {
            return ""; 
        }

        
        StringBuilder sb = new StringBuilder();
        Nodo inicio = ultimo.siguiente;

        concatenarRecursivoHelper(inicio, inicio, sb);
        return sb.toString();
    }

    
    private void concatenarRecursivoHelper(Nodo actual, Nodo inicio, StringBuilder sb) {
        sb.append(actual.palabra);

        if (actual.siguiente == inicio) {
            
        } else {
            sb.append(" ");
            concatenarRecursivoHelper(actual.siguiente, inicio, sb);
        }
    }

    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("Lista vacia.");
            return;
        }
        Nodo actual = ultimo.siguiente;
        System.out.print("[ ");
        do {
            System.out.print(actual.palabra + " -> ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        System.out.println("(vuelve a " + actual.palabra + ") ]");
    }

}