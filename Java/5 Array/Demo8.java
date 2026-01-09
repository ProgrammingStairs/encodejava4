// example showing the concept of jagged array

import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows : ");
    int rows = sc.nextInt();

    int arr[][] = new int[rows][];
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter no. of columns for "+(i+1)+" rows : ");
        int col = sc.nextInt();
        arr[i] = new int[col];
        for(int j=0;j<col;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Array elements are : ");
    for(int ar[] : arr){
        for(int element : ar){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
  }
}