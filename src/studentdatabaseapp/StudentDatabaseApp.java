package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){

        //Number of student want to add
        System.out.print("Enter number of new students to enroll:");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new students
        for (int i=0 ; i<numOfStudents ; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTution();
        }

        for(int i=0 ; i<numOfStudents ; i++){
            System.out.println(students[i].showInfo());

        }
    }
}
