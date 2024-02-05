public class Main {
    public static void main(String[] args) {

        // Asignando PARÁMETROS
        Clase objeto1 = new Clase("nada", 32, 3.14);
        Clase objeto2 = new Clase("pan", 55, 99.9,100);
        Clase objeto3 = new Clase("algo", 3, Clase.getVelocidadMaxCiudad()); // Uso de constante (getVel..)
        Clase objeto4 = new Clase("algo2", 40, 40, 50, Color.ROJO);
        Clase objeto5 = new Clase("traza", 39, 30, 40, Color.AZUL, Tipo.MAZDA);

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

        // Enumerador Color (Define un conjunto fijo de constantes)
        System.out.println(objeto4);

        // Enumerador Tipo (Se puede acceder a los métodos del enumerador Tipo a través del método de getTipo).
        Tipo tipo1 = objeto5.getTipo();
        System.out.println(objeto5);
        System.out.println(tipo1.getNombre() + " " + tipo1.getNumeroPuertas());
        System.out.println(objeto5.getTipo().getNumeroPuertas());

        // Utilizando Switch
        Tipo tipo = objeto5.getTipo();
        System.out.println(tipo);
        switch(tipo){
            case MAZDA:
                System.out.println("El automóvil es deportivo");
                break;
            case TOYOTA:
                System.out.println("El automóvil es grande");
                break;
            case SUBARU:
                System.out.println("El automóvil es de carreras");
                break;
        }

        // Ahora lo cambiamos a Toyota
        // VERSION MEJORADA SWITCH
        // Desde la version 13 de java se puede utilizas switch con flecha
        // Esta flecha incluye el break, por lo que no es necesario el break.
        objeto5.setTipo(Tipo.TOYOTA);
        tipo = objeto5.getTipo();
        switch (tipo){
            case MAZDA -> System.out.println("El automóvil es deportivo");
            case TOYOTA -> System.out.println("El automóvil es grande");
            case SUBARU -> System.out.println("El automóvil es de carreras");
        }

        // Enumerador For - For Each
        Tipo[] tipos = Tipo.values();
        for (Tipo t: tipos){
            System.out.println(t.getNombre() + " = " + t.name() + " " + t.getNumeroPuertas());
        }

        // Enumeradores típicos:
        // - Nombres de la semana
        // - Planetas (Con sus constantes, ej: masa, circunferencia, gravedad)
        // - Meses del año (Con sus contantes, ej: días, horas, minutos).


    }
}
