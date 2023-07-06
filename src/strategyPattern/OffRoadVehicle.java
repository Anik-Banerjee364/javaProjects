package strategyPattern;
// import strategyPattern.strategy.DriveStrategy;
import strategyPattern.strategy.SpecialDriveCapability;


public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SpecialDriveCapability());
    }
}
