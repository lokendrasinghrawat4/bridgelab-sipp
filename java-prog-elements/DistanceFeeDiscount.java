public class DistanceFeeDiscount{
    public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;

        int fee = 125000;
        int discountPercent = 10;
        double discountAmount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discountAmount;

        System.out.println("The distance 10.8 km in miles is " + miles);
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
