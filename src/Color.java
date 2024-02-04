// Un enumerador (Lo que es, este archivo), es una colección
// de valores CONSTANTES o Atributos CONSTANTES.
// FORMA SIN PERSONALIZAR (Es colocando solo ROJO, AMARILLO, AZUL)
public enum Color {
    // 1) Creamos las opciones que se mostrarán
    ROJO("Rojo"), // 4) Personalizamos las opciones
    AMARILLO("Amarillo"),
    AZUL("Azúl");

    // 2) Creamos un atributo que sea CONSTANTE (final) y String.
    private final String color;

    // 3) Creamos el constructor del atributo que creamos
    // Esto sirve para pasar el color que deseamos
    // a un parámetro que luego se asignará a un atributo
    // y devolverá un color, es propio de enum.
    Color(String color) {
        this.color = color;
    }

    // 5) Creamos un get, y lo utilizamos para devolver
    // la opción personalizada
    public String getColor() {
        return color;
    }

    // 6) Creamos un toString, borramos lo que contiene y hacemos que
    // retorne el this color, nos dará el valor que le dimos.
    @Override
    public String toString() {
        return this.color;
    }
}

// Esta es la segunda forma de mostrar valores constantes, la otra
// es normalmente con static final.
// Pero sin duda con el enum queda mejor.