public class PilaManual {
    private Nodo tope;

    public PilaManual() {
        this.tope = null;
    }

    public void push(Pizza pizza) {
        Nodo nuevo = new Nodo(pizza);
        nuevo.siguiente = tope; // El nuevo apunta al que estaba antes
        tope = nuevo; // El nuevo ahora es el primero
    }

    public Pizza pop() {
        if (isEmpty()) return null;
        Pizza p = tope.pizza;
        tope = tope.siguiente; // El tope baja al siguiente nodo
        return p;
    }

    public Pizza peek() {
        return (isEmpty()) ? null : tope.pizza;
    }

    public boolean isEmpty() {
        return tope == null;
    }
}