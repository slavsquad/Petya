package com.company;

import java.util.Scanner;

public class Route {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int INF = 1111111111;
        int distanceArr[] = new[n];


        int arrX [] = new int[n];
        int arrY [] = new int[n];

        for (int i=0;i<n;i++)
        {
            arrX[i] = scan.nextInt();
            arrY[i] = scan.nextInt();
        }

        int k = scan.nextInt();
        int start = scan.nextInt()-1;
        int end = scan.nextInt()-1;

        distanceArr[start] = 0;



        int result=0;
        int stop = start;
        int countRoads=0;

        int weightMatrix[][] = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                result = Math.abs(arrX[i]-arrX[j])+Math.abs(arrY[i]-arrY[j]);
                if (result>k) {
                    weightMatrix[i][j]=0;
                } else {
                    weightMatrix[i][j]=result;
                }
            }
        }

//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                System.out.print(" "+weightMatrix[i][j]);
//            }
//            System.out.println(" ");
//        }


        for (int i =0;i<n;i++){
            distanceArr[i] = 0;
            
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){

            }
        }

    }
}
