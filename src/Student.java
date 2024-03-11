import java.util.Arrays;
import java.util.Scanner;
public class Student {

    static int TotalStudents;
    static long unique_number = 8723428346L;
    long roll_number;
    String Name_Surname;
    double[] Marks = new double[5];
    String[] courseNames = new String[5];
    //The constructor named 'Student' for incrementing roll number by one
    public Student() {
        roll_number = unique_number++;
        Name_Surname="";
        Arrays.fill(Marks, 0.0d);
        TotalStudents++;
    }
    //Input Function
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nName and Surname: " + Name_Surname);
        System.out.println("Enter names for the 5 courses:");
        System.out.println("Enter marks for the courses (between 0 and 100)\n(if you are using the most recent java and if the value is float use ',' instead of '.')\n(if you are using older java versions use '.' instead of ',' )");
        for (int i = 0; i < Marks.length; i++) {
            boolean isValid = false;
            System.out.print("Course " + (i + 1) + ": ");
            courseNames[i] = scanner.nextLine();
            do {
                System.out.print(courseNames[i] + ": ");
                float inputMark = scanner.nextFloat();
                /*
                I have to add the empty scanner.nextLine code below because we are using
                nextFloat before nextLine. So it is not able to read the input because of
                the feature of nextFloat which is not getting the cursor of scanner to the
                next line. So we have to use this for taking the cursor to the nextLine.
                With this method input commands will execute correctly all the time.
                */
                scanner.nextLine();
                if (inputMark >= 0 && inputMark <= 100) {
                    Marks[i] = inputMark;
                    isValid = true;
                } else {
                    System.out.println("Error: Invalid input. Please enter a value between 0 and 100.");
                }
            } while (!isValid);
        }
        if(TotalStudents==3){
            scanner.close();
        }
    }

    // Show Function
    public void Show() {
        for (int i = 0; i<25;i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Name and Surname: " + Name_Surname);
        System.out.println("Marks: ");
        for (int i = 0; i < Marks.length; i++) {
            System.out.println(courseNames[i] + ": " + Marks[i]);
        }
        for (int i = 0; i<25;i++){
            System.out.print("-");
        }
    }
    /*
    TotalStudents Function is used for printing total number of students
    for each student object that is created
    */
    public static void TotalStudents()
    {
        System.out.println("Total number of students: " + TotalStudents);
    }

    // TotalMarks Function
    public double TotalMarks() {
        double total = 0.0d;
        for (double mark : Marks) {
            total += mark;
        }
        return total;
    }

    // getHighest Function
    public double getHighest() {
        double highest = Marks[0];
        for (double mark : Marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // getLowest Function
    public double getLowest() {
        double lowest = Marks[0];
        for (double mark : Marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

    // getAverage Function
    public double getAverage() {
        double total = TotalMarks();
        return total / (double) Marks.length;
    }

    // getPassCount Function
    public int getPassCount() {
        int passCount = 0;
        for (double mark : Marks) {
            if (mark >= 50 && mark <= 100) {
                passCount++;
            }
        }
        return passCount;
    }
    // My shortcut function for repeating codes
    public void Display(){
        System.out.println();
        System.out.println("Total Marks: " + TotalMarks());
        System.out.println("Highest Mark: " + getHighest());
        System.out.println("Lowest Mark: " + getLowest());
        System.out.println("Average Mark: " + getAverage());
        System.out.println("Courses Passed: " + getPassCount());
        TotalStudents();
        for (int i = 0; i<25;i++){
            System.out.print("-");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.Name_Surname = "Burak Aksoy";
        student1.Input();
        student1.Show();
        student1.Display();

        Student student2 = new Student();
        student2.Name_Surname = "Shay Cormac";
        student2.Input();
        student2.Show();
        student2.Display();

        Student student3 = new Student();
        student3.Name_Surname = "Haytham Kenway";
        student3.Input();
        student3.Show();
        student3.Display();
    }
}