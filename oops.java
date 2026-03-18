class Pen{
    String color;
    String type;
    public void writen(){
        System.out.println("writing something");
    }
    public void printColor() {
        System.out.println(this.color);
        
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(age);
    }
    Student() {
        System.out.println("constructor called");
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
     Student(Student s3 ){  //copy constructor
        this.name = s3 .name;
        this.age = s3 .age;
    }
     //polymorphism

    public void printInfo(String name) {
        System.out.println(name);
    }
      public void printInfo(int age) {
        System.out.println(age);
    }
  public void printInfo(String name , int age) {
        System.out.println(name + " "+ age);
    }

    
}
public class oops {
   public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "gel";

    Pen pen2 = new Pen();
    pen2.color = "black";
    pen2.type = "ballpoint";

    pen1.printColor();
    pen2.printColor();


    Student s1 = new Student();
    s1.name = "Ananya";
    s1.age = 22;

    s1.printInfo();

    Student s2 = new Student("mahak",21);
    s2.printInfo();

 Student s3 = new Student(s2);
    s3.printInfo();

  s1.printInfo(s1.name,s1.age);

   } 
}