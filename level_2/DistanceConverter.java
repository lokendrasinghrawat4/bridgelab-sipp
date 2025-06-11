import java.util.Scanner;
class DistanceConverter{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet:");
        double distanceInFeet=input.nextDouble();

        // Conversion
        double distanceInYards=distanceInFeet/3;
        double distanceInMiles=distanceInYards/1760;

        //result
        System.out.println("The distance in yards is " +distanceInYards + 
                           " while the distance in miles is " +distanceInMiles);
    }
}
