package com.company;

public class Excersises {

    public static int addOdds(int n){
        int sum = 0;
        int count = 1;
        while (count <= n){
            sum += count;
            count += 2;
        }
        return sum;
    }



    public static int sumDigits(int x){
        int a = 0;
        int sum = 0;
        while (x >= 1){
            a = x%10;
            sum += a;
            x /= 10;
        }
        return sum;
    }


    public static int howManyYears(double startpop, double endpop){
        double x = startpop;
        int year = 0;
        while (x <= endpop){
            x *= 1.0113;
            year ++;
        }
        return year;
    }


    public static void printSum(int n){
        int x = 1;
        int sum = 0;
        while (x <= n){
                System.out.print(x + " + " );
                sum += x;
                x++;
        }
        System.out.print("= " + sum);
    }

    public static boolean isPerfectSquare(int a){
        int x = 1;
        int sqrt = 0;
        while (addOdds(x) <= a){
           x+=2;
           sqrt++;
        }
        if (sqrt*sqrt == a){
            return true;
        }
        else return false;
    }


    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("addOdds: ");
        System.out.println(addOdds(10));
        System.out.println(addOdds(5));
        System.out.println(addOdds(4));

        System.out.println(" ");
        System.out.println("sumDigits: ");

        System.out.println(sumDigits(257));
        System.out.println(sumDigits(103));
        System.out.println(sumDigits(9286));

        System.out.println(" ");
        System.out.println("howManyYears: ");

        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));

        System.out.println(" ");
        System.out.println("printSum: ");

        printSum(6);
        System.out.println(" ");
        printSum(8);
        System.out.println(" ");
        printSum(11);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("isPerfectSquare: ");

        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(11));
        System.out.println(isPerfectSquare(55));

    }
}










