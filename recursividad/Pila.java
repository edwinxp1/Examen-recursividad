package e.recursividad;

class Nodo2 { //solo para que no choque con el nodo del 2 ejercicio
    int dato;
    Nodo2 siguiente;

    public Nodo2(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Pila {
    private Nodo2 cima; 

    public void push(int dato) {
        Nodo2 nuevoNodo = new Nodo2(dato); 
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public int pop() {
        if (cima == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        int dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    
    public boolean isEmpty() {
        return cima == null;
    }

    
    public void imprimirInvertidoRecursivo() {
        if (isEmpty()) {
            return; 
        }
        int elementoCima = pop(); 
        imprimirInvertidoRecursivo(); 
        System.out.print(elementoCima + " "); 
    }
}
