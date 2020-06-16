package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 -  for 1st year\n2 - for 2nd year\n3 - for 3rd year\nEnter student year: ");
        this.year = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + "year " + year);
    }


    // constructor: prompt user to enter students name and year

    // generate an ID

    // Enroll on courses

    // view balance.

    // pay tuition

    // show status
}
