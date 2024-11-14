import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Student grades. Type '-1'  when done: ");

        while(true) {
            System.out.println("Enter grade: ");
            int grade = scanner.nextInt();
            if(grade == -1) {
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered. ");
            return;
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }

        double average = (double) total / grades.size();
        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);

        System.out.println("\nGrade Summary : ");
        System.out.printf("Average Grade : %.2f%n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}