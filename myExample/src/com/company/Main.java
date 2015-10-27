package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormatSymbols;
import java.util.*;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};  // enum MUST not be local

public class Main {

    public static void main(String[] args) throws IOException {
        int n1 = -15;
        System.out.println(n1 >> 2);
        System.out.println(n1 >>> 2);

        // There is no difference between definition and declaration in Java.
        double r = sqrt(PI);    // static import will be discussed in Chapter 4.
        System.out.println("The sqrt root of \u03c0 is " + r);

        long n2 = 1234567891;
        float f = n2;
        System.out.println(f);

        double d = n2;
        System.out.println(d);

        // Java does not use comma operator.

        Size s = Size.EXTRA_LARGE;
        System.out.println(s);
        String str = "Java\u2122";
        System.out.println(str);

        String greeting = "Hello";  // Java String is non-changable string
        greeting = greeting.substring(0, 3) + "p!";
        System.out.println(greeting);
        boolean b = "Hello".equalsIgnoreCase("hello");
        System.out.println(b);

        str = "";
        if (str.length() == 0)
            System.out.println(str.length());

        str = null;
        if (str != null)
            str.length();

        str = "\u2122etenghuan";
        System.out.println(str.codePointCount(0, 2));
        str.compareToIgnoreCase("etN");
        char uc = str.charAt(0);
        System.out.println(uc);

        // This will not work uncless you are in a real console
        // Console cons = System.console();
        // String username = cons.readLine("User name: ");
        // char[] passwd = cons.readPassword("Password: ");

        System.out.printf("%x\n", 123);
        System.out.printf("%tc\n", new Date());
        System.out.printf("%1$tB %1$tC\n", new Date());

        PrintWriter out = new PrintWriter("myfile.txt");
        out.println("Hello myfile.");
        out.close();

        String dir = System.getProperty("user.dir");
        System.out.println(dir);

        Scanner scan = new Scanner("Hello World\n Java\n You can I can\n I can you can");
        String s1 = scan.next();
        System.out.println(s1);
        scan.close();

//        Scanner in = new Scanner(System.in);
//        System.out.print("How many numbers do you need to draw? ");
//        int k = in.nextInt();
//
//        System.out.print("What is the highest number you can draw? ");
//        int n = in.nextInt();
//
//        BigInteger lotteryOdds = BigInteger.valueOf(1);
//
//        for (int i = 1; i <= k; i++)
//            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
//                    BigInteger.valueOf(i));
//
//        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
//
//        int[] arr = new int[100];
//        for (int i = 0; i < 100; i++)
//            arr[i] = i;
//
//        System.out.println(arr.toString());
//        String[] names = new String[10];
//        for (int i = 0; i < 10; i++)
//            names[i] = "";
        // Once an array was created, its size cannt be changed anymore, if you want to,
        // use arrlist
//        for (int i = 0; i < names.length; i++)
//            System.out.println(names[i]);
//        for (String str1 : names) {
//            System.out.println(str1);
//        }

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};

        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;
        System.out.println(smallPrimes[5]);

        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        copiedLuckyNumbers[5] = 13;
        System.out.println(luckyNumbers[5]);
        String comment = "Java数组与C++数组在堆栈上面有很大的不同，但是基本上与分配在堆（heap）上的数组指针一样";
        System.out.println(comment);

//        Scanner in = new Scanner(System.in);
//        System.out.print("How many numbers do you need to draw? ");
//        int k = in.nextInt();
//
//        System.out.print("What is the highest number you can draw? ");
//        int n = in.nextInt();

        int n = 20;
        int k = 4;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int rr = (int) (Math.random() * n);
            result[i] = numbers[rr];
            numbers[rr] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int i : result)
            System.out.println(i);

        System.out.println(Arrays.toString(result));

        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] intersetRate = new double[NYEARS];
        for (int j = 0; j < intersetRate.length; j++)
            intersetRate[j] = (STARTRATE + j) / 100.0;
        double[][] balances = new double[NYEARS][NRATES];

        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 1000;

        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i - 1][j];

                double interest = oldBalance * intersetRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        for (int j = 0; j < intersetRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * intersetRate[j]);
        }
        System.out.println();

        for (double[] row : balances) {
            for (double bb : row)
                System.out.printf("%10.2f", bb);
            System.out.println();
        }

        System.out.println(new Date());
        System.out.println(new Date().toString());

        String s3 = "一个对象变量并没有实际包含义的对象，而仅仅是引用了一个对象,局部变量不会自动初始化为null，而必须通过调用new或将它们设置为null进行初始化";
        s3 = "所以得Java对象都存储在堆中，当一个对象包含另外一个对象变量时，这个变量依然包含着指向另外一个堆对象的指针，在Java中必须使用clone方法获得完整的对象拷贝";
        Date birth = new Date();
//
//        new GregorianCalendar(1991, 11, 31);
//        new GregorianCalendar(1991, Calendar.DECEMBER, 31);
//
//        GregorianCalendar deadline = new GregorianCalendar();
//        System.out.println(deadline.toString());
//
//        GregorianCalendar now = new GregorianCalendar();
//        int month = now.get(Calendar.MONTH);
//        int weekday = now.get(Calendar.DAY_OF_WEEK);
//
//        deadline.set(Calendar.MONTH, month);
//        deadline.set(Calendar.DAY_OF_MONTH, weekday);
//        deadline.add(Calendar.MONTH, -3);
//
//        Date time = deadline.getTime();
//        System.out.println(time.toString());
//
        GregorianCalendar dd = new GregorianCalendar();
        int today = dd.get(Calendar.DAY_OF_MONTH);
        int month = dd.get(Calendar.MONTH);

        dd.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = dd.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = dd.getFirstDayOfWeek();

        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            dd.add(Calendar.DAY_OF_MONTH, -1);
            weekday = dd.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();

        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            dd.add(Calendar.DAY_OF_MONTH, 1);
            weekday = dd.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();
        for (int i = 1; i < indent; i++) System.out.print("    ");

        dd.set(Calendar.DAY_OF_MONTH, 1);
        do {
            int day = dd.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            if (day == today) System.out.print("*");
            else System.out.print(" ");

            dd.add(Calendar.DAY_OF_MONTH, 1);
            weekday = dd.get(Calendar.DAY_OF_WEEK);
            if (weekday == firstDayOfWeek) System.out.println();
        } while (dd.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek)
            System.out.println();

    }
}
