/**
 * Jessica Amaya
 * 2/13/2026
 * 3.4
 */
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 3.4");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Processing grades using an array");
        System.out.print("How many grades will you enter? ");
        int gradeCount = input.nextInt();
        int[] gradesArr = getGrades(gradeCount);
        int avg = averageGrades(gradesArr);
        System.out.printf("The average of the grade you entered in %d%n", avg);
        System.out.println();
        System.out.println("Processing grades using an ArrayList:");
        ArrayList<Integer> gradesList = getGrades();
        avg = averageGrades(gradesList);
        System.out.printf("The average of the grade you entered in %d%n", avg);
        // input.close();  
    }

    public static int[] getGrades(int count) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Please enter a grade: ");
            grades[i] = input.nextInt();
        }
       // input.close();
        return grades;
    }

    public static ArrayList<Integer> getGrades() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int grade = -1;
        do {
            System.out.print("Please enter a grade (-1 to quit): ");
            grade = input.nextInt();
            if(grade > 0) {
                grades.add(grade);
            }
        } while (grade > 0);
        // input.close();
        return grades;
    }

    public static int averageGrades(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }
    
    public static int averageGrades(ArrayList<Integer> grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
