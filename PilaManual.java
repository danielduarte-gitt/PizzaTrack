public class PilaManual {
    private Nodo tope;

    public PilaManual() {
        this.tope = null;
    }

    public void push(Pizza pizza) {
        Nodo nuevo = new Nodo(pizza);
        nuevo.siguiente = tope; // creamos la pizza con sus ingredientes
        tope = nuevo; // ahora la ultima pizza creada es la primera en la lista
    }

    public Pizza pop() {
        if (isEmpty()) return null;
        Pizza p = tope.pizza;
        tope = tope.siguiente; // en esta nos saltamos un nodo, pasamos al siguiente nodo
        return p;
    }

    public Pizza peek() {
        return (isEmpty()) ? null : tope.pizza; // el sistema de las 2 pilas nos sirve para la opcion de rehacer pedido
    }

    public boolean isEmpty() {
        return tope == null;
    }
}