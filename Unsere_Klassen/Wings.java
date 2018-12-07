public class Wings extends Airplane{

    private Engine engine;
    private EngineOilTank engineOilTank;
    private FuelTank fuelTank;
    private LeftNavigationLight leftNavigationLight;
    private RightNavigationLight rightNavigationLight;
    private DroopNose droopNose;
    private Flap flap;
    private Slat slat;
    private LeftAileron leftAileron;
    private RightAileron rightAileron;
    private Spoiler spoiler;
    private ExhaustGasTemeratureSensor exhaustGasTemeratureSensor;
    private FuelFlowSensor fuelFlowSensor;
    private FuelSensor fuelSensor;


    public void startup()
    {
        engine.start();
        hydraulicPump.compress();
    }
    public void taxi()
    {

    }
    public void takeOff()
    {

    }
    public void rightTurn()
    {

    }
    public void leftTurn()
    {
//
    }
}
