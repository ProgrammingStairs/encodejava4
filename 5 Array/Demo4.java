// example showing the concept of binary search

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int first = 0;
        int last = size-1;
        int middle = (first+last)/2;    
        System.out.println("Enter array elements : ");        
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");        
        for(int element : arr){
            System.out.print(element+"\t");
        }
        System.out.println("Enter element to be search : ");
        int search = sc.nextInt();
        while(first<=last){
            if(arr[middle]<search)
                first = middle+1;
            else if(arr[middle]==search){
                System.out.println("Element found at position : "+(middle+1));
                break;
            }
            else 
                last = middle-1;
            middle = (first+last)/2;
        }
        if(first>last)
            System.out.println("Element not found");
    }
}