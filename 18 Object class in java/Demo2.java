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
    @Override
    public int hashCode(){
        return sid; 
    }
}
class Demo2{
    public static void main(String args[]){
        Student stud = new Student(123,"Andrew Anderson");
        System.out.println(stud+"\nhashCode : "+stud.hashCode());
        Student studNew = new Student(124,"Peter Parker");
        System.out.println(studNew+"\nhashCode : "+studNew.hashCode());
    }
}