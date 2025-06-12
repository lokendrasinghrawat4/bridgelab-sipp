public class EarthVolume{
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Conversion: 1 mile = 1.609 km => 1 cubic mile = (1.609)^3 cubic km
        double kmToMileFactor = Math.pow(1.609, 3);
        double volumeMiles3 = volumeKm3 / kmToMileFactor;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3);
    }
}
