class Demo4{
    public static void main(String args[]){
        final int arr[] = {1,2,3,4,5};
        int arr1[] = {11,12,13,14,15};
        
        //arr  = arr1;// error
        arr1 = arr;

        System.out.println("\nArray elements are : \n");
        for(int element : arr1){
            System.out.print(element+"\t");
        }
    }
}