package guru.qa;

public class JavaBasicsLesson {
    public static void main(String[] args) {
        // 0) арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("арифметических операций ( + , -, * , /) над двумя примитивами типа int");
        int a = 5;
        int b = 2;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        // арифметических операций над int и double
        System.out.println("арифметических операций над int и double");
        int c = 5;
        double d = 2.5;

        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));

        // логических операций ( < , >, >=, <= )
        System.out.println("логических операций ( < , >, >=, <= ) ");
        int x = 5;
        int y = 10;

        System.out.println(x + " < " + y + " = " + (x < y));
        System.out.println(x + " > " + y + " = " + (x > y));
        System.out.println(x + " >= " + y + " = " + (x >= y));
        System.out.println(x + " <= " + y + " = " + (x <= y));
        System.out.println(x + " == " + y + " = " + (x == y));
        System.out.println(x + " != " + y + " = " + (x != y));

        // диапазоны типов данных для вещественных / чисел с плавающей точкой
        System.out.println("диапазоны типов данных для вещественных / чисел с плавающей точкой");
        System.out.println("float:");
        System.out.println("  Максимум: " + Float.MAX_VALUE);
        System.out.println("  Минимум: " + Float.MIN_VALUE);
        System.out.println("double:");
        System.out.println("  Максимум: " + Double.MAX_VALUE);
        System.out.println("  Минимум: " + Double.MIN_VALUE);

        // переполнение при арифметической операции
        System.out.println("переполнение при арифметической операции");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Максимальный int: " + maxInt);
        System.out.println("maxInt + 1 = " + (maxInt + 1)); // переполнение!

        int minInt = Integer.MIN_VALUE;
        System.out.println("Минимальный int: " + minInt);
        System.out.println("minInt - 1 = " + (minInt - 1)); // переполнение!
    }
}
