import java.util.Scanner;

public class NewDirectory{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String lastName = sc.next();
        int age = sc.nextInt();

        System.out.println("Bienvenid@ " + name + lastName + "/n Tienes " + " años");
    }
}