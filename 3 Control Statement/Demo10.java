// example showing the concept of switch control statement

class Demo10{
    public static void main(String args[]){
       char ch = 'a';
       switch(ch){
            case 'a' : System.out.println("statement 1");
                    break;
            // case 97 : System.out.println("statement 2");
            //         break;
            case 98 : System.out.println("statement 3");
                    break;
            default : System.out.println("Invalid statement");
                    break;
       }
    }
}