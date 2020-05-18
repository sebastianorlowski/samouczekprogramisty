package pl.orlowski.sebastian.samouczekjava.a19kolekcje.exercise;

import java.util.*;

// Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion.
//Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”, następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię odpowiadającego mu partnera.
public class Name {
    static Scanner input = new Scanner(System.in);
    private final String NOMORE = "-";
    private static boolean isOn = true;


    public Name() {
    }

    // Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion.
    public void addNamesToList() {
        String name;
        Set<String> names = new HashSet<>();
        while(isOn) {
            System.out.print("Enter name: ");
            name = input.nextLine();
            if(!name.equals(NOMORE)) {
                names.add(name);
            }
            else {
                System.out.println("You entered " + names.size() + " unique names");
                isOn = false;
            }
        }
        }
    //Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”, następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię odpowiadającego mu partnera.
    public void addPairOfNames() {
        Map<String, String> names = new HashMap<>();
        isOn = true;
        String nameOne;
        String nameTwo;
        while (isOn) {
            System.out.print("First name: ");
            nameOne = input.nextLine();
            if (nameOne.equals(NOMORE)) {
                break;
            }
            System.out.print("Second name: ");
            nameTwo = input.nextLine();
            if (nameTwo.equals(NOMORE)) {
                break;
            }
            names.put(nameOne, nameTwo);
        }
                System.out.print("Enter name which you entered before: ");
                nameOne=input.nextLine();
                for(String n : names.keySet()) {
                    if(n.equals(nameOne)) {
                        String value = names.get(n);
                        System.out.println(nameOne + " " + value);
                        isOn = false;
                    }
                }
            }

    public static void main(String[] args) {
        Name name = new Name();
        name.addPairOfNames();
    }
}
