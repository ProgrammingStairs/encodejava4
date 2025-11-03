// example showing the concept of jagged array

class Demo7{
    public static void main(String args[]){
    int arr[][] = new int[5][];
    arr[0] = new int[]{1,2,3,4};
    arr[1] = new int[]{3,4};
    arr[2] = new int[]{56,67,1,2,3,4};
    arr[3] = new int[]{1,4};
    arr[4] = new int[]{1,3,4,6,7,8};
        
    System.out.println("Array elements are : ");
    for(int ar[] : arr){
        for(int element : ar){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
  }
}