package strategyPattern.strategy;

public class SpecialDriveCapability implements DriveStrategy{
    public void drive() {
        System.out.println("Special Drive capacity");
    }
}
