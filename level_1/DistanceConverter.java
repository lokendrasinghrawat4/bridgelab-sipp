import java.util.Scanner;
class DistanceConverter{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double km;
        double conversionRate=1.6;

        System.out.print("Enter the distance in kilometers: ");
        km=input.nextDouble();

        double miles=km/conversionRate;

        System.out.println("The total miles is " +miles + " mile for the given " +km+ " km");
    }
}
