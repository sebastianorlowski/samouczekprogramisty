package pl.orlowski.sebastian.samouczekjava.a20klasywewnetrzne.exercise;

import java.util.*;

// Zadanie to będzie wymagało dodatkowej lektury na temat interfejsu Comparator ze standardowej biblioteki Javy. Pobierz od użytkownika 5 wyrazów, zapisz je w List. Użyj metody Collections.sort, przekazując jako argumenty listę oraz klasę anonimową, która posortuje ją na podstawie długości wyrazów (najkrótsze wyrazy powinny być pierwsze). Do sprawdzenia długości słowa możesz użyć metody String.length. Wyświetl zawartość listy przed i po sortowaniu.
public class SortWordLength {
    private static List<String> words = new ArrayList<>();
    private String word;
    static Scanner input = new Scanner(System.in);

    public void addWordsToList(){
        for(int i=0; i<5; i++) {
            System.out.println("Enter " + i + " word");
            word = input.nextLine();
            words.add(word);
        }
    }

    // Sortowanie bez comparatora
    public void sort() {
        for(int i=0; i<words.size()-1; i++) {
            for(int j=0; j<words.size()-1; j++) {
                String word = words.get(j);
                String word2 = words.get(j+1);
                if(word.length() > word2.length()) {
                    words.set(j+1, word);
                    words.set(j, word2);
                }
            }
        }
        for(String w : words) {
            System.out.println(w);
        }
    }

    //Sortowanie przez klasę anonimową
    public void sortByComparator() {
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                return w1.length() - w2.length();
            }
        });
        System.out.println(words);
    }


    public static void main(String[] args) {
        SortWordLength sortWord = new SortWordLength();
        sortWord.addWordsToList();
        System.out.println(words);
        sortWord.sortByComparator();
    }
}

