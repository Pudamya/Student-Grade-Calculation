import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.jar.JarOutputStream;


public class Menu {
    public static void main(String[] args) {
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        Student[] students = null;
        int count=0;

        System.out.println("~~~~~~~~~~~ Student Grade Calculation ~~~~~~~~~~~");
        System.out.println();
        System.out.println(" Welcome to the Grade Calculation System");
        while (exit) {
            System.out.println();
            System.out.println(" ***** Menu *****");
            System.out.println();
            System.out.println("1. Input data for students.");
            System.out.println("2. Calculate and display the grade & student for students.");
            System.out.println("3. Exit the program.");
            System.out.println();


            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("*** Input data for students ***");
                    System.out.println();
                    System.out.print("How many students do you want to input? ");
                    count = sc.nextInt();
                    System.out.println();
                    students = new Student[count];
//
                    if (count>0) {


                        for (int i = 0; i < count; i++) {
                            students[i] = new Student("", "", 0, "", 0);
                            students[i].obtainDetails();
                            System.out.println();
                        }
                    }else if (count<=0) {
                        System.out.println("You didn't enter any students!");
                    }
                    break;
                case 2:
                    System.out.println("*** Calculate and display the grade & student for students ***");
                    System.out.println();
                    if (count>0) {
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                            students[i].calculateGrade();

                            System.out.println();
                        }
                    }else if (count<=0) {
                        System.out.println("No any student records entered.");
                    }
                    break;
                case 3:
                    exit = false;
                    System.out.println("______Existed_____");
                    System.out.println();
                    System.out.println("*** Thank you *** ");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");


            }


        }


    }
}



