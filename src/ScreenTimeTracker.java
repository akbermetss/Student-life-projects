import java.util.Scanner;
public class ScreenTimeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int socialMediaTime = 0;
        int gamingTime = 0;
        int studyingTime = 0;
        int streamingTime = 0;
        int totalScreenTime = 0;
        int recordedSessions = 0;

        boolean running = true;

        while (running) {
            System.out.println("===== SCREEN-TIME TRACKER =====");
            System.out.println("1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter social media minutes: ");
                int minutes = scanner.nextInt();
                if (minutes <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    socialMediaTime += minutes;
                    totalScreenTime += minutes;
                    recordedSessions++;
                    System.out.println("Time added successfully!");
                }
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter gaming minutes: ");
                int minutes = scanner.nextInt();
                if (minutes <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    gamingTime += minutes;
                    totalScreenTime += minutes;
                    recordedSessions++;
                    System.out.println("Time added successfully!");
                }
                System.out.println();
            } else if (choice == 3) {
                System.out.print("Enter studying minutes: ");
                int minutes = scanner.nextInt();
                if (minutes <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    studyingTime += minutes;
                    totalScreenTime += minutes;
                    recordedSessions++;
                    System.out.println("Time added successfully!");
                }
                System.out.println();
            } else if (choice == 4) {
                System.out.print("Enter streaming minutes: ");
                int minutes = scanner.nextInt();
                if (minutes <= 0) {
                    System.out.println("Invalid time. Minutes must be greater than 0.");
                } else {
                    streamingTime += minutes;
                    totalScreenTime += minutes;
                    recordedSessions++;
                    System.out.println("Time added successfully!");
                }
                System.out.println();
            } else if (choice == 5) {
                System.out.println("===== TODAY'S SCREEN TIME =====");
                System.out.println("Social media: " + socialMediaTime + " minutes");
                System.out.println("Gaming: " + gamingTime + " minutes");
                System.out.println("Studying: " + studyingTime + " minutes");
                System.out.println("Streaming: " + streamingTime + " minutes");
                System.out.println("Total screen time: " + totalScreenTime + " minutes");
                System.out.println("Recorded sessions: " + recordedSessions);

                int entertainmentTime = socialMediaTime + gamingTime + streamingTime;

                if (studyingTime > entertainmentTime) {
                    System.out.println("Study screen time is greater than entertainment screen time. Good balance!");
                } else if (entertainmentTime > studyingTime) {
                    System.out.println("Entertainment screen time is greater than study time.");
                } else {
                    System.out.println("Study and entertainment screen time are equal.");
                }
                if (totalScreenTime < 120) {
                    System.out.println("Low screen time");
                } else if (totalScreenTime <= 240) {
                    System.out.println("Moderate screen time");
                } else {
                    System.out.println("High screen time");
                }
                System.out.println();
            } else if (choice == 6) {
                System.out.println("Screen-time tracker closed.");
                running = false;
            } else {
                System.out.println("Invalid option. Please choose between 1 and 6.");
                System.out.println();
            }
        }

        scanner.close();
    }
}
