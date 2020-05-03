// // ++i - сразу присвоит в данной строке   i++ - в начале вывод 0(любое число) а только затем присвоит 1


import java.util.Scanner;

class Fibonacci {


    public static long fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        return fibonacci(n-2) + fibonacci(n-1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = in.nextInt();

        System.out.println(fibonacci(x));



    }
}



// fibonacci(n) = 0;
// fibonacci(1) = 1;
// fibonacci(2) = 1;
// fibonacci(3) = 2;
// fibonacci(4) = 3;
// fibonacci(5) = 5;
// fibonacci(6) = 8;






//        for(int i = 0; i < 50; i++) {
//            System.out.println(fibonacci(i));
//        }


