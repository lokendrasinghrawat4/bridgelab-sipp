import java.util.Scanner;
public class StudentFeeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter university discount percent (%): ");
        double discountPercent = scanner.nextDouble();

        // Calculating discount and final price
        double discountAmount = (fee*discountPercent)/100;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
