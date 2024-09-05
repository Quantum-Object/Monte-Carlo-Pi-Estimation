import java.util.Scanner;

public class MonteCarloPi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int totalPoints = scanner.nextInt();
        int insideCircle = 0;

        for (int i = 0; i < totalPoints; i++) {
            double x = Math.random();
            double y = Math.random();

            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        double piEstimate = 4.0 * insideCircle / totalPoints;
        System.out.println("Estimated value of Pi: " + piEstimate);
        scanner.close();
    }
}