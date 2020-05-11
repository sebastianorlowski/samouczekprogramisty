package pl.orlowski.sebastian.samouczekjava.a12typwyliczeniowy.exerciseone;
// Napisz klasę Human, która będzie reprezentowała człowieka. Niech klasa ta posiada atrybuty takie jak imię, wiek, kolor oczu, kolor włosów. Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję takiej klasy.
public class Human {
    String name;
    int age;
    EyeColor eyeColor;
    HairColor hairColor;

    public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor=" + eyeColor +
                ", hairColor=" + hairColor +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public static void main(String[] args) {
        Human human1 = new Human("Sebastian", 24, EyeColor.GRAY, HairColor.BROWN);
        Human human2 = new Human("Alicja", 22, EyeColor.GRAY, HairColor.BROWN);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
    }
}
