import java.util.Scanner;
public class Despedida {
    public void despedir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre= sc.nextLine();
        System.out.println("Adios"+ nombre);
        sc.close();
    }
    
}
