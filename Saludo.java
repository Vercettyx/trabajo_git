import java.util.Scanner;
public class Saludo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre= sc.nextLine();
        System.out.println("hola"+ nombre);
        sc.close();
    }
}