package pl.orlowski.sebastian.samouczekjava.a04petleinstrukcje;

import java.util.Scanner;

public class Brudnopis {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Wprowadź Twój poziom(1-5)");
        int level = input.nextInt();

        switch (level) {
            case 1:
                System.out.println("Jesteś początkujący");
                break;
            case 2:
                System.out.println("Jesteś średniozaawansowany");
                break;
            case 3:
                System.out.println("Jesteś zaawansowany");
                break;
            case 4:
                System.out.println("Jesteś profesjonalistą");
                break;
            case 5:
                System.out.println("Jesteś mistrzem");
                break;
            default:
                System.out.println("Nie znam Twojego poziomu");
                break;
        }

        // Pętla for
        int[] tab = new int[] {11, 12, 38, 19};
        for(int i=0;i<tab.length;i++) {
            System.out.println(tab[i]);
        }

        //Pętla foreach
        for(int number : tab) {
            System.out.println(number);
        }

        //Wykorzystanie continue
        int i = 0;
        while(i < 10) {
            i++;
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
