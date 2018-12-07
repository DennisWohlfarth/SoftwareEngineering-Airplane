public abstract class Airplane {

    protected HydraulicPump hydraulicPump;
    protected DelcingSystem delcingSystem;

    //abstract Methods

    public abstract void startup();
    public abstract void taxi();
    public abstract void takeOff();
    public abstract void rightTurn();
    public abstract void leftTurn();

}
