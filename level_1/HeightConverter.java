import java.util.Scanner;
class HeightConverter{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double heightInCm;

        System.out.print("Enter your height in centimeters: ");
        heightInCm=input.nextDouble();

        double inches=heightInCm/2.54;
        int feet=(int) inches/12;
        double remainingInches=inches%12;

        System.out.println("Your Height in cm is " +heightInCm +
                           " while in feet is " + feet + " and inches is " +remainingInches);
    }
}
