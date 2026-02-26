public class JavaGuru40 {

    public static void main(String... args) {
        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 15;
        int b = 67;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a*b);
        System.out.println(a/b);

        //применить несколько арифметических операций над int и double в одном выражении
        int c = 14;
        double d = 67.4;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);

        // применить несколько логических операций ( < , >, >=, <= )
        int e = 5;
        int f = 7;
        System.out.println(e==f);
        System.out.println(e>f);
        System.out.println(e!=f);

        // получить переполнение при арифметической операции
        int g = Integer.MAX_VALUE;
        System.out.println(g);
        System.out.println(g * 3);
    }
}

