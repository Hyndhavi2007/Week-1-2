import java.util.Scanner;
public class DistanceCalculationbyTakingInput {
    public static void main(String[] args) {
        double km;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance travelled : ");
        km = scanner.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        scanner.close();
    }
}
