public enum Tipo {
    // Parámetros
    MAZDA("Mazda", 2),
    TOYOTA("Toyota", 4),
    SUBARU("Subaru", 4);

    // Atributos
    private final String nombre;
    private final int numeroPuertas;

    // Constructor
    Tipo(String nombre, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    // toString
    @Override
    public String toString() {
        return  nombre + " " + numeroPuertas + " puertas";
    }
}
