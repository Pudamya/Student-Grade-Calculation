public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        for (int i=0;i<5;i++){
            students[i] = new Student("","",0,"",0);
            students[i].obtainDetails();
            System.out.println();

        }

        for (int i=0;i<5;i++){
            students[i].display();
            students[i].calculateGrade();

            System.out.println();
        }

    }
}
