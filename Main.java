import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 01 POO");
        // Ejemplo de Scanner

        Scanner sc = new Scanner(System.in); // Instanciación de la clase Scanner

        System.out.println("Your name:");
        String foo = sc.nextLine(); // Leyendo una línea de texto
        System.out.println("Your age:");
        int age = sc.nextInt(); // Leyendo un entero

        System.out.println(foo + " " + age); // Corrected variable name
    }
}



