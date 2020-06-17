package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private  String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private  static int id = 1000;

    // constructor: prompt user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 -  for 1st year\n2 - for 2nd year\n3 - for 3rd year\nEnter student year: ");
        this.year = in.nextInt();

       setStudentId();

       System.out.println(firstName + " " + lastName + " year: " + year + " student ID: " + studentId);
    }

    // generate an ID
    private void setStudentId() {
        id++;
        this.studentId=  year + "" + id;
    }

    // Enroll on courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                this.courses = courses + "\n" + course;
                this.tuitionBalance += costOfCourse;
            } else break;
        }while (1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);

    }

    // view balance.
    public void viewBalance() {
        System.out.println("Your balance is £" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        System.out.println("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of £" + payment);
        viewBalance();
    }
    // show status
}
