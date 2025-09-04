import java.util.Date;

// Interfaces
interface IProducto {
    int getPrecio();
    double getPrecioVenta();
}

interface IElectronico {
    String getFabricante();
}

interface ILibro {
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();
}

// Clase abstracta Producto
abstract class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}

// Clase abstracta Electronico
abstract class Electronico implements IElectronico, IProducto {
    protected String fabricante;
    protected int precio;

    public Electronico(int precio, String fabricante) {
        this.precio = precio;
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}

// Clase IPhone
class IPhone extends Electronico {
    private String color;
    private String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() { return color; }
    public String getModelo() { return modelo; }

    @Override
    public double getPrecioVenta() {
        return precio * 1.2; // Ejemplo: 20% más caro al venderse
    }
}

// Clase TvLcd
class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() { return pulgadas; }

    @Override
    public double getPrecioVenta() {
        return precio * 1.3; // Ejemplo: 30% más caro al venderse
    }
}

// Clase Libro
class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() { return fechaPublicacion; }
    @Override
    public String getAutor() { return autor; }
    @Override
    public String getTitulo() { return titulo; }
    @Override
    public String getEditorial() { return editorial; }

    @Override
    public double getPrecioVenta() {
        return precio * 1.1; // Ejemplo: 10% más caro al venderse
    }
}

// Clase Comics
class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() { return personaje; }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.15; // Ejemplo: 15% más caro al venderse
    }
}

// Clase principal
public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone(25000, "Apple", "Negro", "iPhone 14");
        productos[1] = new TvLcd(18000, "Sony", 55);
        productos[2] = new Libro(800, new Date(), "Gabriel García Márquez", "Cien Años de Soledad", "Sudamericana");
        productos[3] = new Libro(1200, new Date(), "Mario Vargas Llosa", "La ciudad y los perros", "Seix Barral");
        productos[4] = new Comics(500, new Date(), "Stan Lee", "Spider-Man #1", "Marvel", "Spider-Man");
        productos[5] = new Comics(600, new Date(), "Bob Kane", "Batman #27", "DC Comics", "Batman");

        for (IProducto p : productos) {
            System.out.println("Precio: $" + p.getPrecio());
            System.out.println("Precio de venta: $" + p.getPrecioVenta());

            // Revisamos tipo con instanceof para mostrar info extra
            if (p instanceof IElectronico) {
                IElectronico e = (IElectronico) p;
                System.out.println("Fabricante: " + e.getFabricante());
            }
            if (p instanceof ILibro) {
                ILibro l = (ILibro) p;
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Editorial: " + l.getEditorial());
            }
            System.out.println("-----");
        }
    }
}
