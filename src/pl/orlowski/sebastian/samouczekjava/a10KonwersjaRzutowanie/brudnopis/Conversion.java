package pl.orlowski.sebastian.samouczekjava.a10KonwersjaRzutowanie.brudnopis;

public class Conversion {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        int intValue = Integer.MAX_VALUE;
        long longValue = Long.MAX_VALUE;
        long longValueInInt = Integer.MAX_VALUE;

        conversion.methodExample(intValue);
        conversion.methodExample((int)longValue);
        conversion.methodExample((int)longValueInInt);

        float floatValue = 1253.45644445F;

        int int2Value = (int) floatValue;
        long long2Value = (long) 44.1234;
        System.out.println(int2Value);
        conversion.methodExample(long2Value);

        String a1 = "something";
        int a2 = 34;
        System.out.println(a1 + a2);
    }

    public void methodExample(long argument) {
        System.out.println(argument);

    }
}
