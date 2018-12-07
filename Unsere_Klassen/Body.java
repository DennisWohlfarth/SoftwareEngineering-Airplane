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
    private AntiCollisionLight antiCollisionLight;
    private CargoCompartmentLight cargoCompartmentLight;
    private LogoLight logoLight;
    private TailNavigationLight tailNavigationLight;
    private TaxiLight taxiLight;
    private TCASLight tcasLight;
    private Elevator elevator;
    private Rudder rudder;
    private OxygenSensor oxygenSensor;
    private PilotTube pilotTube;
    private RadarAltimeter radarAltimeter;
    private TCAS tcas;
    private GPS gps;
    private Radar radar;
    private SatCom satCom;
    private VHF vhf;
    private CargoSystem cargoSystem;
    private StowageNumberFive stowageNumberFive;
    private CostOptimizer costOptimizer;
    private RouteManagement routeManagement;
    private SeatManagement seatManagement;

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
