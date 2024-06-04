//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro Libro1 = new Libro("When Hitler Stole Pink Rabbit","Judith Kerr","Literatura","Niños", 500);
        Libro Libro2 = new Libro();
        Libro1.mostrardetalles();
        Libro2.mostrardetalles();
        Libro2.actualizarprecio();
    }
}