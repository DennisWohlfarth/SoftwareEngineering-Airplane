public class Wings extends Airplane{

    private Engine engine;
    private EngineOilTank engineOilTank;
    private FuelTank fuelTank;


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
