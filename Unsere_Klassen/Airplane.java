public abstract class Airplane {

    protected HydraulicPump hydraulicPump;
    protected DelcingSystem delcingSystem;
    protected LandingLight landingLight;
    protected IceDetectorProbe iceDetectorProbe;
    protected FireDetector fireDetector;
    protected ShockSensor shockSensor;
    protected StallingSensor stallingSensor;
    protected TemeratureSensor temeratureSensor;
    protected AirflowSensor airflowSensor;
    protected TurbulentAirFlowSensor turbulentAirFlowSensor;
    protected Camera camera;


    //abstract Methods

    public abstract void startup();
    public abstract void taxi();
    public abstract void takeOff();
    public abstract void rightTurn();
    public abstract void leftTurn();

}
