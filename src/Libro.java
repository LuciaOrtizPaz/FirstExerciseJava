public class Libro {
    String titulo;
    String autor;
    String genero;
    String categoria;
    double precio;

    //Constructor con valores por defecto
    public Libro(){
        this.titulo = "El principito";
        this.autor = "Antoine de Saint-Exupéry";
        this.genero = "Literatura";
        this.categoria = "Niños";
        this.precio = 250;
    }

    //Contructor con valores por obtener
    public Libro(String titulo, String autor, String genero, String categoria, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.categoria = categoria;
        this.precio = precio;
    }

    //Métodos
    public void mostrardetalles(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: " + precio);
    }
    public void actualizarprecio(){
        precio = precio + 10;
        System.out.println("El precio actualizado es: " + precio);
    }
}


