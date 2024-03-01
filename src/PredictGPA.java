/*****************************************************************************************************************************
 * @file    PredictGPA.java
 * @brief   This program implements a program that read credit hours and expected GPA from users 4 class and calculate GPA
 * @author  Kyung mo Doh
 * @data    September 19, 2023
 ****************************************************************************************************************************/

import java.util.Scanner;  //import Scanner in the program

public class PredictGPA {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  //new scanner command program "scnr"

        int course1Hour;                //number of hours for course 1
        int course2Hour;                //number of hours for course 2
        int course3Hour;                //number of hours for course 3
        int course4Hour;                //number of hours for course 4
        String course1Grade;            //expected grade of course 1
        String course2Grade;            //expected grade of course 2
        String course3Grade;            //expected grade of course 3
        String course4Grade;            //expected grade of course 4
        double course1Number = 0.0;     //expected grade of course 1 in number
        double course2Number = 0.0;     //expected grade of course 2 in number
        double course3Number = 0.0;     //expected grade of course 3 in number
        double course4Number = 0.0;     //expected grade of course 4 in number
        double totalHour;               //total credit hour of the user
        double Gpa;                     //Actual predicted GPA

        System.out.println("Semester GPA Predictor: Let's see what you GPA could be this semester...\n");

        System.out.print("Course 1: number of hours?");
        course1Hour = scnr.nextInt();
        System.out.print("Course 1: expected grade?");
        course1Grade = scnr.next();
        System.out.print("\n");

        System.out.print("Course 2: number of hours?");
        course2Hour = scnr.nextInt();
        System.out.print("Course 2: expected grade?");
        course2Grade = scnr.next();
        System.out.print("\n");

        System.out.print("Course 3: number of hours?");
        course3Hour = scnr.nextInt();
        System.out.print("Course 3: expected grade?");
        course3Grade = scnr.next();
        System.out.print("\n");

        System.out.print("Course 4: number of hours?");
        course4Hour = scnr.nextInt();
        System.out.print("Course 4: expected grade?");
        course4Grade = scnr.next();
        System.out.print("\n");

        //assign number value to course1Number based on letter grade of course1Grade
        if(course1Grade.equals("A")){
            course1Number = 4.0;
        }
        if(course1Grade.equals("A-")){
            course1Number = 3.67;
        }
        if(course1Grade.equals("B+")){
            course1Number = 3.33;
        }
        if(course1Grade.equals("B")){
            course1Number = 3.0;
        }
        if(course1Grade.equals("B-")){
            course1Number = 2.67;
        }
        if(course1Grade.equals("C+")){
            course1Number = 2.33;
        }
        if(course1Grade.equals("C")){
            course1Number = 2.0;
        }
        if(course1Grade.equals("C-")){
            course1Number = 1.67;
        }
        if(course1Grade.equals("D+")){
            course1Number = 1.33;
        }
        if(course1Grade.equals("D")){
            course1Number = 1.0;
        }
        if(course1Grade.equals("D-")){
            course1Number = 0.67;
        }
        if(course1Grade.equals("F")){
            course1Number = 0.0;
        }

        //assign number value to course2Number based on letter grade of course2Grade
        if(course2Grade.equals("A")){
            course2Number = 4.0;
        }
        if(course2Grade.equals("A-")){
            course2Number = 3.67;
        }
        if(course2Grade.equals("B+")){
            course2Number = 3.33;
        }
        if(course2Grade.equals("B")){
            course2Number = 3.0;
        }
        if(course2Grade.equals("B-")){
            course2Number = 2.67;
        }
        if(course2Grade.equals("C+")){
            course2Number = 2.33;
        }
        if(course2Grade.equals("C")){
            course2Number = 2.0;
        }
        if(course2Grade.equals("C-")){
            course2Number = 1.67;
        }
        if(course2Grade.equals("D+")){
            course1Number = 1.33;
        }
        if(course2Grade.equals("D")){
            course1Number = 1.0;
        }
        if(course2Grade.equals("D-")){
            course1Number = 0.67;
        }
        if(course2Grade.equals("F")){
            course1Number = 0.0;
        }

        //assign number value to course3Number based on letter grade of course3Grade
        if(course3Grade.equals("A")){
            course3Number = 4.0;
        }
        if(course3Grade.equals("A-")){
            course3Number = 3.67;
        }
        if(course3Grade.equals("B+")){
            course3Number = 3.33;
        }
        if(course3Grade.equals("B")){
            course3Number = 3.0;
        }
        if(course3Grade.equals("B-")){
            course3Number = 2.67;
        }
        if(course3Grade.equals("C+")){
            course3Number = 2.33;
        }
        if(course3Grade.equals("C")){
            course3Number = 2.0;
        }
        if(course3Grade.equals("C-")){
            course3Number = 1.67;
        }
        if(course3Grade.equals("D+")){
            course3Number = 1.33;
        }
        if(course3Grade.equals("D")){
            course3Number = 1.0;
        }
        if(course3Grade.equals("D-")){
            course3Number = 0.67;
        }
        if(course3Grade.equals("F")){
            course3Number = 0.0;
        }

        //assign number value to course4Number based on letter grade of course4Grade
        if(course4Grade.equals("A")){
            course4Number = 4.0;
        }
        if(course4Grade.equals("A-")){
            course4Number = 3.67;
        }
        if(course4Grade.equals("B+")){
            course4Number = 3.33;
        }
        if(course4Grade.equals("B")){
            course4Number = 3.0;
        }
        if(course4Grade.equals("B-")){
            course4Number = 2.67;
        }
        if(course4Grade.equals("C+")){
            course4Number = 2.33;
        }
        if(course4Grade.equals("C")){
            course4Number = 2.0;
        }
        if(course4Grade.equals("C-")){
            course4Number = 1.67;
        }
        if(course4Grade.equals("D+")){
            course4Number = 1.33;
        }
        if(course4Grade.equals("D")){
            course4Number = 1.0;
        }
        if(course4Grade.equals("D-")){
            course4Number = 0.67;
        }
        if(course4Grade.equals("F")){
            course4Number = 0.0;
        }

        totalHour = course1Hour + course2Hour + course3Hour + course4Hour;
        Gpa = (course1Number*course1Hour + course2Number*course2Hour + course3Number*course3Hour + course4Number*course4Hour)/totalHour;

        System.out.print("Your semester GPA would be: ");
        System.out.printf("%.4f", Gpa);
    }
}


