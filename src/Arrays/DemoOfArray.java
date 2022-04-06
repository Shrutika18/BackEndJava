package Arrays;

import java.util.Scanner;

public class DemoOfArray
{
    public static void main(String[] args)
    {
//        int[] a1;
//        int []a2;
//        int a3[];
//        //declaration of array
//
//        a1 = new int[5];
//        a2 = new int[5];
//        a3 = new int[5];
//        //instantiation of an array
//
//        a1[0] = 5;
//        a1[1] = 10;
//        a1[2] = 15;
//        a1[3] = 20;
//        a1[4] = 25;
//        //initialize an array
//
//        for (int i = 0; i <=5 ; i++)
//        {
//            System.out.println(a1[i]);
//            System.out.println(a1[4]);
//        }
//        //print/traverse array

        //declaration, instantiation, initialization of an array
//        int b1[] = {10,20,30,40,50};
//        for (int a : b1)
//        {
//            System.out.println(a);
//        }

        int[][] a1;
        int [][]a2;
        int a3[][];
        int []a4[];

        //instantiation an array
        a1 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int a5[][]= {{1,2,3},{5,6,9},{8,6,3}};
        System.out.println("Enter values");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a1[i][j] = sc.nextInt();
            }
        }

        //printing array

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
