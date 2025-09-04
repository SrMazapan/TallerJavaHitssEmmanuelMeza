// Clase abstracta Mamifero
abstract class Mamifero {
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    // Constructor
    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    // Getters
    public String getHabitat() { return habitat; }
    public double getAltura() { return altura; }
    public double getLargo() { return largo; }
    public double getPeso() { return peso; }
    public String getNombreCientifico() { return nombreCientifico; }

    // Métodos abstractos
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
}

// Clase abstracta Felino
abstract class Felino extends Mamifero {
    protected double tamGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico,
                  double tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    public double getTamGarras() { return tamGarras; }
    public int getVelocidad() { return velocidad; }
}

// Clase abstracta Canino
abstract class Canino extends Mamifero {
    protected String color;
    protected double tamColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico,
                  String color, double tamColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamColmillos = tamColmillos;
    }

    public String getColor() { return color; }
    public double getTamColmillos() { return tamColmillos; }
}

// Clase León
class Leon extends Felino {
    private int numManada;
    private double potenciaRugido;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico,
                double tamGarras, int velocidad, int numManada, double potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El León caza junto a su manada de " + numManada + " individuos.";
    }

    @Override
    public String dormir() {
        return "El León duerme en la sabana de " + habitat;
    }

    @Override
    public String correr() {
        return "El León corre a " + velocidad + " km/h para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugido + " decibeles.";
    }
}

// Clase Tigre
class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 double tamGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() { return "El Tigre " + especieTigre + " caza en solitario en " + habitat; }
    @Override
    public String dormir() { return "El Tigre duerme bajo la sombra de los árboles."; }
    @Override
    public String correr() { return "El Tigre corre velozmente alcanzando " + velocidad + " km/h."; }
    @Override
    public String comunicarse() { return "El Tigre ruge fuertemente para marcar su territorio."; }
}

// Clase Guepardo
class Guepardo extends Felino {
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                    double tamGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamGarras, velocidad);
    }

    @Override
    public String comer() { return "El Guepardo caza pequeñas presas en " + habitat; }
    @Override
    public String dormir() { return "El Guepardo duerme escondido en la hierba."; }
    @Override
    public String correr() { return "El Guepardo es el más rápido, alcanza hasta " + velocidad + " km/h."; }
    @Override
    public String comunicarse() { return "El Guepardo emite chillidos para comunicarse."; }
}

// Clase Lobo
class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                String color, double tamColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() { return "El Lobo " + especieLobo + " caza en manada de " + numCamada + " lobos."; }
    @Override
    public String dormir() { return "El Lobo " + color + " duerme en cuevas de " + habitat; }
    @Override
    public String correr() { return "El Lobo corre por los bosques a gran velocidad."; }
    @Override
    public String comunicarse() { return "El Lobo aúlla para comunicarse con la manada."; }
}

// Clase Perro Salvaje Africano
class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 String color, double tamColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() { return "El Perro Salvaje Africano caza en equipo en " + habitat; }
    @Override
    public String dormir() { return "El Perro descansa bajo los arbustos."; }
    @Override
    public String correr() { return "El Perro corre largas distancias para perseguir presas."; }
    @Override
    public String comunicarse() { return "El Perro se comunica con ladridos y chillidos."; }
}

// Clase principal con el método main
public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        mamiferos[0] = new Leon("Sabana Africana", 1.2, 2.4, 190, "Panthera leo", 8.5, 80, 10, 114.0);
        mamiferos[1] = new Tigre("Selva", 1.1, 2.5, 220, "Panthera tigris", 7.0, 65, "Bengala");
        mamiferos[2] = new Guepardo("Praderas", 0.9, 1.5, 72, "Acinonyx jubatus", 6.0, 112);
        mamiferos[3] = new Lobo("Bosque", 0.8, 1.3, 50, "Canis lupus", "Gris", 4.5, 8, "Ártico");
        mamiferos[4] = new Perro("Sabana", 0.75, 1.1, 40, "Lycaon pictus", "Moteado", 3.8, 320);

        for (Mamifero animal : mamiferos) {
            System.out.println("---- " + animal.getNombreCientifico() + " ----");
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println();
        }
    }
}
