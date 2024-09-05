package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma mensagem");
        String msg = sc.nextLine();

        System.out.println("A mensagem digitda foi: " + msg);

        sc.close();
    }
}
