import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

//        System.out.println("------Bai1------");
//        byte b;
//        String str;
//        char ch;
//        int i;
//        long l;
//        double d;
//        float f;
//        System.out.println("------Bai2------");
//        boolean flag =true;
//        System.out.println(!flag);
//        System.out.println("------Bai3------");
//        i=3;
//        l=4;
//        System.out.println("ConvertToLong----------------------");
//        long convertToLong = i;
//        System.out.println(Long.valueOf(convertToLong).getClass() );
//        System.out.println("ConvertToInt----------------------");
//        int  convertToInt =(int) l;
//        System.out.println(Integer.valueOf(convertToInt).getClass());
//        System.out.println("------Bai4------");
//        System.out.println("ConvertToChar----------------------");
//        str="abc";
//        char[] convertToChar =str.toCharArray();
//        System.out.println(convertToChar.getClass());
//        System.out.println("ConvertToString----------------------");
//        char[] ch1={'L', 'e', ' ', 'T', 'r', 'a', 'n'};
//        String convertToString= String.copyValueOf(ch1);
//        System.out.println(convertToString.getClass());
//        System.out.println("------Bai5------");
//        System.out.println("max min short");
//        System.out.println("min short: "+Short.MIN_VALUE);
//        System.out.println("min short: "+Short.MAX_VALUE);
//        System.out.println("----------------------");
//        System.out.println("max min int");
//        System.out.println("min int: "+Integer.MIN_VALUE);
//        System.out.println("min int: "+Integer.MAX_VALUE);
//        System.out.println("----------------------");
//        System.out.println("max min Long");
//        System.out.println("min long: "+Long.MIN_VALUE);
//        System.out.println("min long: "+Long.MAX_VALUE);
//        System.out.println("----------------------");
//        System.out.println("max min double");
//        System.out.println("min double: "+Double.MIN_VALUE);
//        System.out.println("min double: "+Double.MAX_VALUE);
//        System.out.println("----------------------");
//        System.out.println("max min float");
//        System.out.println("min float: "+Float.MIN_VALUE);
//        System.out.println("min float: "+Float.MAX_VALUE);
//        System.out.println(evaluate(46));
//        System.out.println("--------------");
//        System.out.println(compare(3,2));
//        System.out.println("--------------");
//        isLeapYear(2024);
//        System.out.println("--------------");
//        printEven(10);
//        System.out.println("--------------");
//        pyramid(5);
//        System.out.println("--------------");
//        int[][] a=new int[][]{{1,2},{1,2}};
//
//        int[][] b=new int[][]{{2,1},{2,1}};
//        System.out.println(Arrays.deepToString(multiMT(a,b)));
        int sum = 0;
        for (String arg:args){
            int so = Integer.parseInt(arg);
            sum+= so;
        }
        System.out.println(sum);
    }
    static String evaluate(int score){
        String result;
        if(score>=80&&score<=100)
            result="A";
        else if(score>=60&&score<80)
            result="B";
        else if(score>=40&&score<60)
            result="C";
        else if(score>=20&&score<40)
            result="D";
        else if(score>=0&&score<20)
            result="E";
        else
            result="Invalid value score";
        return result;
    }
    static int compare(int a,int b){
        if(a<b)
            return -1;
        else if(a>b)
            return 1;
        else
            return 0;
    }
    static void isLeapYear(int year)
    {
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }

    static void printEven(int n){

        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }

    }
    static  void pyramid(int n){
       int hight = n;
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static int[][] multiMT(int [][]a,int[][]b){
        int [][] result = new int[2][2];
//        result[0][0]=a[0][0]+b[0][0];
//        result[0][1]=a[0][1]+b[0][1];
//        result[1][1]=a[1][1]+b[1][1];
//        result[1][0]=a[1][0]+b[1][0];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//
//                for (int k = 0; k < 2; k++) {
//                    result = result +a * b;
//                }
//            }
//        }
        return result;

    }
}