package pl.orlowski.sebastian.samouczekjava.a19kolekcje.examples;

import java.util.*;

public class Names {



    public Names() {
    }

    public void addNamesList(){
        List<String> names = new ArrayList<>();
        List<String> otherNames = new ArrayList<>();
        names.add("Sebastian");
        names.add("Alicja");
        names.add("Marek");

        otherNames.add("Sebastian");
        otherNames.add("Adam");
        otherNames.add("Paweł");
        otherNames.add("Adam");

        System.out.println(otherNames.contains("Adam"));
        System.out.println(otherNames.isEmpty());
        System.out.println(otherNames.size());
        System.out.println(otherNames.get(1));
        System.out.println(otherNames.addAll(names));
        for(String n : otherNames) {
            System.out.println(n);
        }
    }

    public void addNamesSet() {
        Set<String> names = new HashSet<>();
        Set<String> otherNames = new HashSet<>();
        names.add("Sebastian");
        names.add("Alicja");

        otherNames.add("Alicja");
        otherNames.add("Paweł");

        System.out.println(names.size());
        System.out.println(names.contains("Sebastian"));
        otherNames.addAll(names);
        for(String n : otherNames) {
            System.out.println(n);
        }
    }

    public void addNamesMap() {
        Map<String, String> names = new HashMap<>();
        Map<String, String> otherNames = new HashMap<>();
        names.put("Sebastian", "Alicja");
        names.put("Marek",  "Magda");

        otherNames.put("Marek", "Aga");
        otherNames.put("Adam", "Ania");

        System.out.println(names.containsKey("Sebastian"));
        System.out.println(otherNames.isEmpty());
        System.out.println(names.size());

        for(String n : names.keySet()) {
            String value = names.get(n);
            System.out.println(n + value);
        }

        for(String n : names.values()) {
            System.out.println(n);
        }

        for(Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("List: ");
        Names names = new Names();
        names.addNamesList();
        System.out.println("Set: ");
        names.addNamesSet();
        System.out.println("Map: ");
        names.addNamesMap();

    }
}
