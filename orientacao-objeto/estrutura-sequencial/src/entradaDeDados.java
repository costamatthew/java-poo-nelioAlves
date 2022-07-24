import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

//        String x = sc.next();
//        System.out.println("Você Digitou: " + x);
//
//        int number = sc.nextInt();
//        System.out.println("Você Digitou: " + number);
//
//        double numberDouble = sc.nextDouble();
//        System.out.println("Você Digitou: " + numberDouble);
//
//        char getChar = sc.next().charAt(0);
//        System.out.println("Você Digitou: " + getChar);

//        String a;
//        int b;
//        double c;
//        a = sc.next();
//        b = sc.nextInt();
//        c = sc.nextDouble();
//
//        System.out.println("Dados Digitados");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
