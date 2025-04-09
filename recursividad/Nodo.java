package e.recursividad;
//Nodo del segundo ejercico
public class Nodo {
    String palabra; 
    Nodo siguiente; 

    
    public Nodo(String palabra) {
        this.palabra = palabra;
        this.siguiente = null;
    }

    
    public String getPalabra() {
        return palabra;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}