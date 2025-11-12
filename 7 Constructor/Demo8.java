// example showing the concept of constructor
// Deep copy

class Address{
    String state,city;
    Address(String state,String city){
        this.state=state;
        this.city=city;
    }
    Address(Address address){
        this.state = address.state;
        this.city = address.city;
    }
}
class Student{
    int rno;
    String name;
    Address address;
    Student(int rno,String name,Address address){
        this.rno=rno;
        this.name=name;
        this.address=address;
    }    
    Student(Student obj1){
        this.rno=obj1.rno;
        this.name=obj1.name;
        this.address = new Address(obj1.address);
    }
}
class Demo8{
    public static void main(String args[]){
        Address address = new Address("Madhya Pradesh" , "Indore");
        Student obj1 = new Student(101,"Andrew Anderson",address);
        Student obj2 = new Student(obj1); 

        obj2.address.state = "Delhi";

        System.out.println("obj1 details : ");
        System.out.println("Roll Number : "+obj1.rno);
        System.out.println("Name : "+obj1.name);
        System.out.println("Address : \n\tstate : "+obj1.address.state+"\n\tcity : "+obj1.address.city);

        System.out.println("\nAfter Copying : \nobj2 details : ");
        System.out.println("Roll Number : "+obj2.rno);
        System.out.println("Name : "+obj2.name);
        System.out.println("Address : \n\tstate : "+obj2.address.state+"\n\tcity : "+obj2.address.city);

    }
}