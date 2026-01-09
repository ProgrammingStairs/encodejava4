// example showing the concept of switch control statement

class Demo11{
    public static void main(String args[]){
       int num=10,i=1; 
       switch(i++){
            case -2 : num++;
                        break;
            case 1 : ++num; // 11
            case -3 : --num; // 10
            case 3 : --num; // 9
            default : System.out.println("Num : "+num); // 9
                    break;
       }
    }
}