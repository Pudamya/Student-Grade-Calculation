import java.util.Scanner;

public class Student {
    String name;
    String email;
    int age;
    String address;
    int mark;

    Student(String name,String email,int age, String address,int mark) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.mark = mark;
    }

    public void Student(){

    }

    public void obtainDetails(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Name: ");
        this.name=sc.nextLine();

        System.out.print("Email: ");
        this.email=sc.nextLine();

        System.out.print("Age: ");
        this.age=sc.nextInt();
        sc.nextLine();

        System.out.print("Address: ");
        this.address=sc.nextLine();

        System.out.print("Mark: ");
        this.mark=sc.nextInt();


    }

    public void calculateGrade(){
        if(this.mark>=90){
            System.out.println("Grade : A");
        } else if(this.mark>=80){
            System.out.println("Grade : B");
        } else if(this.mark>=70){
            System.out.println("Grade : C");
        } else if(this.mark>=60){
            System.out.println("Grade : D");
        } else if(this.mark<60){
            System.out.println("Grade : F");
        }
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("Age: "+this.age);
        System.out.println("Address: "+this.address);
        System.out.println("Mark: "+this.mark);

    }

    public static void main(String[] args) {
        Student student = new Student("","",0,"",0);
        student.obtainDetails();
        System.out.println();

        student.display();
        student.calculateGrade();
    }







}
