package Main.Opdracht_16;

import java.util.Scanner;

public class _5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.println("geef een nummer tussen 0-10");
            num = scanner.nextInt();
            if ( num < 0 || num > 10){
                System.out.println("Ongeldig getal!");
            }
        } while ( num < 0 || num > 10);

    }

}
