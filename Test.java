import java.math.BigInteger;
import java.util.Scanner;

public class Test {

    // hasNext 是检查是否有非空字符。
    // hasNextLine 是检查输入中是否还有 linePattern。
    // 其中 LinePattern 其实是匹配一个正则表达式(例如 '\0')。

    public static void main1(String[] args) {
        int x = 20;
        int y = 30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || y < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b); // false
    }

    /*abstract class Animal {
        abstract void say;
    }
    public class Cat extand Animal {
        public Cat() {
            System.out.println("Cat");
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
        }
    }*/

    public static void main2(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                d();
            }
        };
        t.run();
        System.out.println("dd");
    }
    static void d() {
        System.out.println("d");
    }

    public static void main3(String[] args) {
        int i = 0;
        for(out('A'); out('B') && (i < 2); out('C')) {
            i++;
            out('D');
        }
    }
    static boolean out(char c) {
        System.out.println(c);
        // A B D C B D C B
        return true;
    }
}

class Main {

    public static void main4(String[] args) {
        /*
        * 跟奥巴马一起编程
        * 题目描述
        * 美国***奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的***。
        * 2014年底，为庆祝“计算机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。
        * 现在你也跟他一起画吧！

        * 输入在一行中给出正方形边长 N（3 <= N <= 20）和组成正方形边的某种字符 C，间隔一个空格。
        * 输出由给定字符C画出的正方形(空心)。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的
        * 行数实际上是列数的50%（四舍五入取整）。
         *
        * 输入例子:
        * 10 a
        * 输出例子:
        * aaaaaaaaaa
        * a        a
        * a        a
        * a        a
        * aaaaaaaaaa
         * */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int tmp = n / 2;
        if (n % 2 != 0) {
            tmp = (n / 2) + 1;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(str);
        }
        System.out.println();
        for (int j = 2; j < tmp; j++) {
            for (int i = 1; i <= n; i++) {
                if (i == 1 || i == n) {
                    System.out.print(str);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(str);
        }
    }

    public static void main(String[] args) {

        // 请设计一个算法完成两个超长正整数的加法
        // 输入:
        // a: 3333333333333333333333333333
        // b: 3333333333333333333333333333
        // 输出:
        //    6666666666666666666666666666

        // java.math.BigInteger
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());

            // add(BigInteger val)
            // 返回值为 (this + val)
            System.out.println(a.add(b));
        }
    }
}