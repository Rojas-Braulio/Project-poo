public class Main {
    public static void main(String[] args) {

        // Asignando PARÁMETROS
        Clase objeto1 = new Clase("nada", 32, 3.14);
        Clase objeto2 = new Clase("pan", 55, 99.9,100);
        Clase objeto3 = new Clase("algo", 3, 50);

        // PROBANDO MÉTODOS
        System.out.println(objeto1.metodo1());
        System.out.println(objeto1.metodo2(66));
        System.out.println(objeto1.metodo1Ymetodo2(44));

        // Esto es encapsulamiento, existe un proceso matemático detrás pero no se ve.
        System.out.println("Dividir un número por 100: ");
        System.out.println(objeto1.division(40));

        // ToString: Es un método especial que sirve para representar un objeto de la forma que uno quiera
        // (Se llama cuando se coloca el nombre del objeto)
        System.out.println(objeto1);
        System.out.println(objeto1.toString());

        // Método Estático (Se asocia a la clase, no al objeto)
        // Un método estático solo trabaja con atributos estáticos
        System.out.println(objeto1.metodoEstatico());
        System.out.println(objeto2.metodoEstatico());
        Clase.setAtributo4("verde"); //Se cambía un estático de un objeto
        System.out.println(objeto1.metodoEstatico()); // Cambia para todos
        System.out.println(objeto2.metodoEstatico());

        // Índice AI.
        System.out.println(objeto3); // Tiene su Id Auto Incremental automáticamente.


    }
}
