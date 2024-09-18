import java.util.Scanner;

public class cos {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("podaj swoj wiek");
     int age=scanner.nextInt();
     
     if (age>=18){
        System.out.println("jestes pelnoletni");
     }
     else{
        System.out.println("nie jestes pelnoletni");
     }
     scanner.close();
    }
}
