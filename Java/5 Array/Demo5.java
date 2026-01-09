// example to add two 2d array

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int arr3[][] = new int[r][c];

        System.out.println("Enter elements of first array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements of first array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Array elements of second array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Resultant Array elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
   }
}