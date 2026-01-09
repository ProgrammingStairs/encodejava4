// example showing the concept of toString() 

class Student{
    int sid;
    String name;
    Student(int sid,String name){
        this.sid=sid;
        this.name=name;
    }
    @Override
    public String toString(){
        return "{ name : "+name+", sid : "+sid+" }";
    }
}
class Demo1{
    public static void main(String args[]){
        Student stud = new Student(123,"Andrew Anderson");
        System.out.println(stud);
        System.out.println(stud.toString());
    }
}