public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a, b, c, d, e;
        a = 44;
        b = 2;
        c = 5;
        d = 6;
        e = 1;
        //+obiekt . metoda
        System.out.println("Suma " + a + " + " + b + " = " + calculator.add(a, b));
        System.out.println("Suma " + a + " + " + b + " + " + c + "= " + calculator.add(a, b, c));
        System.out.println("Suma " + a + " + " + b + " + " + c + " + " + d + "= " + calculator.add(a, b, c, d));
        System.out.println("Suma " + a + " + " + b + " + " + c + " + " + d + " + " + e + " + 2 + 5 = " + calculator.add(a, b, c, d, e, 2, 5));

        System.out.println("Różnica " + a + " - " + b + " = " + calculator.sub(a, b));
        System.out.println("Różnica " + a + " - " + b + " - " + c + "= " + calculator.sub(a, b, c));
        System.out.println("Różnica " + a + " - " + b + " - " + c + " - " + d + "= " + calculator.sub(a, b, c, d));
        System.out.println("Różnica " + a + " - " + b + " - " + c + " - " + d + " - " + e + " - 11 - 51= " + calculator.sub(a, b, c, d, e, 11, 51));

        System.out.println("Dzielenie " + a + " / " + b + " = " + calculator.div(a, b));
        System.out.println("Dzielenie " + a + " / " + b + " / " + c + "= " + calculator.div(a, b, c));
        System.out.println("Dzielenie " + a + " / " + b + " / " + c + " / " + d + "= " + calculator.div(a, b, c, d));
        System.out.println("Dzielenie " + a + " / " + b + " / " + c + " / " + d + " / " + e + "= " + calculator.div(a, b, c, d, e));

        System.out.println("Mnożenie " + a + " * " + b + " = " + calculator.multi(a, b));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + "= " + calculator.multi(a, b, c));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + " * " + d + "= " + calculator.multi(a, b, c, d));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + " * " + d + " * " + e + " * 9 * 2 * 1 * -4 = " + calculator.multi(a, b, c, d, e, 9, 2, 1, -4));

        System.out.println("Mnożenie " + a + " * " + b + " = " + calculator.multi(a, b));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + "= " + calculator.multi(a, b, c));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + " * " + d + "= " + calculator.multi(a, b, c, d));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + " * " + d + " * " + e + " * 9 * 2 * 1 * -4 = " + calculator.multi(a, b, c, d, e, 9, 2, 1, -4));


        // Zadanie 3 - StudentInfo
        System.out.println("");
        System.out.println("---------- Zadanie 3 - Informacja o studentach ----------");


        char[] imie1 = {'E', 'w', 'a'};
        char[] imie2 = {'E', 'l', 'a'};
        char[] imie3 = {'P', 'a', 't'};
        char[] imie4 = {'J', 'a', 'n'};
        char[] imie5 = {'T', 'o', 'm'};

        char[] nazwisko1 = {'L', 'u', 'p', 'a'};
        char[] nazwisko2 = {'L', 'a', 't', 'o'};
        char[] nazwisko3 = {'K', 'o', 't'};
        char[] nazwisko4 = {'L', 'i', 'p', 'a'};
        char[] nazwisko5 = {'K', 'o', 's'};


        char[] email1 = {'j', 'a', 'n', '@', 'w', 'p', '.', 'p', 'l'};
        char[] email2 = {'t', 'o', 'm', '@', 'w', 'p', '.', 'p', 'l'};

        StudentInfo s1 = new StudentInfo(imie1, nazwisko1);
        StudentInfo s2 = new StudentInfo(imie2, nazwisko2);
        StudentInfo s3 = new StudentInfo(imie3, nazwisko3);
        StudentInfo s4 = new StudentInfo(imie4, nazwisko4, 25, email1, 221123);
        StudentInfo s5 = new StudentInfo(imie5, nazwisko5, 21, email2, 455699);

        s1.displayShort();
        s2.displayShort();
        s3.displayShort();
        s4.displayLong();
        s5.displayLong();
    }
}
