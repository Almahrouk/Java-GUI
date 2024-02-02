
// package javaBasics;
import java.util.Scanner;
public class _2_Two {
    public static void main(String[] args) {
        double x=12.2;
        int y=15;
        int mark;
        for(int i=0;i<10;i+=2)
            System.out.printf(" %d",i);

        System.out.printf( "\n%4d%,6.2f\n", y, x );
        int counter = 1; // initialize counter
        do {
            System.out.printf( "%d ", counter );
            ++counter;
        } while ( counter <= 10 ); // end do...while
        System.out.println("\n");


        Scanner input = new Scanner( System.in );
        System.out.println("Enter your mark  ");
        mark = input.nextInt();
        switch (mark/10) {
            case 9:
            case 10:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println('F');
            //    break;
        }

        //////////////
        boolean a=true,b=false;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(!a);

        int w=0b1100;
        int h=0x0f;
        System.out.println(w);
        System.out.println(h);

        /////////////  Page 121 to 125 ////////////////

        String n="Hello";
        System.out.println(n);

        int[] arr;
        arr=new int[10];
        for(int i=0;i<10;i++)
            System.out.printf(" %d",arr[i]);
        System.out.println("");

        int[] arr2 ={1,5,8,-1};
        for(int i=0;i<arr2.length;i++)
            System.out.printf(" %d",arr2[i]);
        System.out.println("");

        int [] arr3;
        System.out.println("Enter array length");
        int l=input.nextInt();
        arr3 = new int[l];
        System.out.printf(" %d",arr3);

        input.close();


    }
}