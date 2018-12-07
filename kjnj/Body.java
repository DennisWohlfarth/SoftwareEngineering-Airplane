public class Body extends Airplane {

    private APU apu;
    private Gear gear;
    private AirConditioning airConditioning;
    private Kitchen kitchen;
    private Lavatory lavatory;
    private Wastesystem wastesystem;
    private Watersystem watersystem;
    private EscapeSlide escapeSlide;
    private BulkCargoDoor bulkCargoDoor;
    private CrewDoor crewDoor;
    private EmergencyExitDoor emergencyExitDoor;
    private GearDoor gearDoor;
    private FirstClassSeat firstClassSeat;
    private BusinessClassSeat businessClassSeat;
    private TouristClassSeat touristClassSeat;
    private CrewSeat crewSeat;
    private APUOilTank apuOilTank;
    private Battery battery;
    private NitrogenBottle nitrogenBottle;
    private OxygenBottle oxygenBottle;
    private PotableWaterTank potableWaterTank;
    private WasteWaterTank wasteWaterTank;
    private FireExtinguisher fireExtinguisher;
    private

    public void startup()
    {
        apu.start();
        hydraulicPump.compress();
    }
    public void taxi()
    {
        gear.releaseBreak();
    }
    public void takeOff()
    {

    }
    public void rightTurn()
    {

    }
    public void leftTurn()
    {

    }
}
