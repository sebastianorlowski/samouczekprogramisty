package pl.orlowski.sebastian.samouczekjava.a05TypyProste;

import java.util.Scanner;

// Teraz ćwiczenie dla Ciebie. Napisz program, który policzy średnią z kilku przedmiotów. Możemy założyć, że uczeń w szkole ma 3 przedmioty i z każdego z nich dostał po 4 oceny.
public class Exercise {
    static Scanner input = new Scanner(System.in);
    private int[][] rating;
    private final int numberOfLessons;
    private final int numberOfRatings;

    public static void main(String[] args) {
        int numberOfLessons = 3;
        int numberOfRatings = 4;
        Exercise exercise = new Exercise(numberOfLessons, numberOfRatings);
        exercise.rateFromUser();
        exercise.averageRating();

    }

    public Exercise(int numberOfLessons, int numberOfRatings) {
        this.numberOfLessons = numberOfLessons;
        this.numberOfRatings = numberOfRatings;
        initialize();
    }

    public void initialize() {
        rating = new int[numberOfLessons][];
        for (int indexLesson = 0; indexLesson < rating.length; indexLesson++) {
            rating[indexLesson] = new int[numberOfRatings];
        }
    }

    public void rateFromUser() {
        for (int indexLesson = 0; indexLesson < numberOfLessons; indexLesson++) {
            for (int indexRate = 0; indexRate < numberOfRatings; indexRate++) {
                System.out.println("Podaj ocenę nr " + (indexRate + 1) + " z przedmiotu numer " + (indexLesson + 1));
                rating[indexLesson][indexRate] = input.nextInt();
            }
        }
    }

    private void averageRating() {
        double avg = 0;
        for (int indexLesson = 0; indexLesson < numberOfLessons; indexLesson++) {
            double avgLesson = 0;
            for (int rate : rating[indexLesson]) {
                avgLesson += rate;
            }
            avgLesson /= numberOfRatings;
            System.out.println("Srednia dla przedmiotu nr " + (indexLesson+1) + " wynosi " + avgLesson);
            avg += (avgLesson/numberOfLessons);
        }
        System.out.println("Srednia wszystkich przedmiotow wynosi " + avg);
    }
}


