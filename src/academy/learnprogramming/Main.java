package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("Float min value = " + myMinFloat);
        // Float min value = 1.4E-45
        System.out.println("Float max value = " + myMaxFloat);
        // Float max value = 3.4028235E38

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("Double min value = " + myMinDouble);
        // Double min value = 4.9E-324
        System.out.println("Double max value = " + myMaxDouble);
        // Double max value = 1.7976931348623157E308

//        int myIntValue = 5;
//        float myFloatValue = 5.24f;
//        // like L we have to add the f
//        double myDoubleValue = 5.25d;


        int myIntValue = 5 / 2;
        // gives 2
        float myFloatValue = 5f / 2f;
        // 2.5
//        double myDoubleValue = 5d / 2d;
//        // 2.5
        double myDoubleValue = 5d / 3d;
        // 1.6666666666666667

        // You can just do without d because default is double

        // same as above need to specify d
        // in real life because double is more precise and also the default,
        // it will always assume d and you usually won't need it
        // Also in real life, a lot of libraries and systems are designed to tackle doubles
        // so its actually faster sometimes

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFlatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double kilogramsToConvert = 1;
        double poundsAfterConversion = kilogramsToConvert / 0.45359237;
        System.out.println(poundsAfterConversion);

        // when you need it to be super specific and accurate, need to use BigDecimal instead because its still
        // within a margin of error E-324
    }
}
