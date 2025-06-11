import java.util.Scanner;
class TriangleArea{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base in cm:");
        double base=input.nextDouble();

        System.out.print("Enter the height in cm:");
        double height=input.nextDouble();

        // Area calculation
        double areaInCm=0.5*base*height;
        double areaInInches=areaInCm/(2.54*2.54);

        //result show
        System.out.println("The Area of the triangle in sq in is " +areaInInches+
                           " and sq cm is " + areaInCm);
    }
}
