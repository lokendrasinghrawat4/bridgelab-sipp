import java.util.Scanner;
class TriangleAreaCalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base,height;

        System.out.print("Enter base of triangle (in inches): ");
        base=input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        height=input.nextDouble();

        double areaInInches=0.5*base*height;
        double areaInCm=areaInInches*6.4516; // 1 sq inch = 6.4516 sq cm

        System.out.println("Area of triangle is " + areaInInches + " square inches and " + areaInCm + " square cm");
    }
}
