import java.util.Scanner;
public class Feeinput {
   public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the university fee: ");
        double fee = scanner.nextDouble();
        System.out.print("Enter the discout percent: ");
        double discountPercent = scanner.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
                scanner.close();
    }
}

