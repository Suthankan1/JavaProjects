package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor: prompt user to enter name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("1. First Year\n2. Second Year\n3. Third Year\n4. Final Year");
        System.out.print("Enter the code: ");
        this.gradeYear = scanner.nextInt();
        setStudentID();

    }

    //Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in course
    public void enroll(){
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n    " + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (true);
    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: Rs." + tutionBalance);
    }

    //Pay fee
    public void payTution(){
        viewBalance();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your payment: ");
        int payment = scanner.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("PAID. Rs. " + payment + "\nThanks you for your payment");
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: " + firstName + " " +lastName +
                "\nCourses Entrolled: " + courses +
                "\nBalance: Rs." + tutionBalance;
    }

}
