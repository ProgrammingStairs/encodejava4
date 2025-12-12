// example showing the concept of exception handling

class Demo5{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        String name = "Andrew";

         try{
            System.out.println("arr[2] : "+arr[20]);
            System.out.println("name.charAt(2) : "+name.charAt(2));
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception : "+e1.getMessage());
        }
        catch(StringIndexOutOfBoundsException e2){
            System.out.println("Exception : "+e2.getMessage());
        }   
        System.out.println("end of program");
    }
}