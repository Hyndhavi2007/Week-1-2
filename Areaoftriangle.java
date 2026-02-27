import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the traingle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the traingle: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq In is " 
                + areaIn + 
                " and sq cm is " + areaCm);
                sc.close();
    }
}
