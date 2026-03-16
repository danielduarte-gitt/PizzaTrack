public class GestionPedidos {
    private PilaManual pilaPrincipal = new PilaManual();
    private PilaManual pilaSecundaria = new PilaManual();

    public void registrar(Pizza p) {
        pilaPrincipal.push(p);
        // Al agregar uno nuevo, se limpia la posibilidad de "rehacer"
        while(!pilaSecundaria.isEmpty()) pilaSecundaria.pop();
    }

    public void deshacer() {
        if (!pilaPrincipal.isEmpty()) {
            pilaSecundaria.push(pilaPrincipal.pop());
            System.out.println("Acción deshecha.");
        }
    }

    public void rehacer() {
        if (!pilaSecundaria.isEmpty()) {
            pilaPrincipal.push(pilaSecundaria.pop());
            System.out.println("Acción rehecha.");
        }
    }

    public void mostrarActual() {
        Pizza p = pilaPrincipal.peek();
        System.out.println(p != null ? "Pedido en turno: " + p : "No hay pedidos.");
    }
}