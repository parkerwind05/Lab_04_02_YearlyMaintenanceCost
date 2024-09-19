public class Main
{
    public static void main(String[] args)
    {
        double winterMaintenanceCost = 102.50;
        double springMaintenanceCost = 62.14;
        double summerMaintenanceCost = 97.22;
        double fallMaintenanceCost = 89.83;
        double totalMaintenanceCost = winterMaintenanceCost+springMaintenanceCost+summerMaintenanceCost+fallMaintenanceCost;

        System.out.println("Your winter maintenance cost is $" + winterMaintenanceCost);
        System.out.println("Your spring maintenance cost is $" + springMaintenanceCost);
        System.out.println("Your summer maintenance cost is $" + summerMaintenanceCost);
        System.out.println("Your fall maintenance cost is $" + fallMaintenanceCost);
        System.out.println("Your total yearly maintenance cost is $" + totalMaintenanceCost);
    }
}