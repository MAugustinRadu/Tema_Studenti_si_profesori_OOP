import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;


public class Main {

    private static final int MAXSTUDENTS = 50;
    private static final int MAXTEACHERS = 10;

    public static Student[] StudentsInSchool = new Student[MAXSTUDENTS];
    public static Teacher[] TeachersInSchool = new Teacher[MAXTEACHERS];

    public static void main(String[] args) {
        int tempOption;
        int teacherNumber = 0,studentNumber = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the student-teacher assistance program");
            System.out.println("Please type your preferred option");
            System.out.println("0.Quit");
            System.out.println("1.Register");
            System.out.println("2.Course information");
            System.out.println("3.Course Materials");
            System.out.println("4.Homeworks");
            System.out.println("5.Debugging");
            tempOption = input.nextInt();
            switch (tempOption) {
                case 1:
                    System.out.println("Welcome to the student-teacher register program");
                    System.out.println("Please type your family name:");
                    String tempName = input.next();
                    String name = tempName;
                    System.out.println("Please type your surname:");
                    tempName = input.next();
                    name += tempName;
                    System.out.println("Please provide a valid id:");
                    int id = input.nextInt();;
                    if (isIdValid(id)) {
                        System.out.println("Welcome teacher " + tempName + " ,you are registered now");
                        TeachersInSchool[teacherNumber] = new Teacher(tempName,id);
                        teacherNumber++;

                    }
                    else {
                        System.out.println("Welcome student " + tempName + " ,you are registered now");
                        StudentsInSchool[studentNumber] = new Student(tempName, id);
                        System.out.println("Please specify your pay status, either 1.paid scholarship or 2.reimbursed scholarship");
                        int temp = input.nextInt();
                        if (temp == 1)
                            StudentsInSchool[studentNumber].setPaidScholarship(true);
                        studentNumber++;
                    }
                    break;

                case 5:
                    int tempOption2;
                    System.out.println("Please select your preferred option");
                    System.out.println("1.List all Students then all Teachers");
                    tempOption2 = input.nextInt();
                    switch (tempOption2) {
                        case 1:
                            for (int i = 0; i < MAXSTUDENTS; i++) {
                                if (StudentsInSchool[i] != null)
                                    System.out.println("Student " + StudentsInSchool[i]);
                            }
                            for (int i = 0; i < MAXTEACHERS; i++) {
                                if (TeachersInSchool[i] != null) {
                                    System.out.println("Teacher " + TeachersInSchool[i]);
                                }
                            }
                            break;
                    }

            }

        }while (tempOption != 0);

    }

    public static boolean isIdValid (int id) {
        boolean isValid = false;
        int verification = id % 10;
        id = id / 10;
        verification += (id % 10) * 10;
        id = id / 10;
        int sum = 0;
        while (id != 0) {
            sum += id % 10;
            id = id / 10;
        }
        if (sum == verification)
            isValid = true;
        return isValid;
    }
}