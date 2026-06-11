package OOPs;
public class Student {
    public static void main(String[] args) {
        StudentOOPs s1=new StudentOOPs();
        StudentOOPs s2=new StudentOOPs("biswajit");
        StudentOOPs s3=new StudentOOPs(21);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}

class StudentOOPs{
    
    String name;
    int roll;

    StudentOOPs(){
        System.out.println("this is the Non-parameterized constructor");
    }
    StudentOOPs(String name){
        this.name=name;
    }
    StudentOOPs(int roll){
        this.roll=roll;
    }

}
