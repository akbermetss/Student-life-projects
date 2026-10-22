import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAssignmentPoints = 0;
        int assignmentCount = 0;

        double totalExamPoints = 0;
        int examCount = 0;

        boolean running = true;

        while (running) {
            System.out.println("===== SEMESTER GRADE TRACKER =====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter assignment score (0-100): ");
                double assignmentScore = scanner.nextDouble();

                if (assignmentScore < 0 || assignmentScore > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    totalAssignmentPoints += assignmentScore;
                    assignmentCount++;
                    System.out.println("Assignment score added.");
                }
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter exam score (0-100): ");
                double examScore = scanner.nextDouble();

                if (examScore < 0 || examScore > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100.");
                } else {
                    totalExamPoints += examScore;
                    examCount++;
                    System.out.println("Exam score added.");
                }
                System.out.println();
            } else if (choice == 3) {
                System.out.println("===== CURRENT RESULTS =====");

                if (assignmentCount == 0 && examCount == 0) {
                    System.out.println("No results available yet.");
                    System.out.println();
                } else {
                    double assignmentAverage = 0;
                    double examAverage = 0;
                    double overallAverage = 0;

                    if (assignmentCount > 0) {
                        assignmentAverage = totalAssignmentPoints / assignmentCount;
                        System.out.println("Assignments completed: " + assignmentCount);
                        System.out.println("Assignment average: " + assignmentAverage);
                    } else {
                        System.out.println("Assignments completed: 0");
                    }

                    if (examCount > 0) {
                        examAverage = totalExamPoints / examCount;
                        System.out.println("Exams completed: " + examCount);
                        System.out.println("Exam average: " + examAverage);
                    } else {
                        System.out.println("Exams completed: 0");
                    }

                    if (assignmentCount > 0 && examCount > 0) {
                        overallAverage = (assignmentAverage * 0.50) + (examAverage * 0.50);
                    } else if (assignmentCount > 0) {
                        overallAverage = assignmentAverage;
                    } else {
                        overallAverage = examAverage;
                    }
                    System.out.println("Overall average: " + overallAverage);

                    char grade;
                    if (overallAverage >= 90) {
                        grade = 'A';
                    } else if (overallAverage >= 80) {
                        grade = 'B';
                    } else if (overallAverage >= 70) {
                        grade = 'C';
                    } else if (overallAverage >= 60) {
                        grade = 'D';
                    } else {
                        grade = 'F';
                    }
                    System.out.println("Grade: " + grade);
                    
                    if (overallAverage >= 60) {
                        System.out.println("Status: Passing");
                    } else {
                        System.out.println("Status: Failing");
                    }
                    System.out.println();
                }
            } else if (choice == 4) {
                System.out.println("Grade tracker closed.");
                running = false;
            } else {
                System.out.println("Invalid option. Please choose between 1 and 4.");
                System.out.println();
            }
        }

        scanner.close();
    }
}
