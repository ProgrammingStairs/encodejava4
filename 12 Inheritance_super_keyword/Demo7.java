
// class Demo7{
//     private String name;
//     public static void main(String args[]){
//         Demo7 obj = new Demo7();
//         obj.name = "Andrew Anderson";
//         System.out.println("Name : "+obj.name);
//     }
// }

// example showing the concept of getter and setter methodd along with encapsulation
class Demo{
    private String name;
    // setter method 
    public void setName(String name){
        this.name=name;
    }
    // getter method
    public String getName(){
        return name;
    }
}
class Demo7{       
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setName("Andrew Anderson");
        System.out.println("Name : "+obj.getName());
    }
}