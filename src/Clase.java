
// Una clase nunca debe imprimir información, es decir nunca se debe
// utilizar el sout, y en vez de esto se debe devolver o retornar
// información.

public class Clase {
    // ATRIBUTOS
    private int id; // Índice AI. Parte en 0 por defecto.
    private String atributo1;
    private int atributo2;
    private double atributo3;
    private double divisor = 100;
    private static String atributo4 = "normal";
    private static int contadorId; // Índice AI. Contador.
    private static final Integer VELOCIDAD_MAX_CARRETERA = 120; // CONSTANTES: Así se declaran. // "final" significa que no se puede modificar.
    final static private Integer VELOCIDAD_MAX_CIUDAD = 60; // El órden puede variar.
    private Color color; // Enumeradores, el tipo de dato es el nombre del enumerador, con un enumerados ya puedo ingresar multiples opciones predefinidas del enumerador "Color".
    private Tipo tipo;

    // CONSTRUCTORES (Si tenemos sobrecarga podemos usar 3 parámetros y también 4 con el segundo constructor)
    public Clase() { // Índice AI. Un constructor incluso si no colocas ningún parámetro, se inicializa.
        this.id = ++contadorId; // Índice AI. Aumenta el contador para todos los objetos porque es estático
    }
    public Clase(String atributo1, int atributo2, double atributo3) {
        this(); // Índice AI. Referenciamos el constructor que no tiene argumentos.
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public Clase(String atributo1, int atributo2, double atributo3, double divisor) {
        this(atributo1, atributo2, atributo3); // Así se referencia al primer constructor, no se hace con el nombre.
        this.divisor = divisor;
    }
    public Clase(String atributo1, int atributo2, double atributo3, double divisor, Color color) {
        this(atributo1, atributo2, atributo3, divisor);
        this.color = color;
    }
    public Clase(String atributo1, int atributo2, double atributo3, double divisor, Color color, Tipo tipo) {
        this(atributo1, atributo2, atributo3, divisor, color);
        this.tipo = tipo;
    }


    // GETTERS AND SETTERS
    public String getAtributo1() {return atributo1;}
    public void setAtributo1(String atributo1) {this.atributo1 = atributo1;}
    public int getAtributo2() {return atributo2;}
    public void setAtributo2(int atributo2) {this.atributo2 = atributo2;}
    public double getAtributo3() {return atributo3;}
    public void setAtributo3(double atributo3) {this.atributo3 = atributo3;}
    public double getDivisor() {return divisor;}
    public void setDivisor(double divisor) {this.divisor = divisor;}
    public static String getAtributo4() {return atributo4;}
    public static void setAtributo4(String atributo4) {Clase.atributo4 = atributo4;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public static Integer getVelocidadMaxCarretera() {return Clase.VELOCIDAD_MAX_CARRETERA;}
    public static Integer getVelocidadMaxCiudad() {return  Clase.VELOCIDAD_MAX_CIUDAD;}
    public Color getColor() {return color;}
    public void setColor(Color color) {this.color = color;}
    public Tipo getTipo() {return tipo;}
    public void setTipo(Tipo tipo) {this.tipo = tipo;}

    // MÉTODOS
    // MÉTODOS DE EJEMPLO
    public String metodo1(){
        return "This se usa para referenciar al atributo propio de la clase \nthis.atributo1 = " + this.atributo1;
    }
    public String metodo2(int valor){
        return "En este metodo llamado " + this.atributo1 + " se le ingresó un valor que es: " + valor;
    }
    public String metodo1Ymetodo2(int valor){
        String metodo1Nuevo = this.metodo1();
        String metodo2Nuevo = this.metodo2(valor);
        return "\n" + metodo1Nuevo + "\n" + metodo2Nuevo;
    }

    //MÉTODOS PARA CÁLCULO
    public double division(int dividendo){
        return dividendo/divisor;
    }

    //MÉTODO ESTÁTICO
    public String metodoEstatico() {
        return "Método estático \"tipo\": " + atributo4;
    }

    // SOBREESCRIBIR MÉTODOS de la clase padre

    // 0 Evaluamos si el objeto tiene el mismo espacio en la memoria (Solo para strings, si es que son iguales.
    // 1 Manejamos que los valores deban ser del mismo tipo para compararse
    // 2 Customizamos equals para que compare por entre el valor que tienen 2 objetos en la casilla atributo1
    // 3 Manejamos el error de nulls
    // NOTA: Si el valor es true, equals devuelve true y no evalúa más condiciones.
    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (!(obj instanceof Clase)) { //1
            return false;
        }

        Clase objetoGeneral = (Clase) obj; // 2
        return (this.atributo1 != null && this.atributo1.equals(objetoGeneral.getAtributo1())); //3
    }

    // toString


}
