public class Pizza {
    private String nombre;
    private String[] ingredientes; // Arreglo fijo de 3

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza: " + nombre + " | Ingredientes: [" + 
                ingredientes[0] + ", " + ingredientes[1] + ", " + ingredientes[2] + "]";
    }
}